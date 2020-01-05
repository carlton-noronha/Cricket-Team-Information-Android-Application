package com.example.cricketteaminformation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class IndiaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<TeamInfo> players = new ArrayList<TeamInfo>();

        players.add(new TeamInfo("Shikhar Dhawan", "Batsman"));
        players.add(new TeamInfo("K. L. Rahul", "Batsman"));
        players.add(new TeamInfo("Vijay Shankar","Batsman"));
        players.add(new TeamInfo("Virat Kolhi", "Batsman"));
        players.add(new TeamInfo("MS Dhoni", "Wicket-Keeper Batsman"));
        players.add(new TeamInfo("Dinesh Karthik","Wicket-Keeper Batsman"));
        players.add(new TeamInfo("Ravindra Jadeja", "All-rounder"));
        players.add(new TeamInfo("Hardik Pandya", "All-rounder"));
        players.add(new TeamInfo("Umesh Yadav", "Bowler"));
        players.add(new TeamInfo("Rohit Sharma", "Batsman"));
        players.add(new TeamInfo("Mohamed Shami", "Bowler"));
        players.add(new TeamInfo("Jasprit Bumrah", "Bowler"));
        players.add(new TeamInfo("Yuzvendra Chahal", "Bowler"));
        players.add((new TeamInfo("Bhuvneshwar Kumar", "Bowler")));

        ListView list_view = findViewById(R.id.list_item_view);
        PlayerAdapter myAdapter = new PlayerAdapter(this, players);
        list_view.setAdapter(myAdapter);


    }
}
