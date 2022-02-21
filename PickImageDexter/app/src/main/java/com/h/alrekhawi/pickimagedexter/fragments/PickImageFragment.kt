package com.h.alrekhawi.pickimagedexter.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.h.alrekhawi.pickimagedexter.R
import com.vansuita.pickimage.bundle.PickSetup
import com.vansuita.pickimage.dialog.PickImageDialog


/**
 * A simple [Fragment] subclass.
 */
class PickImageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root =  inflater.inflate(R.layout.fragment_pick_image, container, false)

        PickImageDialog.build(PickSetup())
            .setOnPickResult {
                //TODO: do what you have to...
            }
            .setOnPickCancel {
                //TODO: do what you have to if user clicked cancel
            }.show(activity!!.supportFragmentManager)
        return root
    }


}
