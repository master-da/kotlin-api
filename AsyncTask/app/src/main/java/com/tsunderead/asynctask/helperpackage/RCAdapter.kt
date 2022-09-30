package com.tsunderead.asynctask.helperpackage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tsunderead.asynctask.R

class RCAdapter(private val lst: ArrayList<RCItem>): RecyclerView.Adapter<RCAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.text.text = lst[position].text
    }

    override fun getItemCount(): Int {
        return lst.size
    }

    class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
        val text: TextView = itemView.findViewById(R.id.rcText)
    }

}