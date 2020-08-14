package com.app.api

import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory

class MovieClient {
    private val retrofit: Retrofit
    val service: MovieService
        get() = retrofit.create(MovieService::class.java)

    init {
        retrofit = Retrofit.Builder()
                .baseUrl("https://api.themoviedb.org/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build()
    }
}