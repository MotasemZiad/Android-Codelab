package com.motasem.ziad.lab7.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.motasem.ziad.lab7.R
import com.motasem.ziad.lab7.model.ProgrammingLanguages
import kotlinx.android.synthetic.main.grid_item.view.*

class ProgrammingAdapter(val activity: Activity, var item:ArrayList<ProgrammingLanguages>):BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val root = LayoutInflater.from(activity).inflate(R.layout.grid_item,null,false)

        root!!.tvProg.text = item[position].title
        root.img.setImageResource(item[position].img)
        return root
    }

    override fun getItem(position: Int): Any {
        return item[position]
    }

    override fun getItemId(position: Int): Long {
        return item[position].id.toLong()
    }

    override fun getCount(): Int {
        return item.size
    }

}