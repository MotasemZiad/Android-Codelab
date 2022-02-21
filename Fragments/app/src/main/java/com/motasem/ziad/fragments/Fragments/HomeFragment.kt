package com.motasem.ziad.fragments.Fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.motasem.ziad.fragments.R
import com.motasem.ziad.fragments.model.DataModel
import kotlinx.android.synthetic.main.fragment_home.view.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val b = arguments
        if(b!=null){

         /*   val userId = b.getInt("id")
            val username = b.getString("username")
            val password = b.getString("password")
            val isChecked = b.getBoolean("isChecked") */

           // root.tvData.text = "Userid: $userId\nUsername: $username\nPassword: $password\nisChecked: $isChecked"

            val user = b.getParcelable<DataModel>("user")
            root.tvData.text = "UserModel: ${user.toString()}"
        }else
            root.tvData.text = "No Data"
        return root
    }


}
