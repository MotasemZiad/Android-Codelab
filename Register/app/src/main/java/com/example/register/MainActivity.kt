package com.example.register
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isEmpty
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





            btnReg.setOnClickListener {

                val name = txtName.text.toString()
                val university = spUniversity.selectedItem
                var gender = ""
                if (rbMale.isChecked)
                    gender = "Male"
                else
                    gender = "Female"

                var interests = " "
                if (cbRead.isChecked)
                    interests += " Reading "
                if (cbWriting.isChecked)
                    interests += " Writing "

                val s =
                    " Name : $name \n Gender : $gender \n University : $university \n Intrests : $interests"
                txtResult.setText(s)
            }

        }
    }

