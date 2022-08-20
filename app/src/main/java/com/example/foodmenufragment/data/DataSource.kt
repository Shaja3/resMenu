package com.example.foodmenufragment.data

import com.example.foodmenufragment.model.Res
import com.example.foodmenufragment.R

class DataSource {

    fun loadResMenu() : List<Res>{
        return listOf(
            Res( R.string.beans, R.drawable.beans, R.string.beans_detail ),
            Res( R.string.beans_plantain, R.drawable.beans_plantain, R.string.beans_plantain_detail ),
            Res( R.string.brown_rice, R.drawable.brown_rice, R.string.brown_rice_detail ),
            Res( R.string.custard, R.drawable.custard, R.string.custard_detail ),
            Res( R.string.egusi_soup, R.drawable.egusi_soup, R.string.egusi_soup_detail ),
            Res( R.string.fried_rice, R.drawable.fried_rice, R.string.fried_rice_detail ),
            Res( R.string.jollof_rice, R.drawable.jollof_rice, R.string.jollof_rice_detail ),
            Res( R.string.ofada_and_sauce, R.drawable.ofada_and_sauce, R.string.ofada_and_sauce_detail ),
            Res( R.string.ofada_and_stew, R.drawable.ofada_and_stew, R.string.ofada_and_stew_detail ),
            Res( R.string.oziza_soup, R.drawable.oziza_soup, R.string.oziza_soup_detail ),
            Res( R.string.pap, R.drawable.pap, R.string.pap_detail ),
            Res( R.string.steamed_rice, R.drawable.steamed_rice, R.string.steamed_rice_detail ),
            Res( R.string.tea_and_sandwich, R.drawable.tea_and_sandwich, R.string.tea_and_sandwich_detail ),
            Res( R.string.vegie_fried_rice, R.drawable.vegie_fried_rice, R.string.vegie_fried_rice_detail ),
            Res( R.string.yam_and_sauce, R.drawable.yam_and_sauce, R.string.yam_and_sauce_detail )
        )
    }

}