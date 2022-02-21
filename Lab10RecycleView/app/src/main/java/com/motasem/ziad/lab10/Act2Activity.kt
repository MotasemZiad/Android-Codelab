package com.motasem.ziad.lab10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.motasem.ziad.lab10.fragment.MovieFragment

class Act2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act2)

        supportFragmentManager.beginTransaction().replace(R.id.main2Container, MovieFragment())
            .addToBackStack(null).commit()

    }
}
