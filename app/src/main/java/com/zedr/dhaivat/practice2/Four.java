package com.zedr.dhaivat.practice2;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Four extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    private List<Club> clubs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.four);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerViewAdapterFour adapter = new RecyclerViewAdapterFour(clubs);

        initializeData();
        initializeAdapter();
    }

    private void initializeAdapter() {

        RecyclerViewAdapterFour adapter = new RecyclerViewAdapterFour(clubs);
        recyclerView.setAdapter(adapter);

    }

    private void initializeData() {

        clubs= new ArrayList<>();
        clubs.add(new Club("Start a blog."));
        clubs.add(new Club("Go for a hike somewhere you have not been."));
        clubs.add(new Club("Try out a new restaurant." ));
        clubs.add(new Club("Plan a future trip."));
        clubs.add(new Club("Experiment with new recipes. "));
        clubs.add(new Club("Find a new podcast to listen to."));
        clubs.add(new Club("Make a cocktail."));
        clubs.add(new Club("Reach out to a friend or relative you haven't seen in a while."));
        clubs.add(new Club("Rearrange your furniture or redecorate your living space."));
        clubs.add(new Club("Create your own website."));
        clubs.add(new Club("Look for your first or next tattoo design."));
        clubs.add(new Club("Make an effort to learn something new."));
        clubs.add(new Club("Try out a new coffee shop."));
        clubs.add(new Club("Visit a museum."));
        clubs.add(new Club("Make a vision board."));
        clubs.add(new Club("Plan a party."));
        clubs.add(new Club("Try learning a new language."));
        clubs.add(new Club("Write a book or story."));
        clubs.add(new Club("Make a movie."));
        clubs.add(new Club("Plan a last-minute road trip."));
        clubs.add(new Club("Join an intramural or recreation sports team."));
        clubs.add(new Club("Look to adopt a pet even just a fish."));
        clubs.add(new Club("Stage a photo shoot."));
        clubs.add(new Club("Drive somewhere you've never been."));
        clubs.add(new Club("Try and make friends with a stranger."));
    }

    class Club {

        String nameone,nametwo;
        public Club( String nametwo) {


            this.nametwo=nametwo;

        }
    }


}
