package com.motasem.ziad.fragments.Fragments


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.motasem.ziad.fragments.DetailsActivity

import com.motasem.ziad.fragments.R
import kotlinx.android.synthetic.main.fragment_second.view.*

/**
 * A simple [Fragment] subclass.
 */
class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_second, container, false)
        root.btnGoToDetails.setOnClickListener {
            val i = Intent(activity, DetailsActivity::class.java)
            i.putExtra("name","WELCOME TO DETAILS ACTIVITY !")
            startActivity(i)
        }
        return root
    }


}
