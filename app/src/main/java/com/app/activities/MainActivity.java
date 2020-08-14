package com.app.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.app.R;
import com.app.api.models.Movie;
import com.app.api.models.Similar;
import com.app.mvp.main.Interfaces.IMainPresenter;
import com.app.mvp.main.Interfaces.IMainView;
import com.app.mvp.main.MainPresenter;
import com.app.utils.Constants;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MainActivity<LineAdapter> extends AppCompatActivity implements IMainView {

    RecyclerView mRecyclerView;
    private LineAdapter mAdapter;
    ImageView header_image;
    RecyclerView similar_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new MainPresenter(this);

    }

    @Override
    public void setupHeader(Movie movie) {
        header_image = findViewById(R.id.header_image);
        similar_list = findViewById(R.id.similar_list);
        similar_list.setNestedScrollingEnabled(false);

        Glide.with(this)
                .load(Constants.url_img+movie.getPoster_path())
                .centerCrop()
                .into(header_image);
    }

    @Override
    public void setupRecycleSimilar(Similar similar) {
//        LinearLayoutManager layoutManager;
//        layoutManager = new LinearLayoutManager(this);
//        mRecyclerView.setLayoutManager(layoutManager);
//
//        mAdapter = new LineAdapter(new ArrayList<>(0));
//        mRecyclerView.setAdapter(mAdapter);
//
//        mRecyclerView.addItemDecoration(
//                new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}