package com.motasem.ziad.lab7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.motasem.ziad.lab7.adapter.ProgrammingAdapter
import com.motasem.ziad.lab7.model.ProgrammingLanguages
import kotlinx.android.synthetic.main.activity_act2.*

class Act2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act2)

        val name = intent.getStringExtra("name")
        Toast.makeText(this, name, Toast.LENGTH_LONG).show()

        val list = ArrayList<ProgrammingLanguages>()

        list.add(ProgrammingLanguages(0, "Java", R.drawable.java))
        list.add(ProgrammingLanguages(0, "JavaScript", R.drawable.javascript))
        list.add(ProgrammingLanguages(0, "Python", R.drawable.python))
        list.add(ProgrammingLanguages(0, "Html5", R.drawable.html_5))
        list.add(ProgrammingLanguages(0, "Css3", R.drawable.css_3))
        list.add(ProgrammingLanguages(0, "PhP", R.drawable.php))

        list.add(ProgrammingLanguages(0, "Java", R.drawable.java))
        list.add(ProgrammingLanguages(0, "JavaScript", R.drawable.javascript))
        list.add(ProgrammingLanguages(0, "Python", R.drawable.python))
        list.add(ProgrammingLanguages(0, "Html5", R.drawable.html_5))
        list.add(ProgrammingLanguages(0, "Css3", R.drawable.css_3))
        list.add(ProgrammingLanguages(0, "PhP", R.drawable.php))

        list.add(ProgrammingLanguages(0, "Java", R.drawable.java))
        list.add(ProgrammingLanguages(0, "JavaScript", R.drawable.javascript))
        list.add(ProgrammingLanguages(0, "Python", R.drawable.python))
        list.add(ProgrammingLanguages(0, "Html5", R.drawable.html_5))
        list.add(ProgrammingLanguages(0, "Css3", R.drawable.css_3))
        list.add(ProgrammingLanguages(0, "PhP", R.drawable.php))

        list.add(ProgrammingLanguages(0, "Java", R.drawable.java))
        list.add(ProgrammingLanguages(0, "JavaScript", R.drawable.javascript))
        list.add(ProgrammingLanguages(0, "Python", R.drawable.python))
        list.add(ProgrammingLanguages(0, "Html5", R.drawable.html_5))
        list.add(ProgrammingLanguages(0, "Css3", R.drawable.css_3))
        list.add(ProgrammingLanguages(0, "PhP", R.drawable.php))

        list.add(ProgrammingLanguages(0, "Java", R.drawable.java))
        list.add(ProgrammingLanguages(0, "JavaScript", R.drawable.javascript))
        list.add(ProgrammingLanguages(0, "Python", R.drawable.python))
        list.add(ProgrammingLanguages(0, "Html5", R.drawable.html_5))
        list.add(ProgrammingLanguages(0, "Css3", R.drawable.css_3))
        list.add(ProgrammingLanguages(0, "PhP", R.drawable.php))

        list.add(ProgrammingLanguages(0, "Java", R.drawable.java))
        list.add(ProgrammingLanguages(0, "JavaScript", R.drawable.javascript))
        list.add(ProgrammingLanguages(0, "Python", R.drawable.python))
        list.add(ProgrammingLanguages(0, "Html5", R.drawable.html_5))
        list.add(ProgrammingLanguages(0, "Css3", R.drawable.css_3))
        list.add(ProgrammingLanguages(0, "PhP", R.drawable.php))


        val arrayAdapter = ProgrammingAdapter(this,list)
        gdProg.adapter = arrayAdapter
    }
}
