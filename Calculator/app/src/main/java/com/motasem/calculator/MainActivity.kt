package com.motasem.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var x:Double
        var y:Double

            btnSum.setOnClickListener {
                if(edNum1.text.isEmpty() || edNum2.text.isEmpty()){
                    Toast.makeText(applicationContext,"Please Fill Fields",Toast.LENGTH_SHORT).show()
                }else {
                    x = edNum1.text.toString()!!.toDouble()
                    y = edNum2.text.toString()!!.toDouble()
                    val sum = x + y
                    edResult.setText("$sum")
                }
            }
            btnSub.setOnClickListener {
                if(edNum1.text.isEmpty() || edNum2.text.isEmpty()){
                    Toast.makeText(applicationContext,"Please Fill Fields",Toast.LENGTH_SHORT).show()
                }else {
                    x = edNum1.text.toString()!!.toDouble()
                    y = edNum2.text.toString()!!.toDouble()
                    val sub = x - y
                    edResult.setText("$sub")
                }
            }
            btnDiv.setOnClickListener {
                if(edNum1.text.isEmpty() || edNum2.text.isEmpty()){
                    Toast.makeText(applicationContext,"Please Fill Fields",Toast.LENGTH_SHORT).show()
                }else {
                    x = edNum1.text.toString()!!.toDouble()
                    y = edNum2.text.toString()!!.toDouble()
                    val div = x / y
                    edResult.setText("$div")
                }
            }
            btnMul.setOnClickListener {
                if(edNum1.text.isEmpty() || edNum2.text.isEmpty()){
                    Toast.makeText(applicationContext,"Please Fill Fields",Toast.LENGTH_SHORT).show()
                }else {
                    x = edNum1.text.toString()!!.toDouble()
                    y = edNum2.text.toString()!!.toDouble()
                    val mul = x * y
                    edResult.setText("$mul")
                }
            }
            btnMod.setOnClickListener {
                if(edNum1.text.isEmpty() || edNum2.text.isEmpty()){
                    Toast.makeText(applicationContext,"Please Fill Fields",Toast.LENGTH_SHORT).show()
                }else {
                    x = edNum1.text.toString()!!.toDouble()
                    y = edNum2.text.toString()!!.toDouble()
                    val mod = x % y
                    edResult.setText("$mod")
                }
            }


        btnClear.setOnClickListener {
            edNum1.text.clear()
            edNum2.text.clear()
            edResult.text.clear()
        }
    }
}
