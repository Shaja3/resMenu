package com.example.foodmenufragment.adapter

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.foodmenufragment.model.Res
import com.example.foodmenufragment.R

class ItemAdapter ( private val context: Context, private val resMenu: List<Res> ) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder ( private val view : View ) : RecyclerView.ViewHolder(view) {
        val resName : TextView = view.findViewById(R.id.menuRes)
        val resImage : ImageView = view.findViewById(R.id.menuImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = resMenu[position]
        holder.resName.text = context.resources.getString(item.resResourceId)
        holder.resImage.setImageResource(item.imageResourceId)

        holder.itemView.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("res", item.resResourceId)
            bundle.putInt("image", item.imageResourceId)
            bundle.putInt("details", item.detailsResourceId)

            holder.itemView.findNavController().navigate(R.id.action_menuFragment_to_detailFragment, bundle)
        }
    }

    override fun getItemCount(): Int {
        return resMenu.size
    }
}