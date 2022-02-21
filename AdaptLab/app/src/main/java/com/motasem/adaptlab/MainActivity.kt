package com.motasem.adaptlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arr = resources.getStringArray(R.array.programming_Languages)

        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, arr)
        lvProg.adapter = arrayAdapter

        lvProg.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT)
                .show()
        }
        lvProg.setOnItemLongClickListener { adapterView, view, i, l ->
            Toast.makeText(
                this,
                "Long " + adapterView.getItemAtPosition(i).toString(),
                Toast.LENGTH_SHORT
            ).show()
            true
        }

    }
}
