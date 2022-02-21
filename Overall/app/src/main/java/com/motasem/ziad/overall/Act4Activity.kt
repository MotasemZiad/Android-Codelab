package com.motasem.ziad.overall

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.motasem.ziad.overall.adapter.FruitAdapter
import com.motasem.ziad.overall.model.Fruit
import kotlinx.android.synthetic.main.activity_act4.*

class Act4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act4)

        btnGoToAct5.setOnClickListener {
            val intent = Intent(this, Act5Activity::class.java)
            intent.putExtra("define", "THIS IS AVTIVITY 5 !!")
            startActivity(intent)
        }

        val define = intent.getStringExtra("define")
        Toast.makeText(this, define, Toast.LENGTH_LONG).show()

        registerForContextMenu(lvDataFruit)

        val data = mutableListOf<Fruit>()

        data.add(
            Fruit(
                1,
                "Apple",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum lorem lorem, feugiat quis urna ac, interdum placerat nisl. Nullam euismod ante eget nisi fermentum fermentum. ",
                R.drawable.apple
            )
        )
        data.add(
            Fruit(
                2,
                "Banana",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum lorem lorem, feugiat quis urna ac, interdum placerat nisl. Nullam euismod ante eget nisi fermentum fermentum. ",
                R.drawable.banana
            )
        )
        data.add(
            Fruit(
                3,
                "Cherry",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum lorem lorem, feugiat quis urna ac, interdum placerat nisl. Nullam euismod ante eget nisi fermentum fermentum. ",
                R.drawable.cherry
            )
        )
        data.add(
            Fruit(
                4,
                "Strawberry",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum lorem lorem, feugiat quis urna ac, interdum placerat nisl. Nullam euismod ante eget nisi fermentum fermentum. ",
                R.drawable.strawberry
            )
        )
        data.add(
            Fruit(
                5,
                "Avocado",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum lorem lorem, feugiat quis urna ac, interdum placerat nisl. Nullam euismod ante eget nisi fermentum fermentum. ",
                R.drawable.avocado
            )
        )
        data.add(
            Fruit(
                6,
                "Lemon",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum lorem lorem, feugiat quis urna ac, interdum placerat nisl. Nullam euismod ante eget nisi fermentum fermentum. ",
                R.drawable.lemon
            )
        )
        data.add(
            Fruit(
                7,
                "Apple",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum lorem lorem, feugiat quis urna ac, interdum placerat nisl. Nullam euismod ante eget nisi fermentum fermentum. ",
                R.drawable.apple
            )
        )
        data.add(
            Fruit(
                8,
                "Banana",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum lorem lorem, feugiat quis urna ac, interdum placerat nisl. Nullam euismod ante eget nisi fermentum fermentum. ",
                R.drawable.banana
            )
        )
        data.add(
            Fruit(
                9,
                "Cherry",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum lorem lorem, feugiat quis urna ac, interdum placerat nisl. Nullam euismod ante eget nisi fermentum fermentum. ",
                R.drawable.cherry
            )
        )
        data.add(
            Fruit(
                10,
                "Strawberry",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum lorem lorem, feugiat quis urna ac, interdum placerat nisl. Nullam euismod ante eget nisi fermentum fermentum. ",
                R.drawable.strawberry
            )
        )
        data.add(
            Fruit(
                11,
                "Lemon",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum lorem lorem, feugiat quis urna ac, interdum placerat nisl. Nullam euismod ante eget nisi fermentum fermentum. ",
                R.drawable.lemon
            )
        )
        data.add(
            Fruit(
                12,
                "Avocado",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum lorem lorem, feugiat quis urna ac, interdum placerat nisl. Nullam euismod ante eget nisi fermentum fermentum. ",
                R.drawable.avocado
            )
        )
        data.add(
            Fruit(
                13,
                "Apple",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum lorem lorem, feugiat quis urna ac, interdum placerat nisl. Nullam euismod ante eget nisi fermentum fermentum. ",
                R.drawable.apple
            )
        )
        data.add(
            Fruit(
                14,
                "Banana",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum lorem lorem, feugiat quis urna ac, interdum placerat nisl. Nullam euismod ante eget nisi fermentum fermentum. ",
                R.drawable.banana
            )
        )
        data.add(
            Fruit(
                15,
                "Strawberry",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum lorem lorem, feugiat quis urna ac, interdum placerat nisl. Nullam euismod ante eget nisi fermentum fermentum. ",
                R.drawable.strawberry
            )
        )
        data.add(
            Fruit(
                16,
                "Cherry",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum lorem lorem, feugiat quis urna ac, interdum placerat nisl. Nullam euismod ante eget nisi fermentum fermentum. ",
                R.drawable.cherry
            )
        )
        data.add(
            Fruit(
                17,
                "Lemon",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum lorem lorem, feugiat quis urna ac, interdum placerat nisl. Nullam euismod ante eget nisi fermentum fermentum. ",
                R.drawable.lemon
            )
        )
        data.add(
            Fruit(
                18,
                "Avocado",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum lorem lorem, feugiat quis urna ac, interdum placerat nisl. Nullam euismod ante eget nisi fermentum fermentum. ",
                R.drawable.avocado
            )
        )
        data.add(
            Fruit(
                19,
                "Banana",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum lorem lorem, feugiat quis urna ac, interdum placerat nisl. Nullam euismod ante eget nisi fermentum fermentum. ",
                R.drawable.banana
            )
        )
        data.add(
            Fruit(
                20,
                "Apple",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum lorem lorem.",
                R.drawable.apple
            )
        )

        val fruitAdapter = FruitAdapter(this, data as ArrayList<Fruit>)
        lvDataFruit.adapter = fruitAdapter
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        menuInflater.inflate(R.menu.context_menu, menu)
        menu!!.setHeaderTitle("Select Action")
        super.onCreateContextMenu(menu, v, menuInfo)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.select -> Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
            R.id.insert -> Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
            R.id.delete -> Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
        }
        return super.onContextItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.app_bar_search -> Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
            R.id.open -> Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
            R.id.openRecent -> Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
            R.id.share -> Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
            R.id.edit -> Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
            R.id.copy -> Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}
