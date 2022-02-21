package com.motasem.ziad.overall

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.motasem.ziad.overall.model.Employee
import com.motasem.ziad.overall.model.Student
import kotlinx.android.synthetic.main.activity_act2.*

class Act2Activity : AppCompatActivity() {
    val TAG = "mzn"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act2)
        Log.e(TAG, "onCreate")
        btnRegister.setOnClickListener {

            val name = edName.text.toString()
            val university = spUniversity.selectedItem
            var gender = " "
            if (rbMale.isChecked)
                gender = "Male"
            if (rbFemale.isChecked)
                gender = "Female"

            var interests = " "
            if (cbReading.isChecked)
                interests += " Reading "
            if (cbWriting.isChecked)
                interests += " Writing "

            val s = "Name: $name\nUniversity: $university\nGender: $gender\nInterests: $interests"

            edResult.setText(s)
        }
        val name = intent.getStringExtra("name")
        val university = intent.getStringExtra("university")
        val gender = intent.getStringExtra("gender")
        val interests = intent.getStringExtra("interests")
        val isActive = intent.getBooleanExtra("isActive", false)
        val gpa = intent.getDoubleExtra("gpa", 1.0)

        Toast.makeText(
            applicationContext,
            "Name: $name\nUniversity: $university\nGender: $gender\nInterests: $interests\nGPA: $gpa\nISActive: $isActive",
            Toast.LENGTH_LONG
        ).show()

        btnGoToAct3.setOnClickListener {
            val s = Student(1, "Motasem Ziad", 95.9)
            val emp = Employee(2, "Ezz Wadi", 5000.4)
            val intent = Intent(this, Act3Activity::class.java)
            intent.putExtra("s", s)
            intent.putExtra("emp", emp)
            startActivity(intent)
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
