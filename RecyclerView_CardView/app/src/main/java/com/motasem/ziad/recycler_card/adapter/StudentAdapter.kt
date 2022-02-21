package com.motasem.ziad.recycler_card.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.motasem.ziad.recycler_card.R
import com.motasem.ziad.recycler_card.model.Student
import kotlinx.android.synthetic.main.student_item.view.*

class StudentAdapter(var activity: Activity, var data: MutableList<Student>) :
    RecyclerView.Adapter<StudentAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val tvId = itemView.tvId
        //  val imgStudent = itemView.imgStudent
        val tvName = itemView.tvName
        val tvAvg = itemView.tvAverage
        val btnDetails = itemView.btnDetails

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(activity).inflate(R.layout.student_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.tvId.text = data[position].id.toString()
        holder.tvName.text = data[position].name
        holder.tvAvg.text = data[position].avg.toString()

        holder.btnDetails.setOnClickListener {
            Toast.makeText(activity, data[position].name, Toast.LENGTH_SHORT).show()
        }
    }


}