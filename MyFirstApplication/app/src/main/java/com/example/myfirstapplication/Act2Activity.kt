package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_act2.*

class Act2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act2)

        rgGender.setOnCheckedChangeListener { radioGroup, id ->
            var radio: RadioButton = findViewById(id)
            var radioText = radio.text.toString()
        }

        btnSave.setOnClickListener {
            var name = edName.text.toString()
            var phone = edPhone.text.toString()
            var age = edAge.text.toString()
            var address = edAddress.text.toString()

        }
        var arr = resources.getStringArray(R.array.status)
        var arrAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, arr)
        spState.adapter = arrAdapter


    }
}
