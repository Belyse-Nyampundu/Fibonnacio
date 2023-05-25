package com.nbelyse.fibonaccitwo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class rv_fibonacio (var namesList:List<Int>): RecyclerView.Adapter<NamesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.namelist, parent, false)
        return NamesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        val number = namesList.get(position)
        holder.tvName.text = number.toString()
    }

    override fun getItemCount(): Int {
        return namesList.size
    }
}
    class NamesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var tvName = itemView.findViewById<TextView>(R.id.tvName)
    }

