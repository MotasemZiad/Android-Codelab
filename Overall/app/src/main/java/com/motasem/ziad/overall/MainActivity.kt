package com.motasem.ziad.overall

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TAG = "mzn"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e(TAG, "onCreate")
        btnSum.setOnClickListener {
            if (txtFirst.text.isEmpty() || txtSecond.text.isEmpty()) {
                Toast.makeText(this, "Please Fill Fields !", Toast.LENGTH_SHORT).show()
            } else {
                val n1 = txtFirst.text.toString()!!.toDouble()
                val n2 = txtSecond.text.toString()!!.toDouble()

                val sum = n1 + n2

                txtResult.setText("$sum")
            }
        }
        btnClear.setOnClickListener {
            txtFirst.text.clear()
            txtSecond.text.clear()
            txtResult.text.clear()
        }
        btnGoToAct2.setOnClickListener {
            val i = Intent(this, Act2Activity::class.java)
            i.putExtra("name", "Motasem Z. AbuNema")
            i.putExtra("university", "IUG")
            i.putExtra("gender", "Male")
            i.putExtra("interests", "Reading")
            i.putExtra("isActive", true)
            i.putExtra("gpa", 85.15)
            startActivity(i)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG, "onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG, "onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG, "onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "onDestroy")

    }
}
