package com.app.activities;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.R;
import com.app.api.models.Movie;
import com.app.utils.Constants;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.RecycleViewHolder> {

    private final ArrayList<Movie> movies;

   public RecycleViewAdapter(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public RecycleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RecycleViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.items_similar, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewHolder holder, int position) {
        holder.title.setText(this.movies.get(position).getOriginal_title());
        holder.Year.setText(this.movies.get(position).getRelease_date().substring(0, 4));

        Glide.with(holder.imgSimilar.getContext())
                .load(Constants.url_img+this.movies.get(position).getPoster_path())
                .into(holder.imgSimilar);
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }


    public class RecycleViewHolder extends RecyclerView.ViewHolder {

        public TextView title;
        public ImageView imgSimilar;
        public TextView Year;
        public TextView type;

        public RecycleViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.txtTitle);
            imgSimilar = (ImageView) itemView.findViewById(R.id.similar_img);
            Year = (TextView) itemView.findViewById(R.id.txtYear);
            type = (TextView) itemView.findViewById(R.id.txtType);
        }
    }
}

