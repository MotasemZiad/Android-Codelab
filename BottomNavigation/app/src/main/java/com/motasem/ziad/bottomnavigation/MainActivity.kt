package com.motasem.ziad.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.motasem.ziad.bottomnavigation.fragment.DashboardFragment
import com.motasem.ziad.bottomnavigation.fragment.HomeFragment
import com.motasem.ziad.bottomnavigation.fragment.NotificationFragment
import com.motasem.ziad.bottomnavigation.fragment.ProfileFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    replaceFragment(HomeFragment())
                    return@OnNavigationItemSelectedListener true
                }
                R.id.dashboard -> {
                    replaceFragment(DashboardFragment())
                    return@OnNavigationItemSelectedListener true
                }
                R.id.notification -> {
                    replaceFragment(NotificationFragment())
                    return@OnNavigationItemSelectedListener true
                }
                R.id.profile -> {
                    replaceFragment(ProfileFragment())
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nav_view.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        nav_view.selectedItemId = R.id.home
    }

    fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(
            R.id.mainContainer,
            fragment
        ).commit()
    }
}
