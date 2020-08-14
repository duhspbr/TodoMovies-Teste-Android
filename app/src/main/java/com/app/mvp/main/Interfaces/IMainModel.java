package com.app.mvp.main.Interfaces;

import com.app.api.models.Movie;

public interface IMainModel {
    void getMovies(IMovieCallBack callBack);
    void getSimilar(ISimilarCallback callback);
}


