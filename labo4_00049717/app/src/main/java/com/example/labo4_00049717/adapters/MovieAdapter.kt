package com.example.labo4_00049717.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.labo4_00049717.R
import com.example.labo4_00049717.pojos.Movie
import kotlinx.android.synthetic.main.cardview_movie.view.*

class MovieAdapter (var movies: List<Movie>, val clickListener: (Movie)-> Unit): RecyclerView.Adapter<MovieAdapter.ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MovieAdapter.ViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.cardview_movie, p0, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int= movies.size


    override fun onBindViewHolder(holder: MovieAdapter.ViewHolder, pos: Int) {
        holder.bind(movies[pos], clickListener)

    }

    fun changeList(movies: List<Movie>){
        this.movies = movies
        notifyDataSetChanged()  //avisa al manager que debe de volver a cargar la info y asi actualizar la lista, esto es cuando agrego o modifico cada viewHolder del recyclerView
    }


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(
            item: Movie, clickListener: (Movie)-> Unit) = with(itemView){
            Glide.with(itemView.context)
                .load(item.Poster)
                .placeholder(R.drawable.ic_launcher_background)
                .into(movie_image_cv)

            movie_title_cv.text = item.Tittle
            movie_plot_cv.text = item.Plot
            movie_rate_cv.text = item.imdbRating
            movie_runtime_cv.text = item.Runtime
            this.setOnClickListener{clickListener(item)}
        }
    }


}



