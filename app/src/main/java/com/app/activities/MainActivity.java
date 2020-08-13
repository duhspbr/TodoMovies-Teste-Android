package com.app.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.app.R;
import com.app.mvp.main.Interfaces.IMainPresenter;
import com.app.mvp.main.Interfaces.IMainView;
import com.app.mvp.main.MainPresenter;

public class MainActivity extends AppCompatActivity implements IMainView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new MainPresenter(this);
    }


}