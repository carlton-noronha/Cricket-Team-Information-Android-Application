package com.example.cricketteaminformation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PlayerAdapter extends ArrayAdapter<TeamInfo> {

    public PlayerAdapter(Context context, ArrayList<TeamInfo> players){
        super(context, 0, players);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View myListView = convertView;
        if(myListView == null){
            myListView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,false);
        }

        TeamInfo playerDetails = getItem(position);

        TextView tvPlayerName = myListView.findViewById(R.id.playerName);
        tvPlayerName.setText(playerDetails.getName());

        TextView tvPlayerRole = myListView.findViewById(R.id.roleName);
        tvPlayerRole.setText(playerDetails.getRole());

        return myListView;
    }
}
