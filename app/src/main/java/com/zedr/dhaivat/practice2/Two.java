package com.zedr.dhaivat.practice2;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Two extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    private List<Club> clubs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerViewAdapterTwo adapter = new RecyclerViewAdapterTwo(clubs);

        initializeData();
        initializeAdapter();
    }

    private void initializeAdapter() {

        RecyclerViewAdapterTwo adapter = new RecyclerViewAdapterTwo(clubs);
        recyclerView.setAdapter(adapter);

    }

    private void initializeData() {

        clubs= new ArrayList<>();
        clubs.add(new Two.Club("Give yourself a manicure or pedicure."));
        clubs.add(new Two.Club("Try out a new hairstyle or experiment with your hair."));
        clubs.add(new Two.Club("Take a bubble bath."));
        clubs.add(new Two.Club("Try out a new facemask or beauty product. "));
        clubs.add(new Two.Club("Doodle, color, or draw on some paper. "));
        clubs.add(new Two.Club("Do yoga (check out YouTube for tutorials)."));
        clubs.add(new Two.Club("Write a poem or write in a journal."));
        clubs.add(new Two.Club("Take a nap."));
        clubs.add(new Two.Club("Read a book."));
        clubs.add(new Two.Club("Listen to music."));
        clubs.add(new Two.Club("Do Stretching."));
        clubs.add(new Two.Club("Watch some Netflix."));
        clubs.add(new Two.Club("Look through old photos and videos."));
        clubs.add(new Two.Club("Bake some desserts. "));
        clubs.add(new Two.Club("Go watch a sunset or sunrise."));
        clubs.add(new Two.Club("Meditate."));
        clubs.add(new Two.Club("Write a poem."));
        clubs.add(new Two.Club("Eat snacks in bed."));
        clubs.add(new Two.Club("Sit or lay outside in good weather."));
        clubs.add(new Two.Club("Look for a new favorite quote or saying."));
        clubs.add(new Two.Club("Write a letter to your future self."));
        clubs.add(new Two.Club("Take a long shower."));
        clubs.add(new Two.Club("Drink tea."));
        clubs.add(new Two.Club("Cuddle with a pet or S.O."));
        clubs.add(new Two.Club("Create a self-love list."));

    }

    class Club {

        String nametwo;
        public Club( String nametwo) {



            this.nametwo=nametwo;

        }
    }


}
