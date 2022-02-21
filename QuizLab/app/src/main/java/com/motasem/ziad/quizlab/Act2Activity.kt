package com.motasem.ziad.quizlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_act2.*

class Act2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act2)

        val num = intent.getIntExtra("num",0)

        edNum.setText(num.toString())

    }
}
