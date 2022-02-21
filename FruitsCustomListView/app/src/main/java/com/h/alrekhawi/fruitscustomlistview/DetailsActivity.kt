package com.h.alrekhawi.fruitscustomlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.h.alrekhawi.fruitscustomlistview.model.Fruit
import com.h.alrekhawi.fruitscustomlistview.model.Student
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        //Variables
//        val id = intent.getIntExtra("id", -1)
//        val name = intent.getStringExtra("name")
//        val details = intent.getStringExtra("details")
//        val image = intent.getIntExtra("image", R.drawable.apple)

        //-------------------------------------------------------------

        //Serializable
        val fruit = intent.getSerializableExtra("fruit") as Fruit
        tvFruit.text = fruit.toString()
        Log.e("hzm", fruit.toString())

        //Parcelable
        val std = intent.getParcelableExtra<Student>("std")
        tvSTD.text = std.toString()
        Log.e("hzm", std.toString())

    }
}
