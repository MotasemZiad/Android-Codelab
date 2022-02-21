package com.h.alrekhawi.fruitscustomlistview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.h.alrekhawi.fruitscustomlistview.model.Fruit
import android.app.Activity
import android.content.Intent
import android.view.View
import android.widget.*
import com.h.alrekhawi.fruitscustomlistview.DetailsActivity
import com.h.alrekhawi.fruitscustomlistview.R
import com.h.alrekhawi.fruitscustomlistview.model.Student
import kotlinx.android.synthetic.main.fruit_item.view.*


class FruitAdapter(var activity: Activity, var data: ArrayList<Fruit>) : BaseAdapter() {

    override fun getCount(): Int {
        return data.size
    }

    override fun getItem(i: Int): Any {
        return data[i]
    }

    override fun getItemId(i: Int): Long {
        return data[i].id.toLong()
    }

    override fun getView(i: Int, view: View?, viewGroup: ViewGroup?): View {

        var root = view
        if (root == null) {
            root = LayoutInflater.from(activity).inflate(R.layout.fruit_item, null, false)
        }
        root!!.tvName.text = data[i].name
        root.tvDetails.text = data[i].details
        root.imgFruit.setImageResource(data[i].image)

        root.btnDetails.setOnClickListener {
            val intent = Intent(activity, DetailsActivity::class.java)

//            intent.putExtra("id",data[i].id)
//            intent.putExtra("name",data[i].name)
//            intent.putExtra("details",data[i].details)
//            intent.putExtra("image",data[i].image)

            intent.putExtra("fruit",data[i])

            val std = Student(1,"Ahmad",90.0)
            intent.putExtra("std",std)

            activity.startActivity(intent)
        }

        return root!!
    }
}
