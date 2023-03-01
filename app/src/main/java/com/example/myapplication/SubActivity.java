package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SubActivity extends AppCompatActivity {

    ImageView avatar;
    TextView name, description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent intent = this.getIntent();
        intent.getIntExtra("imageSource",0);
        intent.getStringExtra("name");
        intent.getStringExtra("description");

        avatar = findViewById(R.id.avatar2);
        name = findViewById(R.id.name2);
        description = findViewById(R.id.description2);

        avatar.setImageResource(intent.getIntExtra("imageSource",0));
        name.setText(intent.getStringExtra("name"));
        description.setText(intent.getStringExtra("description"));


    }
}