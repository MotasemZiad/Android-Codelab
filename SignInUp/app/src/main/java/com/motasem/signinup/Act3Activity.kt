package com.motasem.signinup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_act3.*

class Act3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act3)


        if(intent.hasExtra("email") || intent.hasExtra("password")){
            var email = intent.getStringExtra("email")
            var password = intent.getStringExtra("password")

            Toast.makeText(this,"$email : $password",Toast.LENGTH_SHORT).show()
        }

        val relation = spState.selectedItem



    }
}
