package com.zedr.dhaivat.practice2;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Three extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    private List<Club> clubs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerViewAdapterThree adapter = new RecyclerViewAdapterThree(clubs);

        initializeData();
        initializeAdapter();
    }

    private void initializeAdapter() {

        RecyclerViewAdapterThree adapter = new RecyclerViewAdapterThree(clubs);
        recyclerView.setAdapter(adapter);

    }

    private void initializeData() {

        clubs= new ArrayList<>();
        clubs.add(new Three.Club("Scour your whole house","When we get bored, we often feel helpless. But tackling even the simplest task, like doing the dishes, can boost your mood immediately. Start with these easy cleaning tips or try a full schedule to tackle every inch of the house."));
        clubs.add(new Three.Club("Shine the windows","You'll be amazed how much brighter things look with sparkling clean windows. Let the sunshine in with these tips for the best results."));
        clubs.add(new Three.Club("Wash your makeup brushes","When was the last time you cleaned all of your makeup tools? Yes, even your ride-or-die Beautyblender could use a scrub. Your skin will thank you."));
        clubs.add(new Three.Club("Sort through your purses","As the seasons change, so do our purses. While switching between bags, we all leave stuff in the bottom (receipts, gum wrappers, pens, etc). Clean out your purses and you just might find that lost lipstick – or at least some spare change."));
        clubs.add(new Three.Club("Clean out your closet","Go through your clothes to rediscover some old favs. If you haven't worn it in the past year, consider posting it on a clothing resale app so it can find a new home."));
        clubs.add(new Three.Club("Organize your kitchen","Already mastered the KonMari Method? You're ready to dive into the wonderful world of drawer and cabinet organizers. Please hold the applause."));
        clubs.add(new Three.Club("Refresh your mantel","Make the most out of your fireplace by thoughtfully decorating the mantel for the season. Rotate in a fresh crop of family photos or add a pop of color with fresh or silk flowers."));
        clubs.add(new Three.Club("Spruce up your outdoor space","Out of sight, it's out of mind, but outdoor spaces also deserve a little TLC. Maybe now's the time to shop for new outdoor furniture and accent pieces for those summer get-togethers."));
        clubs.add(new Three.Club("Spot-treat your white shoes"," White shoes pretty much go with every outfit, but only if they stay that way. Making your Converse or Vans look like new is oh-so-satisfying."));
        clubs.add(new Three.Club("Shop for new essentials","Whether you need to stock up on more cleaning products or your bed is ready for new sheets, grab a notepad or your Notes app and take a lap around the house to see what you need."));
        clubs.add(new Three.Club("Give an old piece new life","Maybe you've got an old chair that never quite fit, or odds n' ends that could become something else. Go ahead, DIY it."));
        clubs.add(new Three.Club("Tackle a trouble spot","You know that corner that hasn't been organized since you moved in? Use your free time to fix it."));

    }

    class Club {

        String nameone,nametwo;
        public Club(String nameone, String nametwo) {


            this.nameone=nameone;
            this.nametwo=nametwo;

        }
    }


}
