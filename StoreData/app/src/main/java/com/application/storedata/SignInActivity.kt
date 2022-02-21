package com.application.storedata

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignInActivity : AppCompatActivity() {
    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        sharedPreferences = getSharedPreferences("login", Context.MODE_PRIVATE)
        if (sharedPreferences.getBoolean("isLogin", false)) {
            startActivity(Intent(this, MainActivity::class.java))
        }

        btn_login.setOnClickListener {
            if (ed_username.text.toString().trim().isEmpty()) {
                ed_username.error = "املاأ الحقل الفارغ"
            } else {
                val editor = sharedPreferences.edit()
                editor.putString("name", ed_username.text.toString())
                editor.putBoolean("isLogin", true)
                editor.apply()
                startActivity(Intent(this, MainActivity::class.java))
            }

        }
    }
}
