package com.motasem.signinup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnSignup.setOnClickListener {
            if (edName.text.isEmpty() || edEmail.text.isEmpty() || edPass.text.isEmpty()) {
                Toast.makeText(applicationContext, "Please Fill Fields", Toast.LENGTH_SHORT).show()
            } else {
                val i = Intent(this, Act2Activity::class.java)
                i.putExtra("username",edName.text.toString())
                i.putExtra("email",edEmail.text.toString())
                i.putExtra("password",edPass.text.toString())
                startActivity(i)
            }

        }
        tvHaveAcc.setOnClickListener {
            var i3 = Intent(this, Act2Activity::class.java)
            startActivity(i3)
        }
    }
}
