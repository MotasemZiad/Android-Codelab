package com.motasem.ziad.overall.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.motasem.ziad.overall.R
import com.motasem.ziad.overall.model.Fruit
import kotlinx.android.synthetic.main.fruit_items.view.*

class FruitAdapter(var activity: Activity, var data: ArrayList<Fruit>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var root = convertView
        if (root == null)
            root = LayoutInflater.from(activity).inflate(R.layout.fruit_items, null, false)
            root!!.tvName.text = data[position].name
            root.tvDetails.text = data[position].details
            root.imgFruit.setImageResource(data[position].img)

        return root
    }

    override fun getItem(position: Int): Any {
        return data[position]
    }

    override fun getItemId(position: Int): Long {
        return data[position].id.toLong()
    }

    override fun getCount(): Int {
        return data.size
    }
}