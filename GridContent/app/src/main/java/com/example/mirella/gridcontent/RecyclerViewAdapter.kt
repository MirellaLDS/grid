package com.example.mirella.gridcontent

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class RecyclerViewAdapter(var data: List<Report>): RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var view: View
        var inflater: LayoutInflater = LayoutInflater.from(parent.context)
        view = inflater.inflate(R.layout.image_card_view, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.image.setImageDrawable(data[position].image)
    }


    class MyViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        val image = itemView!!.findViewById<ImageView>(R.id.image_view)

    }

}