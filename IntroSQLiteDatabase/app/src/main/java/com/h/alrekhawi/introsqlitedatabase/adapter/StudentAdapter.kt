package com.h.alrekhawi.introsqlitedatabase.adapter

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.h.alrekhawi.introsqlitedatabase.R
import com.h.alrekhawi.introsqlitedatabase.model.Student
import kotlinx.android.synthetic.main.student_item.view.*

class StudentAdapter(var data: ArrayList<Student>) :
    RecyclerView.Adapter<StudentAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvId = itemView.tvId
        val tvName = itemView.tvName
        val tvAverage = itemView.tvAverage
        val imageView = itemView.imageView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val root = LayoutInflater.from(parent.context).inflate(R.layout.student_item, parent, false)
        return MyViewHolder(root)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvId.text = data[position].id.toString()
        holder.tvName.text = data[position].name
        holder.tvAverage.text = data[position].average.toString()
        holder.imageView.setImageURI(Uri.parse(data[position].image))
    }
}