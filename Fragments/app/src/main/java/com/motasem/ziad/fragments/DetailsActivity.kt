package com.motasem.ziad.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.motasem.ziad.fragments.Fragments.F1Fragment
import com.motasem.ziad.fragments.Fragments.F2Fragment
import com.motasem.ziad.fragments.Fragments.LoginFragment
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val name = intent.getStringExtra("name")
        Toast.makeText(this,name,Toast.LENGTH_LONG).show()

      // supportFragmentManager.beginTransaction().replace(R.id.mainContainer, F1Fragment()).commit()

        btnFrag1.setOnClickListener {
            val fm = supportFragmentManager
            val transaction = fm.beginTransaction()
            transaction.replace(R.id.mainContainer, F1Fragment())
            transaction.commit()
        }
           btnFrag2.setOnClickListener {
            val fm = supportFragmentManager
            val transaction = fm.beginTransaction()
            transaction.replace(R.id.mainContainer, F2Fragment())
            transaction.commit()
        }
        btnFrag3.setOnClickListener {
            val fm = supportFragmentManager
            val transaction = fm.beginTransaction()
            transaction.replace(R.id.mainContainer, LoginFragment())
            transaction.commit()
        }



    }
}
