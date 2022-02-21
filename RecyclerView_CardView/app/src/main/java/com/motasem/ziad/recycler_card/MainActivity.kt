package com.motasem.ziad.recycler_card

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.motasem.ziad.recycler_card.adapter.StudentAdapter
import com.motasem.ziad.recycler_card.model.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = mutableListOf<Student>()
        data.add(Student(1, "Motasem AbuNema", 85.15))
        data.add(Student(2, "Ahmed Ali", 90.15))
        data.add(Student(3, "Khalil Sahmoud", 77.99))
        data.add(Student(2, "Ahmed Ali", 90.15))
        data.add(Student(3, "Khalil Sahmoud", 77.99))
        data.add(Student(4, "Ahmed Hassan", 80.15))
        data.add(Student(5, "Hazem Hazem", 99.7))
        data.add(Student(1, "Motasem AbuNema", 85.15))
        data.add(Student(2, "Ahmed Ali", 90.15))
        data.add(Student(3, "Khalil Sahmoud", 77.99))
        data.add(Student(2, "Ahmed Ali", 90.15))
        data.add(Student(3, "Khalil Sahmoud", 77.99))
        data.add(Student(4, "Ahmed Hassan", 80.15))
        data.add(Student(5, "Hazem Hazem", 99.7))
        data.add(Student(1, "Motasem AbuNema", 85.15))
        data.add(Student(2, "Ahmed Ali", 90.15))
        data.add(Student(3, "Khalil Sahmoud", 77.99))
        data.add(Student(2, "Ahmed Ali", 90.15))
        data.add(Student(3, "Khalil Sahmoud", 77.99))
        data.add(Student(4, "Ahmed Hassan", 80.15))
        data.add(Student(5, "Hazem Hazem", 99.7))

         rvStudent.layoutManager = LinearLayoutManager(this)
        // rvStudent.layoutManager = GridLayoutManager(this,2)

        rvStudent.setHasFixedSize(true)

        val studentAdapter = StudentAdapter(this, data)
        rvStudent.adapter = studentAdapter

    }
}
