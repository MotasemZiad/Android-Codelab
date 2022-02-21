package com.motasem.ziad.lab9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView
import com.motasem.ziad.lab9.fragment.FirstFragment
import com.motasem.ziad.lab9.fragment.SecondFragment
import com.motasem.ziad.lab9.fragment.ThirdFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.tool_bar.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        replaceFragment(FirstFragment())

        setSupportActionBar(toolbar)
        var toggle = ActionBarDrawerToggle(this, drawer, toolbar, 0, 0)
        drawer.addDrawerListener(toggle)
        toggle.syncState()
    }

    override fun onNavigationItemSelected(p0: MenuItem): Boolean {
        when (p0.itemId) {
            R.id.nav_first_fragment -> replaceFragment(FirstFragment())
                R.id.nav_second_fragment -> replaceFragment(SecondFragment())
                R.id.nav_third_fragment -> replaceFragment(ThirdFragment())
        }
        return true
    }

    fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.toolbar, fragment).commit()
    }
}
