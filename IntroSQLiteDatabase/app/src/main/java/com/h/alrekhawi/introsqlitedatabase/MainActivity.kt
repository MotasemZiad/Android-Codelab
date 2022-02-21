package com.h.alrekhawi.introsqlitedatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.h.alrekhawi.introsqlitedatabase.db.DatabaseHelper

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = DatabaseHelper(this)

        /*if (db.insertStudent("Hazem", 97.5))
            Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show()
        else
            Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()*/


       /* if (db.deleteStudent(3))
            Toast.makeText(this, "Deleted Successfully", Toast.LENGTH_SHORT).show()
        else
            Toast.makeText(this, "Delete Failed", Toast.LENGTH_SHORT).show()*/


        if (db.updateStudent(4,"Alaa",86.0))
            Toast.makeText(this, "Updated Successfully", Toast.LENGTH_SHORT).show()
        else
            Toast.makeText(this, "Update Failed", Toast.LENGTH_SHORT).show()

        Log.e("hzm", db.getAllStudents().toString())
        Log.e("hzm", db.getAllStudents().size.toString())
    }
}
