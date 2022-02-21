package com.motasem.ziad.lab10.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.GridLayoutManager

import com.motasem.ziad.lab10.R
import com.motasem.ziad.lab10.adapter.MovieAdapter
import com.motasem.ziad.lab10.adapter.MusicAdapter
import com.motasem.ziad.lab10.model.Movie
import kotlinx.android.synthetic.main.fragment_movie.*

/**
 * A simple [Fragment] subclass.
 */
class MovieFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_movie, container, false)
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {

        val data = ArrayList<Movie>()
        data.add(Movie("Foreign Exchange","2 parts",R.drawable.foreign_exchange))
        data.add(Movie("Girls with Balls","3 parts",R.drawable.girls_with_balls))
        data.add(Movie("Human Affairs","1 part",R.drawable.human_affairs))
        data.add(Movie("I am Mother","3 parts",R.drawable.i_am_mother))
        data.add(Movie("Mission Impossible","4 parts",R.drawable.mission_impossible))
        data.add(Movie("Origin Unknown","3 parts",R.drawable.origin_unknown))
        data.add(Movie("Spider Man","2 parts",R.drawable.spider_man))
        data.add(Movie("Still Alive","5 parts",R.drawable.still_alice))
        data.add(Movie("Stoker","2 parts",R.drawable.stoker))
        data.add(Movie("Champion","3 parts",R.drawable.champions))
        data.add(Movie("Foreign Exchange","2 parts",R.drawable.foreign_exchange))
        data.add(Movie("Girls with Balls","3 parts",R.drawable.girls_with_balls))
        data.add(Movie("Human Affairs","1 part",R.drawable.human_affairs))
        data.add(Movie("I am Mother","3 parts",R.drawable.i_am_mother))
        data.add(Movie("Mission Impossible","4 parts",R.drawable.mission_impossible))
        data.add(Movie("Origin Unknown","3 parts",R.drawable.origin_unknown))
        data.add(Movie("Spider Man","2 parts",R.drawable.spider_man))
        data.add(Movie("Still Alive","5 parts",R.drawable.still_alice))
        data.add(Movie("Stoker","2 parts",R.drawable.stoker))
        data.add(Movie("The Hitman Bodyguard","3 parts",R.drawable.the_hitmans_bodyguard))
        data.add(Movie("The Room","2 parts",R.drawable.the_room))
        data.add(Movie("Unlocked","1 part",R.drawable.unlocked))
        data.add(Movie("The Girl in The Spider Web","2 parts",R.drawable.the_girl_in_the_spiders_web))
        data.add(Movie("Mechanic Resurrection","3 part",R.drawable.mechanic_resurrection))
        data.add(Movie("Alpha Zero AI","2 part",R.drawable.alpha_zero))
        data.add(Movie("The Girl in The Spider Web","2 parts",R.drawable.the_girl_in_the_spiders_web))

        rvMovie.layoutManager = GridLayoutManager(activity,2)
        rvMovie.setHasFixedSize(true)

        var movieAdapter = MovieAdapter(activity as FragmentActivity, data)
        rvMovie.adapter = movieAdapter
        super.onActivityCreated(savedInstanceState)
    }

     fun onClick(position: Int) {
        Toast.makeText(activity, "you clicked on Item ${position.toString()}", Toast.LENGTH_SHORT).show()
    }

}
