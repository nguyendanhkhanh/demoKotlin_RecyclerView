package com.example.demorecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val newsList : ArrayList<News>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_items,
        parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currenntItem = newsList[position]
        holder.tvList1.text = currenntItem.list1
        holder.tvList2.text = currenntItem.list2

    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val tvList1 : TextView = itemView.findViewById(R.id.tvList1)
        val tvList2 : TextView = itemView.findViewById(R.id.tvList2)

    }
}