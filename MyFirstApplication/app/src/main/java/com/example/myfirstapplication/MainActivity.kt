package com.example.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAvg.setOnClickListener {

            val m1 = mark1.text.toString()!!.toDouble()
            val m2 = mark2.text.toString()!!.toDouble()
            val m3 = mark3.text.toString()!!.toDouble()
            val m4 = mark4.text.toString()!!.toDouble()
            val average = (m1 + m2 + m3 + m4) / 4.0
                if ((m1 > 100 || m1 < 0) || (m2 > 100 || m2 < 0) || (m3 > 100 || m3 < 0) || (m4 > 100 || m4 < 0)) {
                    edResult.setText("Error")
                } else {
                    edResult.setText("$average")
                }
                Toast.makeText(applicationContext,
                    if ((m1 > 100 || m1 < 0) || (m2 > 100 || m2 < 0) || (m3 > 100 || m3 < 0) || (m4 > 100 || m4 < 0))
                        "Please ../nEnter a really grade !" else culculateAvg(average),
                    Toast.LENGTH_SHORT
                ).show()

            }

        btnGo.setOnClickListener {
            val i = Intent(applicationContext, Act2Activity::class.java)
            startActivity(i)
        }



/*
        var car = Car("Germany","Fiat", "Blue")
        var truck = Truck("Japan","Hunda")

        car.color ="Red"

        var color = car.color
       println(color) */

    }

    fun culculateAvg(value: Double): String {

        if (value > 100 || value < 0) {
            return "Please ../nEnter a really grade !"
        } else {
            when (value) {
                in 90..100 -> return "Excellent"
                in 80..90 -> return "Very Good"
                in 70..80 -> return "Good"
                in 60..70 -> return "Accepted"
                else -> return "Lost"

            }
        }

    }


}


