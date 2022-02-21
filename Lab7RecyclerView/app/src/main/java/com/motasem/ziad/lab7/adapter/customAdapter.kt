package com.motasem.ziad.lab7.adapter

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.bumptech.glide.Glide
import com.motasem.ziad.lab7.model.Model
import com.motasem.ziad.lab7.R
import kotlinx.android.synthetic.main.list_item.view.*


class customAdapter(val context:Activity, val item:ArrayList<Model>): BaseAdapter() {
    private var inflate:LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var view = inflate.inflate(R.layout.list_item, p2, false)
        view.txtProg.text = item[p0].title

        Glide.with(context).load(item[p0].img).into(view.imgProg)
        return view
    }

    override fun getItem(p0: Int): Any {
      return item[p0]
    }

    override fun getItemId(p0: Int): Long {
         return 0
    }

    override fun getCount(): Int {
      return item.size
    }

}
