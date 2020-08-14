package com.app.mvp.main;

import com.app.api.MovieClient;
import com.app.api.models.Movie;
import com.app.api.models.Similar;
import com.app.mvp.main.Interfaces.IMainModel;
import com.app.mvp.main.Interfaces.IMovieCallBack;
import com.app.mvp.main.Interfaces.ISimilarCallback;
import com.app.utils.Constants;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainModel implements IMainModel {
    MovieClient client = new MovieClient();
    @Override
    public void getMovies(final IMovieCallBack callBack) {
        client.getService().buscarMovie().enqueue(new Callback<Movie>() {
            @Override
            public void onResponse(Call<Movie> call, Response<Movie> response) {
                callBack.OnResponse(response.body());
            }

            @Override
            public void onFailure(Call<Movie> call, Throwable t) {
                callBack.OnFailure(t.getMessage());
            }
        });
    }

    @Override
    public void getSimilar(final ISimilarCallback callback) {
        client.getService().buscarSimilar().enqueue(new Callback<Similar>() {
            @Override
            public void onResponse(Call<Similar> call, Response<Similar> response) {
                callback.OnResponse(response.body());
            }

            @Override
            public void onFailure(Call<Similar> call, Throwable t) {
                callback.OnFailure(t.getMessage());
            }
        });
    }
}
