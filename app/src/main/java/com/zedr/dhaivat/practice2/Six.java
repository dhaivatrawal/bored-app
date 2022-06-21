package com.zedr.dhaivat.practice2;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Six extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    private List<Club> clubs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.six);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerViewAdapterSix adapter = new RecyclerViewAdapterSix(clubs);

        initializeData();
        initializeAdapter();
    }

    private void initializeAdapter() {

        RecyclerViewAdapterSix adapter = new RecyclerViewAdapterSix(clubs);
        recyclerView.setAdapter(adapter);

    }

    private void initializeData() {

        clubs= new ArrayList<>();
        clubs.add(new Six.Club("Go to the gym, go for a walk, a run, sit-ups, anything you can for a little bit of exercise."));
        clubs.add(new Six.Club("Organize your closet, or do a full-blown closet clean-out."));
        clubs.add(new Six.Club("Update your resume."));
        clubs.add(new Six.Club("Find a part-time or freelance job."));
        clubs.add(new Six.Club("Clean something in your place that you haven't in a while (inside of microwave, anyone?)"));
        clubs.add(new Six.Club("Meal prep for the upcoming week. "));
        clubs.add(new Six.Club("Clean your makeup brushes."));
        clubs.add(new Six.Club("Research dream careers. "));
        clubs.add(new Six.Club("Look for a place to volunteer."));
        clubs.add(new Six.Club("Make a future finances plan."));
        clubs.add(new Six.Club("Sign up for a class. "));
        clubs.add(new Six.Club("Clean up your emails."));
        clubs.add(new Six.Club("Make a list of personal or professional goals. "));
        clubs.add(new Six.Club("Start a DIY project."));
        clubs.add(new Six.Club("Go grocery shopping."));
        clubs.add(new Six.Club("Clean out your Facebook, Twitter, Instagram, etc."));
        clubs.add(new Six.Club("Read up on current events."));
        clubs.add(new Six.Club("Start a garden (or kitchen garden)."));
        clubs.add(new Six.Club("Clean your phone or phone case (it's probably very dirty)."));
        clubs.add(new Six.Club("Watch a how-to YouTube video."));
        clubs.add(new Six.Club("Donate old clothes or other items to your local charity."));
        clubs.add(new Six.Club("Get ahead on schoolwork or future projects."));
        clubs.add(new Six.Club("Fine-tune your LinkedIn profile."));
        clubs.add(new Six.Club("Do your laundry."));
        clubs.add(new Six.Club("Make lists of Usefull things."));
    }

    class Club {

        String nameone,nametwo;
        public Club(String nametwo) {


            this.nametwo=nametwo;

        }
    }


}
