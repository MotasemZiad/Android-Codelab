package com.motasem.ziad.lab10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.motasem.ziad.lab10.adapter.MusicAdapter
import com.motasem.ziad.lab10.fragment.MovieFragment
import com.motasem.ziad.lab10.model.Music
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MusicAdapter.onClickItem {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = mutableListOf<Music>()

        list.add(Music("Ahmed Ali", "0599838964", R.drawable.alpha_zero))
        list.add(Music("Mahmoud Bonga", "0599345964", R.drawable.alpha_zero))
        list.add(Music("Sameer Gogo", "05998567564", R.drawable.alpha_zero))
        list.add(Music("Khalil Saleem", "05956738964", R.drawable.alpha_zero))
        list.add(Music("Fawzy Sameer", "0599435964", R.drawable.alpha_zero))
        list.add(Music("Hassan Ahmed", "0599838934", R.drawable.alpha_zero))
        list.add(Music("Motasem Ziad", "0591238964", R.drawable.alpha_zero))
        list.add(Music("Fadi Same", "0599812364", R.drawable.alpha_zero))
        list.add(Music("Ahmed Sami", "0593468964", R.drawable.alpha_zero))
        list.add(Music("Khorkhy Boalaam", "0594568964", R.drawable.alpha_zero))
        list.add(Music("Necolas Khory", "0599345964", R.drawable.alpha_zero))
        list.add(Music("Mahmoud Bonga", "0599345964", R.drawable.alpha_zero))
        list.add(Music("Sameer Gogo", "05998567564", R.drawable.alpha_zero))
        list.add(Music("Khalil Saleem", "05956738964", R.drawable.alpha_zero))
        list.add(Music("Fawzy Sameer", "0599435964", R.drawable.alpha_zero))
        list.add(Music("Hany Deema", "0599234964", R.drawable.alpha_zero))
        list.add(Music("Fadi Same", "0599812364", R.drawable.alpha_zero))
        list.add(Music("Ahmed Sami", "0593468964", R.drawable.alpha_zero))
        list.add(Music("Khorkhy Boalaam", "0594568964", R.drawable.alpha_zero))
        list.add(Music("Necolas Khory", "0599345964", R.drawable.alpha_zero))
        list.add(Music("Mahmoud Bonga", "0599345964", R.drawable.alpha_zero))
        list.add(Music("Sameer Gogo", "05998567564", R.drawable.alpha_zero))
        list.add(Music("Khalil Saleem", "05956738964", R.drawable.alpha_zero))
        list.add(Music("Fawzy Sameer", "0599435964", R.drawable.alpha_zero))
        list.add(Music("Hany Deema", "0599234964", R.drawable.alpha_zero))

        rvMusic.layoutManager = LinearLayoutManager(this)
        rvMusic.setHasFixedSize(true)

        val musicAdapter = MusicAdapter(this, list, this)
        rvMusic.adapter = musicAdapter


    }

    override fun onClick(position: Int) {
        Toast.makeText(this, "you clicked on Item ${position.toString()}", Toast.LENGTH_SHORT)
            .show()
        val intent = Intent(this, Act2Activity::class.java)
        startActivity(intent)
    }
}
