package com.example.tugas4reblytabuni

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter (private val namaList : ArrayList<Data_Item>): RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    class MyViewHolder (DataItem: View) : RecyclerView.ViewHolder (DataItem){
        val gambar : ImageView = DataItem.findViewById(R.id.foto)
        val nama : TextView = DataItem.findViewById(R.id.nama)
        val caption : TextView = DataItem.findViewById(R.id.caption)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val DataItem = LayoutInflater.from(parent.context).inflate(R.layout.activity_data_item,parent, false)
        return  MyViewHolder(DataItem)
    }

    override fun getItemCount(): Int = namaList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = namaList[position]
        holder.gambar.setImageResource(currentItem.gambar)
        holder.nama.text = currentItem.nama
        holder.caption.text = currentItem.caption
    }
}
