package com.motasem.ziad.fragments.Fragments


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import com.motasem.ziad.fragments.R
import com.motasem.ziad.fragments.model.DataModel
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_login.view.*

/**
 * A simple [Fragment] subclass.
 */
class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_login, container, false)
        root.btnLogin.setOnClickListener {
            if (root.edUsername.text.isNotEmpty() && root.edPassword.text.isNotEmpty()) {
                val b = Bundle()

             /*   b.putInt("id", 120181826)
                b.putString("username", root.edUsername.text.toString())
                b.putString("password", root.edPassword.text.toString())
                b.putBoolean("isChecked", root.cbRemember.isChecked) */
                val userModel = DataModel(120181826, root.edUsername.text.toString(), root.edPassword.text.toString(), root.cbRemember.isChecked )
                b.putParcelable("user", userModel)
                val fragment = HomeFragment()
                fragment.arguments = b
                activity!!.supportFragmentManager.beginTransaction()
                    .replace(R.id.mainContainer, fragment).addToBackStack(null).commit()
            } else {
                Toast.makeText(activity, "Fill feilds", Toast.LENGTH_SHORT).show()
            }
        }
        return root
    }


}
