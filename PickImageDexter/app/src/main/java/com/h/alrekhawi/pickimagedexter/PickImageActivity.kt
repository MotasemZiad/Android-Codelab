package com.h.alrekhawi.pickimagedexter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.vansuita.pickimage.bean.PickResult
import com.vansuita.pickimage.listeners.IPickResult

class PickImageActivity : AppCompatActivity(), IPickResult {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pick_image)
    }

    override fun onPickResult(r: PickResult?) {

        if (r!!.error == null) {
            //If you want the Uri.
            //Mandatory to refresh image from Uri.
            //getImageView().setImageURI(null);

            //Setting the real returned image.
            //getImageView().setImageURI(r.getUri());

            //If you want the Bitmap.
            //getImageView().setImageBitmap(r.getBitmap());

            //Image path
            //r.getPath();
        } else {
            //Handle possible errors
            //TODO: do what you have to do with r.getError();
            Toast.makeText(this, r.error.message, Toast.LENGTH_LONG).show()
        }

    }
}
