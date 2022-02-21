package com.motasem.ziad.lab10.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.motasem.ziad.lab10.R
import com.motasem.ziad.lab10.model.Movie
import kotlinx.android.synthetic.main.movie_item.view.*

class MovieAdapter(
    val activity: Activity,
    val items: ArrayList<Movie>) : RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {
    class MyViewHolder(item: View) : RecyclerView.ViewHolder(item) {

        val movieName = item.tvMovieName
        val parts = item.tvMovieParts
        val image = item.img_movie
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val root = LayoutInflater.from(activity).inflate(R.layout.movie_item, parent, false)
        return MyViewHolder(root)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.movieName.text = items[position].name
        holder.parts.text = items[position].parts
        holder.image.setImageResource(items[position].image_movie)
        }
    }
