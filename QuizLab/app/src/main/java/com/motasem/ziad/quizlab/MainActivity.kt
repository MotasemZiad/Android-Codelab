package com.motasem.ziad.quizlab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rg.setOnCheckedChangeListener { radioGroup, id ->
            var radio: RadioButton = findViewById(id)
            var radioText = radio.text.toString().toInt()
            val i = Intent(this, Act2Activity::class.java)
            i.putExtra("num", radioText*2)
            startActivity(i)

        }
        /*
        if(rb10.isChecked){
            val i = Intent(this, Act2Activity::class.java)
            i.putExtra("num", 10)
            startActivity(i)
        }

        if(rb8.isChecked){
            val i = Intent(this, Act2Activity::class.java)
            i.putExtra("num", 8)
            startActivity(i)
        }
        if(rb15.isChecked){
            val i = Intent(this, Act2Activity::class.java)
            i.putExtra("num", 15)
            startActivity(i)
        }
        if(rb50.isChecked){
            val i = Intent(this, Act2Activity::class.java)
            i.putExtra("num", 50)
            startActivity(i)
        } */



        /*
        rb10.setOnClickListener {
            if (rb10.isChecked) {

            }
        }
        rb15.setOnClickListener {
            if (rb15.isChecked) {
                val i = Intent(this, Act2Activity::class.java)
                i.putExtra("num", 15)
                startActivity(i)
            }
        }
        rb8.setOnClickListener {
            if (rb8.isChecked) {
                val i = Intent(this, Act2Activity::class.java)
                i.putExtra("num", 8)
                startActivity(i)
            }
        }
        rb50.setOnClickListener {
            if (rb50.isChecked) {
                val i = Intent(this, Act2Activity::class.java)
                i.putExtra("num", 50)
                startActivity(i)
            }
        }
 */
    }
}
