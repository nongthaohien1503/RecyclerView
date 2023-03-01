package com.example.myapplication;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private List<MyItem> mDataset;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView avatar;
        public TextView name;
        public TextView description;

        public MyViewHolder(View itemView) {
            super(itemView);
            avatar = itemView.findViewById(R.id.avatar);
            name = itemView.findViewById(R.id.name);
            description = itemView.findViewById(R.id.description);
        }
    }

    public Adapter(List<MyItem> myDataset) {
        mDataset = myDataset;
    }

    @Override
    public Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.itemlayout, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MyItem item = mDataset.get(position);
        holder.avatar.setImageResource(item.getImageResource());
        holder.name.setText(item.getName());
        holder.description.setText(item.getDescription());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), SubActivity.class);
                intent.putExtra("imageSource", item.getImageResource());
                intent.putExtra("name", item.getName());
                intent.putExtra("description", item.getDescription());
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}

