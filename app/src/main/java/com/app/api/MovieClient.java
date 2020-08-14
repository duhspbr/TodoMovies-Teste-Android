package com.app.api;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class MovieClient {

    private final Retrofit retrofit;

    public MovieClient() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl("https://api.themoviedb.org/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    public MovieService getService() {
        return this.retrofit.create(MovieService.class);
    }
}
