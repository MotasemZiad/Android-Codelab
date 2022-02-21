package com.motasem.ziad.myapplication

import android.app.DatePickerDialog
import android.app.Dialog
import android.app.ProgressDialog
import android.app.TimePickerDialog
import android.icu.util.Calendar
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.TimePicker
import android.widget.Toast
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        registerForContextMenu(btnContext)

        // Date Picker
        txtDate.setOnClickListener {
            val currentDate = Calendar.getInstance()
            val day = currentDate.get(Calendar.DAY_OF_MONTH)
            val month = currentDate.get(Calendar.MONTH)
            val year = currentDate.get(Calendar.YEAR)

            val picker = DatePickerDialog(
                this,
                DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                    txtDate.setText(dayOfMonth.toString() + "/" + (month + 1) + "/" + year)
                }, year, month, day
            )
            picker.show()
        }
        // Time Picker
        txtTime.setOnClickListener {
            val currentTime = Calendar.getInstance()
            val hour = currentTime.get(Calendar.HOUR_OF_DAY)
            val minute = currentTime.get(Calendar.MINUTE)
            val mTimePicker: TimePickerDialog
            mTimePicker = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
                    txtTime.setText("$hourOfDay:$minute")
                }, hour, minute, true
            )
            //yes 24 hour system
            mTimePicker.show()
        }
        //Progress Dialog
        btnDownload.setOnClickListener {
            val progressDialog = ProgressDialog(this)
            progressDialog.setMessage("Downloading ...")
            progressDialog.setCancelable(true) //false is the common choice (Recommended for applications)
            progressDialog.show()

//            btnCancel.setOnClickListener {
//                if (progressDialog.isShowing)
//                    progressDialog.dismiss()
//            }
        }
        //Custom Dialog
        btnShow.setOnClickListener {
            val dialog = Dialog(this)
            dialog.setContentView(R.layout.custom_dialog)
            val text = dialog.findViewById(R.id.text) as TextView
            text.text = "Hello .. This is a custom dialog!"
            val image = dialog.findViewById(R.id.img) as ImageView
            image.setImageResource(R.mipmap.ic_launcher)
            dialog.show()
        }
    }


    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.context_menu, menu)
        menu!!.setHeaderTitle("Select from the actions below")
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.share -> Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
            R.id.open -> Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
            R.id.save -> Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
            R.id.setting -> Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
        }
        return true
    }
}
