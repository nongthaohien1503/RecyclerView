package com.example.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;

public class WordViewHolder extends RecyclerView.ViewHolder {

    private final Adapter mAdapter;
    public ImageView avatar;
    public TextView name;

    public TextView description;

    public WordViewHolder(View itemView, Adapter adapter) {
        super(itemView);
        avatar = itemView.findViewById(R.id.avatar);
        name = itemView.findViewById(R.id.name);
        description = itemView.findViewById(R.id.description);
        this.mAdapter = adapter;
    }
}
