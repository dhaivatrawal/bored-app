package com.zedr.dhaivat.practice2;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Five extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    private List<Club> clubs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.five);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerViewAdapterFive adapter = new RecyclerViewAdapterFive(clubs);

        initializeData();
        initializeAdapter();
    }

    private void initializeAdapter() {

        RecyclerViewAdapterFive adapter = new RecyclerViewAdapterFive(clubs);
        recyclerView.setAdapter(adapter);

    }

    private void initializeData() {

        clubs= new ArrayList<>();
        clubs.add(new Five.Club("Paint your nails","Create an at-home spa experience with a mani-pedi. Choose a trending summer hue, add an interesting design, and finish it off with a shiny top coat."));
        clubs.add(new Five.Club("Take a bubble bath","Embrace your free time with a mountain of bubbles and a few drops of essential oils. Bring a good book in there with you, if you don't mind it getting a tad damp."));
        clubs.add(new Five.Club("Do a face mask","For a quick pick-me-up, apply a nourishing face mask. You can choose one to target a number of issues, including dry skin, acne, or to brighten up a dull complexion. Whatever ails you, there's a mask for that."));
        clubs.add(new Five.Club("Start journaling","Time will fly by as you jot down your thoughts in a journal. If you want to go even deeper, venture into the artistic world of bullet journals."));
        clubs.add(new Five.Club("Listen to a meditation video"," When your mind starts to spiral, turn it inward. Mediation videos can easily guide you through mindful exercises and techniques to reach inner peace."));
        clubs.add(new Five.Club("Try living room yoga","In addition to strengthening your whole body, yoga helps center your mind. You can do it at home with no equipment using a free app, too."));
        clubs.add(new Five.Club("Do Zumba","There's something about this structured dance party that is sure to lift your spirits."));

    }

    class Club {

        String nameone,nametwo;
        public Club(String nameone, String nametwo) {


            this.nameone=nameone;
            this.nametwo=nametwo;

        }
    }


}
