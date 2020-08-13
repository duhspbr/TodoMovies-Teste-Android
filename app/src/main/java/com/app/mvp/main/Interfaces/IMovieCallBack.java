package com.app.mvp.main.Interfaces;

import com.app.api.models.Movie;

public interface IMovieCallBack {
        void OnResponse(Movie movie);
        void OnFailure(String message);
    }

