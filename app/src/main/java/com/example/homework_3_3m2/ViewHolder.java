package com.example.homework_3_3m2;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class ViewHolder extends RecyclerView.ViewHolder {
    private ImageView doramaImg;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        doramaImg = itemView.findViewById(R.id.img_dorama);
    }
    public void bind(DoramaModel dorama){
        Glide.with(doramaImg).load(dorama.getImg()).into(doramaImg);
    }
}
