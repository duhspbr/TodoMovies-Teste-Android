package com.app.mvp.main;

import com.app.activities.MainActivity;
import com.app.api.MovieClient;
import com.app.api.models.Movie;
import com.app.mvp.main.Interfaces.IMainModel;
import com.app.mvp.main.Interfaces.IMainPresenter;
import com.app.mvp.main.Interfaces.IMainView;
import com.app.mvp.main.Interfaces.IMovieCallBack;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPresenter implements IMainPresenter {
    private IMainView mainView;
    private IMainModel mainModel;

    public MainPresenter(IMainView context) {
        this.mainView = context;
        this.mainModel = new MainModel();

        getMovies();
    }

    void getMovies() {
        mainModel.getMovies(new IMovieCallBack() {
            @Override
            public void OnResponse(Movie movie) {

            }

            @Override
            public void OnFailure(String message) {

            }
        });
    }
}
