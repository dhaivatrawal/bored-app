package com.zedr.dhaivat.practice2;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Nine extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    private List<Club> clubs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nine);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerViewAdapterNine adapter = new RecyclerViewAdapterNine(clubs);

        initializeData();
        initializeAdapter();
    }

    private void initializeAdapter() {

        RecyclerViewAdapterNine adapter = new RecyclerViewAdapterNine(clubs);
        recyclerView.setAdapter(adapter);

    }

    private void initializeData() {

        clubs= new ArrayList<>();
        clubs.add(new Nine.Club("Play a board game","Turn off the TV and challenge the family to a board game. Introduce the kids to a classic like Chutes N Ladders or Monopoly, or try a newer one like Settlers of Catan that you can all learn together."));
        clubs.add(new Nine.Club("Put together an epic puzzle","When you've got lots of time on your hands, get your hands busy. It'll take your mind off boredom, and completing a big puzzle feels great."));
        clubs.add(new Nine.Club("Watch a rom-com marathon","We'll admit it, romantic comedies have stolen our hearts."));
        clubs.add(new Nine.Club("Sing along to some Disney songs","Get your endorphins flowing by taking it back to childhood. Belt out your favorite musical hits from Disney movies!"));
        clubs.add(new Nine.Club("Plan your next getaway"," Don't just daydream about getting away from it all. Do one better and actually look up plane tickets and hotel rooms."));
        clubs.add(new Nine.Club("Build a fort","Kids know this already: The couch cushions or a few chairs and blankets make an awesome wonderland. Embrace your inner child, or let your kids show you the way."));
        clubs.add(new Nine.Club("Get a workout in","You don't need a gym membership to sweat it out. Pull on your favorite leggings, choose a workout app, and get your blood moving."));
        clubs.add(new Nine.Club("Write a letter","In the age of text messages and FaceTime, we don't write out our feelings in long form. Get out some nice paper and spread some love to a friend or family member."));
        clubs.add(new Nine.Club("Watch a sports game","No sports on TV? Queue up some classic old games."));
        clubs.add(new Nine.Club("Call a friend","If you're usually a text person, pick up the phone or video call a faraway friend. The extra connection really makes you feel closer."));
        clubs.add(new Nine.Club("Watch a performance","Instead of turning on Netflix, watch an online opera, ballet, or symphony."));
        clubs.add(new Nine.Club("Learn a new language","Thanks to apps like Duolingo, you can stretch your mental muscles wherever you are."));
        clubs.add(new Nine.Club("Watch a movie solo","Getting whatever snacks you want, hoarding the couch, and laughing or crying as loud as you want: Movies make an excellent date for one."));
        clubs.add(new Nine.Club("Have a dance party","Turn on some tunes and get those socks hoppin'. Throw it back with oldies from your glory days or find some hot new stuff to shake your booty."));
        clubs.add(new Nine.Club("Learn a dance","Download the Tik Tok app and challenge yourself to learn one of the trending dances everyone is doing."));
        clubs.add(new Nine.Club("Play a video game","If you don't have a gaming console, try some of the fun new games that are added to the app store on your phone every day."));

    }

    class Club {

        String nameone,nametwo;
        public Club(String nameone, String nametwo) {


            this.nameone=nameone;
            this.nametwo=nametwo;

        }
    }


}
