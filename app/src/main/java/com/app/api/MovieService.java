package com.app.api;

import com.app.api.models.Movie;
import com.app.utils.Constants;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MovieService {
    @GET("/movie/"+ Constants.fixed_movie + Constants.apikey)
    Call<Movie> buscarMovie();
}
