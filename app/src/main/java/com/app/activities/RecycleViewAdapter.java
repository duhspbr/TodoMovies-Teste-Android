package com.app.activities;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.R;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.RecycleViewHolder> {

//    private final List<UserModel> mUsers;
//
//    public LineAdapter(ArrayList users) {
//        mUsers = users;
//    }

    @Override
    public RecycleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RecycleViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.items_similar, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewHolder holder, int position) {
//        holder.moreButton.setOnClickListener(view -> updateItem(position));
//        holder.deleteButton.setOnClickListener(view -> removerItem(position));
    }

    @Override
    public int getItemCount() {
        return 0;
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

