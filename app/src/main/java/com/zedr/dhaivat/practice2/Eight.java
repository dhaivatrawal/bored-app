package com.zedr.dhaivat.practice2;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Eight extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    private List<Club> clubs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eight);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerViewAdapterEight adapter = new RecyclerViewAdapterEight(clubs);

        initializeData();
        initializeAdapter();
    }

    private void initializeAdapter() {

        RecyclerViewAdapterEight adapter = new RecyclerViewAdapterEight(clubs);
        recyclerView.setAdapter(adapter);

    }

    private void initializeData() {

        clubs= new ArrayList<>();
        clubs.add(new Eight.Club("Watch some Netflix (yes that's on here twice, it's a good cure for boredom)."));
        clubs.add(new Eight.Club("Scroll through Pinterest."));
        clubs.add(new Eight.Club("Online shop."));
        clubs.add(new Eight.Club("Watch a favorite movie or a movie you haven't seen in a while."));
        clubs.add(new Eight.Club("Recruit some friends and play a game. "));
        clubs.add(new Eight.Club("Start an Instagram page for your pet."));
        clubs.add(new Eight.Club("Watch a documentary."));
        clubs.add(new Eight.Club("Go to the movies."));
        clubs.add(new Eight.Club("Write love notes for your S.O."));
        clubs.add(new Eight.Club("Tye-dye clothes or bedsheets."));
        clubs.add(new Eight.Club("Watch YouTube videos."));
        clubs.add(new Eight.Club("Facetime your friends or family."));
        clubs.add(new Eight.Club("Get lost on Tumblr."));
        clubs.add(new Eight.Club("Do something crafty."));
        clubs.add(new Eight.Club("Go mini-golfing."));
        clubs.add(new Eight.Club("Make a collage."));
        clubs.add(new Eight.Club("Make a bucket list."));
        clubs.add(new Eight.Club("Take some selfies."));
        clubs.add(new Eight.Club("Go bowling."));
        clubs.add(new Eight.Club("Plan your dream wedding."));
        clubs.add(new Eight.Club("Read a magazine."));
        clubs.add(new Eight.Club("Catch up on celebrity gossip."));
        clubs.add(new Eight.Club("Go to a play or musical."));
        clubs.add(new Eight.Club("Sing & dance to your favorite songs."));
        clubs.add(new Eight.Club("Go to a sports game or big event."));
    }

    class Club {

        String nameone,nametwo;
        public Club(String nametwo) {


            this.nametwo=nametwo;

        }
    }


}
