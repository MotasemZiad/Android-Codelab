package com.motasem.signinup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_act2.*
import kotlinx.android.synthetic.main.activity_main.*

class Act2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act2)

        edEmail2.setText(intent.getStringExtra("email"))
        edPass2.setText(intent.getStringExtra("password"))

        btnLogin.setOnClickListener {

            if (edEmail2.text.isEmpty() || edPass2.text.isEmpty()) {
                Toast.makeText(applicationContext, "Please Fill Fields", Toast.LENGTH_SHORT).show()
            } else {
                val i = Intent(this,Act3Activity::class.java)
                i.putExtra("email",intent.getStringExtra("email"))
                i.putExtra("password",intent.getStringExtra("password"))
                startActivity(i)


            }
        }

        tvSignup.setOnClickListener {
            val i2 = Intent(applicationContext, MainActivity::class.java)
            startActivity(i2)
        }
    }
}
