package com.app.activities

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.R
import com.app.api.models.Movie
import com.app.api.models.Similar
import com.app.mvp.main.Interfaces.IMainView
import com.app.mvp.main.MainPresenter
import com.app.utils.Constants
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity(), IMainView {
    private var mAdapter: RecycleViewAdapter? = null
    var header_image: ImageView? = null
    var similar_list: RecyclerView? = null
    var txtTitle: TextView? = null
    var txtLikes: TextView? = null
    var txtPopularity: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MainPresenter(this)
    }

    override fun setupHeader(movie: Movie) {
        header_image = findViewById(R.id.header_image)
        similar_list = findViewById(R.id.similar_list)
        txtTitle = findViewById(R.id.txtTitle)
        txtPopularity = findViewById(R.id.txtPopularity)
        txtLikes = findViewById(R.id.txtLikes)

        similar_list?.isNestedScrollingEnabled = false
        txtTitle?.text  = movie.original_title
        txtPopularity?.text  = movie.popularity.toString() + "Watched"
        txtLikes?.text = movie.vote_count.toString() + " Likes"

        header_image?.let {
            Glide.with(this)
                .load(Constants.url_img + movie.poster_path)
                .centerCrop()
                .into(it)
        }
    }

    override fun setupRecycleSimilar(similar: Similar) {
        val layoutManager: LinearLayoutManager
        layoutManager = LinearLayoutManager(this)
        similar_list?.layoutManager = layoutManager
        mAdapter = RecycleViewAdapter(similar.results)
        similar_list?.adapter = mAdapter
    }
}