package com.motasem.ziad.menuanddialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPopup.setOnClickListener {
            val popup = PopupMenu(this, btnPopup)
            popup.menuInflater.inflate(R.menu.popup_menu, popup.menu)
            popup.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.save -> Toast.makeText(this, "popSave", Toast.LENGTH_SHORT).show()
                    R.id.save_all -> Toast.makeText(this, "popSaveAll", Toast.LENGTH_SHORT).show()
                    R.id.delete -> Toast.makeText(this, "popDelete", Toast.LENGTH_SHORT).show()
                }
                true
            }
            popup.show()
        }

        btnAlertDialog.setOnClickListener {
            val alert = AlertDialog.Builder(this)
            alert.setTitle("Delete Post")
            alert.setMessage("Are you sure you deleting this post ?\nYou can not retrieving it again !")
            alert.setIcon(R.drawable.ic_delete_forever_black_24dp)
            alert.setCancelable(false)

            alert.setPositiveButton("Yes"){ dialogInterface, i ->
                Toast.makeText(this,"Yes",Toast.LENGTH_SHORT).show()
            }
             alert.setNegativeButton("No"){ dialogInterface, i ->
                Toast.makeText(this,"No",Toast.LENGTH_SHORT).show()
            }
             alert.setNeutralButton("Do not show again"){ dialogInterface, i ->
                Toast.makeText(this,"Do not show again",Toast.LENGTH_SHORT).show()
            }
            alert.create().show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.share -> Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show()
            R.id.save -> Toast.makeText(this, "Save", Toast.LENGTH_SHORT).show()
            R.id.open -> Toast.makeText(this, "Open", Toast.LENGTH_SHORT).show()
            R.id.edit -> Toast.makeText(this, "Edit", Toast.LENGTH_SHORT).show()
            R.id.setting -> Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show()
            R.id.exit -> Toast.makeText(this, "Exit", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}
