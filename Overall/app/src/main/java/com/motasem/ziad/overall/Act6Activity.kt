package com.motasem.ziad.overall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Act6Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act6)

        val definition = intent.getStringExtra("define")
        Toast.makeText(this,definition,Toast.LENGTH_LONG).show()

    }
}
