package com.motasem.ziad.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.motasem.ziad.quiz.adapter.ModelAdapter
import com.motasem.ziad.quiz.model.Model
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var data: MutableList<Model>
    var state: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        data = mutableListOf<Model>()
        data.add(Model(1, "Hello World", R.drawable.kotlin_bg))
        data.add(Model(2, "Hello World", R.drawable.kotlin_bg))
        data.add(Model(3, "Hello World", R.drawable.kotlin_bg))
        data.add(Model(4, "Hello World", R.drawable.kotlin_bg))
        data.add(Model(5, "Hello World", R.drawable.kotlin_bg))
        data.add(Model(6, "Hello World", R.drawable.kotlin_bg))
        data.add(Model(7, "Hello World", R.drawable.kotlin_bg))
        data.add(Model(8, "Hello World", R.drawable.kotlin_bg))
        data.add(Model(9, "Hello World", R.drawable.kotlin_bg))
        data.add(Model(10, "Hello World", R.drawable.kotlin_bg))
        data.add(Model(11, "Hello World", R.drawable.kotlin_bg))
        data.add(Model(12, "Hello World", R.drawable.kotlin_bg))
        data.add(Model(13, "Hello World", R.drawable.kotlin_bg))
        data.add(Model(14, "Hello World", R.drawable.kotlin_bg))

        rvItem.layoutManager = LinearLayoutManager(this)
        val modelAdapter = ModelAdapter(this, data)
        rvItem.adapter = modelAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == R.id.btn) {

            if (!state) {
                rvItem.layoutManager = GridLayoutManager(this, 2)
                state = true
            } else {
                rvItem.layoutManager = LinearLayoutManager(this)
                state =false

            }

        }


        return true
    }
}
