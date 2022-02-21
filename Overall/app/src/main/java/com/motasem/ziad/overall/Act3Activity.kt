package com.motasem.ziad.overall

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.PopupMenu
import android.widget.Toast
import com.motasem.ziad.overall.model.Employee
import com.motasem.ziad.overall.model.Student
import kotlinx.android.synthetic.main.activity_act3.*

class Act3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act3)

        val student = intent.getSerializableExtra("s") as Student
        Toast.makeText(this, student.toString(), Toast.LENGTH_LONG).show()
        val employee = intent.getParcelableExtra<Employee>("emp")
        Toast.makeText(this, employee.toString(), Toast.LENGTH_LONG).show()

        val data = mutableListOf<String>()
        data.add("Ahmed Adel"); data.add("Ibrahim Adel"); data.add("Saad Sameer")
        data.add("Motasem Ziad"); data.add("Hazem AlRekhawi"); data.add("Mohammed Adel")
        data.add("Ali Adnan"); data.add("Ahmed Mousa"); data.add("Mousa Abed")
        data.add("Fadel Shaker"); data.add("Ihsan Batsh"); data.add("Tawfiq Barhoum")
        data.add("Mosab Naser"); data.add("Khaled Ali"); data.add("HAssan Khaleel")
        data.add("Iyad Al-Agha"); data.add("Abed Swaisy"); data.add("Saad Daher")
        data.add("Adi Fayadd"); data.add("Elyan Bahtiny"); data.add("Fawzey Sameer")
        data.add("Ahmed Adel"); data.add("Ibrahim Adel"); data.add("Saad Sameer")
        data.add("Ahmed Adel"); data.add("Ibrahim Adel"); data.add("Saad Sameer")
        data.add("Ahmed Adel"); data.add("Ibrahim Adel"); data.add("Saad Sameer")
        data.add("Ahmed Adel"); data.add("Ibrahim Adel"); data.add("Saad Sameer"); data.add("Battota")

        val arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data)
        lvData.adapter = arrayAdapter

        lvData.setOnItemClickListener { _, _, _, _ ->
            val popupMenu = PopupMenu(this,lvData)
            popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)

            popupMenu.setOnMenuItemClickListener {item ->
                when(item.itemId){
                    R.id.openNewTap -> Toast.makeText(this,item.title,Toast.LENGTH_LONG).show()
                    R.id.show -> Toast.makeText(this,item.title,Toast.LENGTH_LONG).show()
                    R.id.send -> Toast.makeText(this,item.title,Toast.LENGTH_LONG).show()
                    R.id.setting -> Toast.makeText(this,item.title,Toast.LENGTH_LONG).show()
                }
                true
            }
            popupMenu.show()
        }

        lvData.setOnItemLongClickListener { _, _, i, _ ->
            Toast.makeText(this, "Long : ${data[i]}", Toast.LENGTH_SHORT).show()
            true
        }

        tvEmp.setOnClickListener {
            val intent = Intent(this,Act4Activity::class.java)
            intent.putExtra("define","THIS IS ACTIVITY 4 !!")
            startActivity(intent)
        }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.app_bar_search -> Toast.makeText(this,item.title,Toast.LENGTH_SHORT).show()
            R.id.open -> Toast.makeText(this,item.title,Toast.LENGTH_SHORT).show()
            R.id.openRecent -> Toast.makeText(this,item.title,Toast.LENGTH_SHORT).show()
            R.id.share -> Toast.makeText(this,item.title,Toast.LENGTH_SHORT).show()
            R.id.edit -> Toast.makeText(this,item.title,Toast.LENGTH_SHORT).show()
            R.id.copy -> Toast.makeText(this,item.title,Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}
