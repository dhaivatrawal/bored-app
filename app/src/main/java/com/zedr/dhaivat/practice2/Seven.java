package com.zedr.dhaivat.practice2;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Seven extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    private List<Club> clubs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seven);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerViewAdapterSeven adapter = new RecyclerViewAdapterSeven(clubs);

        initializeData();
        initializeAdapter();
    }

    private void initializeAdapter() {

        RecyclerViewAdapterSeven adapter = new RecyclerViewAdapterSeven(clubs);
        recyclerView.setAdapter(adapter);

    }

    private void initializeData() {

        clubs= new ArrayList<>();
        clubs.add(new Seven.Club("Start a new book","If you've run through your TV queue, go analog. Try one of the best books of the year to transport yourself to another world."));
        clubs.add(new Seven.Club("Download an audiobook","If you can't get out to the bookstore or want to lighten your load, try audiobooks for listening on the go. The best of the best will make the hours fly by."));
        clubs.add(new Seven.Club("Listen to a new podcast","If you've never tried podcasts, you're in for a treat. From true crime to comedy, there are endless options to choose from."));
        clubs.add(new Seven.Club("Try a coloring app","Adult coloring books are available in-stores and in mobile app stores, so no need to head to the store. Colorfy and Happy Color will help you get creative without any supplies needed."));
        clubs.add(new Seven.Club("Make a custom photo book","You don't need the talent of Michaelangelo to create a memorable photo book. A variety of online services can help you collect your photos into a beautiful keepsake."));
        clubs.add(new Seven.Club("Change up your décor","From the bedroom to living room to kitchen, we have countless ideas to help give your home a quick and easy makeover. Even just rearranging your furniture a little will feel fresh."));
        clubs.add(new Seven.Club("Make some wall art","You don't need to be a master painter to DIY some of these fabulous wall decor ideas."));
        clubs.add(new Seven.Club("Try a new recipe","Stop opening and closing the fridge hoping new snacks will magically appear. Take matters into your own hand and make your own tasty dish."));
        clubs.add(new Seven.Club("Bake cookies","Choose a healthy cookie recipe so you can feel good every time you reach for one."));
        clubs.add(new Seven.Club("Make homemade ice cream","Give Ben & Jerry a run for their money and beat boredom. Simply combine a few ingredients in an ice cream maker and you'll be in awe."));

    }

    class Club {

        String nameone,nametwo;
        public Club(String nameone, String nametwo) {


            this.nameone=nameone;
            this.nametwo=nametwo;

        }
    }


}
