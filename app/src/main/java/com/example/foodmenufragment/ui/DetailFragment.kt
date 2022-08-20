package com.example.foodmenufragment.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.foodmenufragment.R

class DetailFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val resDetail = view.findViewById<TextView>(R.id.resDetail)
        val imageDetail = view.findViewById<ImageView>(R.id.imageDetail)
        val descriptionDetail = view.findViewById<TextView>(R.id.descriptionDetail)

        val name = requireArguments().getInt("res")
        val image = requireArguments().getInt("image")
        val details = requireArguments().getInt("details")

        resDetail.setText(name)
        imageDetail.setImageResource(image)
        descriptionDetail.setText(details)

    }

}