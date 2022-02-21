package com.h.alrekhawi.fruitscustomlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.h.alrekhawi.fruitscustomlistview.adapter.FruitAdapter
import com.h.alrekhawi.fruitscustomlistview.model.Fruit
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fruit_item.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val arr = ArrayList<Fruit>()
        val data = mutableListOf<Fruit>()
        data.add(
            Fruit(
                0,
                "Apple",
                "Turpiss assimilant in pius divio! Hercle, ignigena velox!, usus! Vae. Vae. Sunt stellaes locus velox, placidus monses.",
                R.drawable.apple
            )
        )
        data.add(
            Fruit(
                1,
                "Banana",
                "Abaculus de nobilis ausus, attrahendam lactea! Heuretess assimilant in gandavum! Homos ridetis! A falsis, consilium germanus palus.",
                R.drawable.banana
            )
        )

        data.add(
            Fruit(
                2,
                "Banana",
                "Abaculus de nobilis ausus, attrahendam lactea! Heuretess assimilant in gandavum! Homos ridetis! A falsis, consilium germanus palus.",
                R.drawable.banana
            )
        )
        data.add(
            Fruit(
                3,
                "Apple",
                "Turpiss assimilant in pius divio! Hercle, ignigena velox!, usus! Vae. Vae. Sunt stellaes locus velox, placidus monses.",
                R.drawable.apple
            )
        )
        data.add(
            Fruit(
                4,
                "Banana",
                "Abaculus de nobilis ausus, attrahendam lactea! Heuretess assimilant in gandavum! Homos ridetis! A falsis, consilium germanus palus.",
                R.drawable.banana
            )
        )
        data.add(
            Fruit(
                5,
                "Apple",
                "Turpiss assimilant in pius divio! Hercle, ignigena velox!, usus! Vae. Vae. Sunt stellaes locus velox, placidus monses.",
                R.drawable.apple
            )
        )
        data.add(
            Fruit(
                6,
                "Banana",
                "Abaculus de nobilis ausus, attrahendam lactea! Heuretess assimilant in gandavum! Homos ridetis! A falsis, consilium germanus palus.",
                R.drawable.banana
            )
        )
        data.add(
            Fruit(
                7,
                "Apple",
                "Turpiss assimilant in pius divio! Hercle, ignigena velox!, usus! Vae. Vae. Sunt stellaes locus velox, placidus monses.",
                R.drawable.apple
            )
        )
        data.add(
            Fruit(
                8,
                "Banana",
                "Abaculus de nobilis ausus, attrahendam lactea! Heuretess assimilant in gandavum! Homos ridetis! A falsis, consilium germanus palus.",
                R.drawable.banana
            )
        )

        data.add(
            Fruit(
                9,
                "Apple",
                "Turpiss assimilant in pius divio! Hercle, ignigena velox!, usus! Vae. Vae. Sunt stellaes locus velox, placidus monses.",
                R.drawable.apple
            )
        )

        val fruitAdapter = FruitAdapter(this, data as ArrayList<Fruit>)
        lvFruites.adapter = fruitAdapter

        lvFruites.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this,"${data[i].name}",Toast.LENGTH_SHORT).show()
            //adapterView.getItemAtPosition(i)
            //fruitAdapter.getItem(i)
        }

        lvFruites.setOnItemLongClickListener { adapterView, view, i, l ->

            Toast.makeText(baseContext,"Long ${data[i].name}",Toast.LENGTH_SHORT).show()
            true
        }

    }
}
