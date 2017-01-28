package com.movieapps.recyclerviewbyprabeeshrk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerAdapter adapter ;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView recyclerView;

    String[] country = {"Bangladesh1","Bangladesh12","Bangladesh13","Bangladesh14","Bangladesh15","Bangladesh16","Bangladesh17","Bangladesh1"};
    String[] capital = {"Dhaka1","Dhaka12","Dhaka13","Dhaka14","Dhaka15","Dhaka16","Dhaka17","Dhaka18","Dhaka19","Dhaka10"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        adapter = new RecyclerAdapter(country,capital);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }
}
