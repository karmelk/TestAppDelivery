package com.kmwork.testappdelivery.fragment.stops.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kmwork.entities.StopsModelDB
import com.kmwork.testappdelivery.R

class StopsAdapter(val navigate: () -> Unit, val finish: () -> Unit) :
    RecyclerView.Adapter<StopsAdapter.MyViewHolder>() {
    private var itemList: MutableList<StopsModelDB> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder = MyViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_stops, parent, false)
    )
    override fun getItemCount(): Int = itemList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       holder.bindItem(itemList[position])
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItem(item: StopsModelDB) {
            with(itemView) {
                itemView.setOnClickListener { }
            }
        }
    }
}