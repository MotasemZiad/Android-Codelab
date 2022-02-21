package com.h.alrekhawi.introsqlitedatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.h.alrekhawi.introsqlitedatabase.adapter.StudentAdapter
import com.h.alrekhawi.introsqlitedatabase.db.DatabaseHelper
import kotlinx.android.synthetic.main.activity_students.*

class StudentsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_students)

        val db = DatabaseHelper(this)
        val data = db.getAllStudents()

        rvStudents.layoutManager = LinearLayoutManager(this)
        //rvStudents.layoutManager = GridLayoutManager(this,2)

        rvStudents.setHasFixedSize(true)

        val studentAdapter = StudentAdapter(data)
        rvStudents.adapter = studentAdapter
    }
}
