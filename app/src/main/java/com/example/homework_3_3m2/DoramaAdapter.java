package com.example.homework_3_3m2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class DoramaAdapter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<DoramaModel> doramaList;

    public DoramaAdapter(ArrayList<DoramaModel> doramaList) {
        this.doramaList = doramaList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dorama, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(doramaList.get(position));
    }

    @Override
    public int getItemCount() {
        return doramaList.size();
    }
}
