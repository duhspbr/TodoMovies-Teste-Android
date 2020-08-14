package com.app.mvp.main

import com.app.api.models.Movie
import com.app.api.models.Similar
import com.app.mvp.main.Interfaces.*

class MainPresenter(private val mainView: IMainView) : IMainPresenter {
    private val mainModel: IMainModel
    val movies: Unit
        get() {
            mainModel.getMovies(object : IMovieCallBack {
                override fun OnResponse(movie: Movie) {
                    mainView.setupHeader(movie)
                }

                override fun OnFailure(message: String) {}
            })
            mainModel.getSimilar(object : ISimilarCallback {
                override fun OnResponse(similar: Similar) {
                    mainView.setupRecycleSimilar(similar)
                }

                override fun OnFailure(message: String) {}
            })
        }

    init {
        mainModel = MainModel()
        movies
    }
}