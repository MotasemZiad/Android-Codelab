package com.h.alrekhawi.pickimagelibraryexample.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.h.alrekhawi.pickimagelibraryexample.R
import com.vansuita.pickimage.bundle.PickSetup
import com.vansuita.pickimage.dialog.PickImageDialog
import kotlinx.android.synthetic.main.fragment_cg.view.*


/**
 * A simple [Fragment] subclass.
 */
class CGFragment : Fragment() {

    var s: String = ""
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_cg, container, false)

        root.imgPickFragment.setOnClickListener {
            PickImageDialog.build(PickSetup())
                .setOnPickResult { r ->
                    s = r.uri.toString()
                    root.imgPickFragment.setImageURI(r.uri)
                }
                .setOnPickCancel {

                }.show(activity!!.supportFragmentManager)
        }

        return root
    }


}
