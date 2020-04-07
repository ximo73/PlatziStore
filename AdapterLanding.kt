package com.example.platzistore

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_landing.view.*

class AdapterLanding ( val data: List<ItemLanding?>?): RecyclerView.Adapter<AdapterLanding.Holder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder =
        Holder(parent?.inflate(R.layout.item_landing))

    override fun onBindViewHolder(holder: Holder, position: Int) {
        data?.let {
            holder?.bindView(it[position])
        }
    }

    override fun getItemCount(): Int = data?.size   ?:0


    class Holder(itemView: View):RecyclerView.ViewHolder(itemView){             //itemView fue declarado en la clase
        fun bindView(itemLanding: ItemLanding?){
            itemLanding?.let {
                with(it){
                    itemView.txtTitleItem.text = title
                    itemView.txtDescItem.text = desc
                    itemView.txtPriceItem.text = "$ ${String.format("%.2f", price)}"        //%.2f = 2 numeros despues de la coma
                }
            }
        }
    }
}