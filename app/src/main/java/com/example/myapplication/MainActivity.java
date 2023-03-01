package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    public Adapter mApdapter;
    ArrayList<MyItem> myDataset = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDataset.add(new MyItem(R.drawable.kimnamjoon,"Kim Namjoon", "Bangtan Boys's Leader, Korean: 김남준; born September 12, 1994. On June 13, 2013, RM made his debut with BTS and has since produced and written lyrics for many tracks on their albums."));
        myDataset.add(new MyItem(R.drawable.kimseokjin,"Kim Seokjin", "Bangtan Boys's Member, Korean: 김석진; born December 4, 1992, On June 13, 2013, Kim made his debut as one of the four vocalists in BTS with their debut single album 2 Cool 4 Skool."));
        myDataset.add(new MyItem(R.drawable.minyoongi,"Min Yoongi", "Bangtan Boys's Member, Korean: 민윤기; born March 9, 1993. Originally joining the company as a music producer, Suga trained under Big Hit Entertainment for three years alongside members J-Hope and RM. He made his debut as a member of BTS on Mnet's M Countdown with the track \"No More Dream\" from their debut single album 2 Cool 4 Skool."));
        myDataset.add(new MyItem(R.drawable.junghoseok,"Jung Hoseok", "Bangtan Boys's Member, Korean: 정호석; born February 18, 1994. On June 13, 2013, J-Hope made his debut as a member of BTS on M! Countdown. He was the third member to join the band as a trainee after RM and Suga."));
        myDataset.add(new MyItem(R.drawable.parkjimin,"Park Jimin", "Bangtan Boys's Member, Korean: 박지민; born October 13, 1995. Jimin debuted as a vocalist and dancer in BTS on June 13, 2013."));
        myDataset.add(new MyItem(R.drawable.kimtaehyung,"Kim Taehyung", "Bangtan Boys's Member, Korean: 김태형; born December 30, 1995. Pre-debut, he was the \"secret member\" of BTS. Fans were unaware of his existence as his agency wished to keep him a surprise. He stated the concept had made him feel uneasy and lonely as he thought it was because he might get cut from the lineup."));
        myDataset.add(new MyItem(R.drawable.joenjungkook,"Joen Jungkook", "Bangtan Boys's Member, Korean: 전정국; born September 1, 1997. On June 12, 2013, Jungkook made his debut as a member of BTS with the release of the single 2 Cool 4 Skool."));

        mRecyclerView = findViewById(R.id.main);
        mApdapter = new Adapter(myDataset);
        mRecyclerView.setAdapter(mApdapter);
        mRecyclerView.setLayoutManager (new LinearLayoutManager(this));

    }
}