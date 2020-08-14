package com.app.api

import com.app.api.models.Movie
import com.app.api.models.Similar
import com.app.utils.Constants
import retrofit2.Call
import retrofit2.http.GET

interface MovieService {
    @GET("3/movie/" + Constants.fixed_movie + "?api_key=" + Constants.apikey)
    fun buscarMovie(): Call<Movie?>?

    @GET("3/movie/" + Constants.fixed_movie + "/similar" + "?api_key=" + Constants.apikey)
    fun buscarSimilar(): Call<Similar?>?
}