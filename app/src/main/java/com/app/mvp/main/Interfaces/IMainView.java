package com.app.mvp.main.Interfaces;

import com.app.api.models.Movie;
import com.app.api.models.Similar;

public interface IMainView {
    void setupHeader(Movie movie);
    void setupRecycleSimilar(Similar similar);
}
