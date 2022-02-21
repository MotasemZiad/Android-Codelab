package com.motasem.ziad.quiz.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.motasem.ziad.quiz.R
import com.motasem.ziad.quiz.model.Model
import kotlinx.android.synthetic.main.item.view.*

class ModelAdapter(var activity: Activity, var data: MutableList<Model>) :
    RecyclerView.Adapter<ModelAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName = itemView.tvName
        val image = itemView.imgItem
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(activity).inflate(R.layout.item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvName.text = data[position].name
        holder.image.setImageResource(data[position].img)
    }

}