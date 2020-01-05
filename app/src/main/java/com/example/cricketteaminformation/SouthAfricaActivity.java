package com.example.cricketteaminformation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SouthAfricaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<TeamInfo> players = new ArrayList<TeamInfo>();

        players.add(new TeamInfo("Faf du Plessis", "Batsman"));
        players.add(new TeamInfo("Quinton de Kock", "Batsman"));
        players.add(new TeamInfo("David Miller","Batsman"));
        players.add(new TeamInfo("Reeza Hendricks", "Batsman"));
        players.add(new TeamInfo("Christiaan Jonker", "Batsman"));
        players.add(new TeamInfo("Heinrich Klaasen", "Wicket-Keeper Batsman"));
        players.add(new TeamInfo("Gihahn Cloete","Wicket-Keeper Batsman"));
        players.add(new TeamInfo("Vernon Philander", "All-rounder"));
        players.add(new TeamInfo("Farhaan Behardien", "All-rounder"));
        players.add(new TeamInfo("Kagiso Rabada", "Bowler"));
        players.add(new TeamInfo("George Linde", "Bowler"));
        players.add(new TeamInfo("Beuran Hendricks", "Bowler"));
        players.add(new TeamInfo("Dane Piedt", "Bowler"));
        players.add((new TeamInfo("Dane Paterson", "Bowler")));

        ListView list_view = findViewById(R.id.list_item_view);
        PlayerAdapter myAdapter = new PlayerAdapter(this, players);
        list_view.setAdapter(myAdapter);


    }
}
