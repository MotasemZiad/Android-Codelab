package com.motasem.ziad.overall

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_act5.*

class Act5Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act5)

        val definition = intent.getStringExtra("define")
        Toast.makeText(this, definition, Toast.LENGTH_LONG).show()

        btnGoToAct6.setOnClickListener {
            val i = Intent(this, Act6Activity::class.java)
            i.putExtra("define", "THIS IS ACTIVITY 6 !!")
            startActivity(i)
        }

        btnAlert.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this)
            alertDialog.setTitle("Confirm Exit")
            alertDialog.setIcon(R.drawable.ic_close_black_24dp)
            alertDialog.setMessage("Are you sure you exit currently project ?")
            alertDialog.setCancelable(false)

            alertDialog.setPositiveButton("Yes") { _, _ ->
                Toast.makeText(this, "Yes", Toast.LENGTH_SHORT).show()
            }
            alertDialog.setNegativeButton("No") { _, _ ->
                Toast.makeText(this, "No", Toast.LENGTH_SHORT).show()
            }
            alertDialog.setNeutralButton("Do not show again !") { _, _ ->
                Toast.makeText(this, "Do not show again !", Toast.LENGTH_SHORT).show()
            }
            alertDialog.create().show()

        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.app_bar_search -> Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
            R.id.open -> Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
            R.id.openRecent -> Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
            R.id.share -> Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
            R.id.edit -> Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
            R.id.copy -> Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}
