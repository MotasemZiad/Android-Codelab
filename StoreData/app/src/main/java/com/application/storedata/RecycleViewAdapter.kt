package com.application.lab9

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.application.storedata.R
import com.application.storedata.User
import kotlinx.android.synthetic.main.recycle_item.view.*

class RecycleViewAdapter(val context: Context,val list: MutableList<User>,val click: onClickItem):RecyclerView.Adapter<RecycleViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view =  LayoutInflater.from(context).inflate(R.layout.recycle_item,parent,false)
        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = list[position].name
        holder.mobile.text = list[position].mobile
        holder.img.setImageBitmap(list[position].image)

        holder.card.setOnClickListener {
            click.onClick(holder.adapterPosition)
        }
    }

    fun removeAt(position: Int) {
        list.removeAt(position)
        notifyItemRemoved(position)
    }

    class ViewHolder(item: View):RecyclerView.ViewHolder(item){
        val name = item.tv_name
        val mobile = item.tv_mobile
        val img = item.img
        val card = item.cardview
    }

    interface onClickItem{
        fun onClick(position: Int)
    }
}