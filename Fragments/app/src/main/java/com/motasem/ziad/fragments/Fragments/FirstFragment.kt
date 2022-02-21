package com.motasem.ziad.fragments.Fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import com.motasem.ziad.fragments.R
import kotlinx.android.synthetic.main.fragment_first.view.*

/**
 * A simple [Fragment] subclass.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_first, container, false)
        root.btnMsg.setOnClickListener {
            Toast.makeText(activity, "This is the first fragment !", Toast.LENGTH_SHORT).show()
        }
        return root
    }


}
