package com.ckarumoreira.dev.recyclerviewtest;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ckarumoreira.dev.recyclerviewtest.Profile.Profile;
import com.ckarumoreira.dev.recyclerviewtest.Profile.ProfileAdapter;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private RecyclerView cardList;
    private ArrayList<Profile> profiles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayoutManager layout = new LinearLayoutManager(this);

        cardList = (RecyclerView)findViewById(R.id.main_card_list);
        cardList.setHasFixedSize(true);
        cardList.setLayoutManager(layout);

        initializeProfiles();

        cardList.setAdapter(new ProfileAdapter(profiles));
    }

    private void initializeProfiles() {
        profiles = new ArrayList<>();

        Profile profileA = new Profile();
        profileA.setFirstName("Carlos");
        profileA.setLastName("Moreira");
        profileA.setNickname("Karu");
        profiles.add(profileA);

        Profile profileB = new Profile();
        profileB.setFirstName("Flávio");
        profileB.setLastName("Elicker");
        profileB.setNickname("Hewants");
        profiles.add(profileB);

        Profile profileC = new Profile();
        profileC.setFirstName("João");
        profileC.setLastName("Kiyoshi");
        profileC.setNickname("Ponêis");
        profiles.add(profileC);
    }
}
