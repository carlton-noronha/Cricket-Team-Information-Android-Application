package com.example.cricketteaminformation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AustraliaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<TeamInfo> players = new ArrayList<TeamInfo>();

        players.add(new TeamInfo("Aaron Finch", "Batsman"));
        players.add(new TeamInfo("Travis Head", "Batsman"));
        players.add(new TeamInfo("Glenn Maxwell","Batsman"));
        players.add(new TeamInfo("Shaun Marsh", "Batsman"));
        players.add(new TeamInfo("David Warner", "Batsman"));
        players.add(new TeamInfo("Tim Paine", "Wicket-Keeper Batsman"));
        players.add(new TeamInfo("Alex Carey","Wicket-Keeper Batsman"));
        players.add(new TeamInfo("Mitchell Marsh", "All-rounder"));
        players.add(new TeamInfo("Marcus Stoinis", "All-rounder"));
        players.add(new TeamInfo("Mitchell Starc", "Bowler"));
        players.add(new TeamInfo("Nathan Lyon", "Bowler"));
        players.add(new TeamInfo("Pat Cummins", "Bowler"));
        players.add(new TeamInfo("Peter Siddle", "Bowler"));
        players.add((new TeamInfo("Adam Zampa", "Bowler")));

        ListView list_view = findViewById(R.id.list_item_view);
        PlayerAdapter myAdapter = new PlayerAdapter(this, players);
        list_view.setAdapter(myAdapter);


    }
}
