package com.motasem.ziad.sqlitedatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.motasem.ziad.sqlitedatabase.db.DatabaseHelper
import com.motasem.ziad.sqlitedatabase.model.Student

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = DatabaseHelper(this)
        /*  db.insertStudent("Ahmed Khalil",89.0)
          db.insertStudent("Ahmed Khalil",89.0)
          db.insertStudent("Ahmed Khalil",89.0)
          db.insertStudent("Ahmed Khalil",89.0)
          db.insertStudent("Ahmed Khalil",89.0)
        if (db.insertStudent("Ahmed Sami", 95.2))
            Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show()
        else
            Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()*/

        /*if (db.deleteStudent(2))
            Toast.makeText(this, "Deleted Successfully", Toast.LENGTH_SHORT).show()
        else
            Toast.makeText(this, "Deleted Failed", Toast.LENGTH_SHORT).show()*/

        if (db.updateStudent(3, "Ali Saleem", 89.3))
            Toast.makeText(this, "Update Successfully", Toast.LENGTH_SHORT).show()
        else
            Toast.makeText(this, "Update Failed", Toast.LENGTH_SHORT).show()

        Log.e("mzn", db.getAllStudent().toString())
        Log.e("mzn", db.getAllStudent().size.toString())
    }
}
