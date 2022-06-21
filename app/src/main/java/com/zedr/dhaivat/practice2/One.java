package com.zedr.dhaivat.practice2;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class One extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    private List<Club> clubs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerViewAdapterOne adapter = new RecyclerViewAdapterOne(clubs);

        initializeData();
        initializeAdapter();
    }

    private void initializeAdapter() {

        RecyclerViewAdapterOne adapter = new RecyclerViewAdapterOne(clubs);
        recyclerView.setAdapter(adapter);

    }

    private void initializeData() {

        clubs= new ArrayList<>();
        clubs.add(new One.Club("Enjoy food outdoors","Take your lunch to the backyard or patio to get a little vitamin D while you indulge. A glass of wine doesn't hurt either."));
        clubs.add(new One.Club("Go for a long walk","Plan a route past your favorite landmarks, a local park, or just around the neighborhood. Stop and smell the flowers – literally."));
        clubs.add(new One.Club("Take your pet to the park","Whether you have a lively dog, an adventurous cat, or even a sweet rabbit, they'll appreciate a wander with their favorite person."));
        clubs.add(new One.Club("Start a garden","Roll up your sleeves and get your hands dirty in the backyard or your windowsill, if you don't have outdoor space. In addition to the de-stressing benefits, all that digging quickly turns into a workout."));
        clubs.add(new One.Club("Go for a bike ride","Take a tour of your surroundings and get some exercise in by jumping on a bicycle."));
        clubs.add(new One.Club("Take a drive","You don't need a destination — just a great playlist and the open road."));
        clubs.add(new One.Club("Hit the beach","Slather yourself in sunscreen, grab a beach towel, and make your way to the beach for a day of fun in the sun. And don't be afraid to swing by in the colder months — the crashing waves feel like the picture."));
        clubs.add(new One.Club("Have a backyard campout","Pitch a tent between your back gardens and see your outdoor space in a whole new way. Or if the weather isn't cooperating, do the same in your own living room."));

    }

    class Club {

        String nameone,nametwo;
        public Club(String nameone, String nametwo) {


            this.nameone=nameone;
            this.nametwo=nametwo;

        }
    }


}
