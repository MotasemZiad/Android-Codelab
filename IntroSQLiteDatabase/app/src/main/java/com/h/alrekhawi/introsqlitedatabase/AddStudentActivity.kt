package com.h.alrekhawi.introsqlitedatabase

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.h.alrekhawi.introsqlitedatabase.db.DatabaseHelper
import kotlinx.android.synthetic.main.activity_add_student.*


class AddStudentActivity : AppCompatActivity() {

    var imageURI: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_student)

        // val resourceId = resources.getIdentifier("hazem","drawable",packageName)

        val db = DatabaseHelper(this)

        imgStudent.setOnClickListener {

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                    requestPermissions(arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE), 100)
                    return@setOnClickListener
                } else {
                    val i = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
                    startActivityForResult(i, 100)
                }
            }
        }


        btnAdd.setOnClickListener {

            if (txtName.text.isNotEmpty() && txtAverage.text.isNotEmpty()) {
                if (db.insertStudent(
                        txtName.text.toString(),
                        txtAverage.text.toString().toDouble(),
                        imageURI
                    )
                ) {
                    Toast.makeText(this, "Added Successfully", Toast.LENGTH_SHORT).show()
                    txtName.text.clear()
                    txtAverage.text.clear()
                } else {
                    Toast.makeText(this, "Add Failed", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Fill Fields", Toast.LENGTH_SHORT).show()
            }
        }

        btnGet.setOnClickListener {
            val intent = Intent(this, StudentsActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK && requestCode == 100) {
            imageURI = data!!.data.toString()
            Log.e("hzm", imageURI)
            imgStudent.setImageURI(data.data)
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        when (requestCode) {
            100 -> {
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    val i = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
                    startActivityForResult(i, 100)
                    // permission was granted, yay! do the
                } else {
                    // permission denied, boo! Disable the function
                    finish()
                }
                return
            }
        }
    }
}
