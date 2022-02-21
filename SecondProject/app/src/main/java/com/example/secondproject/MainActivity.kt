package com.example.secondproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //var btnSum = findViewById<Button>(R.id.btnSum)

        btnSum.setOnClickListener {

            /*Toast.makeText(applicationContext,"Welcome to Android",
                Toast.LENGTH_SHORT).show()*/

            //Log.e("hzm","Hazem Al Rekhawi")


            if(firstNum.text.isEmpty() || secondNum.text.isEmpty()){
                Toast.makeText(applicationContext,"Please Fill Fields", Toast.LENGTH_SHORT).show()
            }else{
                val x = firstNum.text.toString()!!.toInt()
                val y = secondNum.text.toString()!!.toInt()
                val sum = x+y
                result.setText("Sum = $sum")
            }

        }

        btnClear.setOnClickListener{
            firstNum.text.clear()
            secondNum.setText("")
            result.text.clear()
        }
    }
}
