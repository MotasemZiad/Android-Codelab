package com.application.storedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.graphics.drawable.toBitmap
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.application.lab9.RecycleViewAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), RecycleViewAdapter.onClickItem {
    lateinit var userDatabase: UserDatabase
    lateinit var list: MutableList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list = mutableListOf<User>()
        val adapter = RecycleViewAdapter(this, list, this)
        recycleview.adapter = adapter
        recycleview.layoutManager = LinearLayoutManager(this)
        userDatabase = UserDatabase(this)
        if (userDatabase.getUserCount() > 0) {
            list.addAll(userDatabase.getAllUser())
            adapter.notifyDataSetChanged()
        }

        btn_add.setOnClickListener {
            val user = User(
                ed_name.text.toString(),
                ed_mobile.text.toString(),
                resources.getDrawable(R.drawable.test).toBitmap()
            )
            list.add(user)
            adapter.notifyDataSetChanged()
            userDatabase.insertUser(user)
        }

        val swipeToDeleteCallback = object : SwipeToDeleteCallback(this) {
            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val adapter: RecycleViewAdapter = recycleview.adapter as RecycleViewAdapter
                adapter.removeAt(viewHolder.adapterPosition)
                userDatabase.deleteUser(viewHolder.adapterPosition.toLong())
            }

        }

        val itemTouchHelper = ItemTouchHelper(swipeToDeleteCallback)
        itemTouchHelper.attachToRecyclerView(recycleview)

    }

    override fun onClick(position: Int) {
        Toast.makeText(this, "This is item ${list[position]} ", Toast.LENGTH_SHORT).show()
    }


}
