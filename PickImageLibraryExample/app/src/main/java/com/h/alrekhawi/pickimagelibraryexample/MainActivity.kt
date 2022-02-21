package com.h.alrekhawi.pickimagelibraryexample

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.vansuita.pickimage.bean.PickResult
import com.vansuita.pickimage.bundle.PickSetup
import com.vansuita.pickimage.dialog.PickImageDialog
import com.vansuita.pickimage.listeners.IPickResult
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), IPickResult {

    var s: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgPick.setOnClickListener {
            PickImageDialog.build(PickSetup()).show(this)
        }
    }

    override fun onPickResult(r: PickResult?) {

        if (r!!.error == null) {
            s = r.uri.toString()
            imgPick.setImageURI(r.uri)
        } else {
            Toast.makeText(applicationContext, r.error.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}
