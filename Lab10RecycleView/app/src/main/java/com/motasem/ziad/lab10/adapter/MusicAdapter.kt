package com.motasem.ziad.lab10.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.motasem.ziad.lab10.R
import com.motasem.ziad.lab10.model.Music
import kotlinx.android.synthetic.main.recycle_item.view.*

class MusicAdapter(var activity:Activity, var data:MutableList<Music>, var click:onClickItem):RecyclerView.Adapter<MusicAdapter.MyViewHolder>() {


    class  MyViewHolder(item: View):RecyclerView.ViewHolder(item){

        var name = item.tvName
        var mobile = item.tvMobile
        var image = item.profile_image
        var card  = item.cardView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val root = LayoutInflater.from(activity).inflate(R.layout.recycle_item,parent,false)
        return MyViewHolder(root)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.name.text = data[position].name
        holder.mobile.text = data[position].mobile
        holder.image.setImageResource(data[position].img)
        holder.card.setOnClickListener {
            click.onClick(holder.adapterPosition)
        }
    }

    interface onClickItem{
        fun onClick(position: Int)
    }
}