package com.example.individual_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private ArrayList<Desc> descList = new ArrayList<>();
    Button btnShop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Desc d = new Desc();

        d.setDescription("We know all the phones, laptops and accessories and many more which are trending right now , so we'll find your perfect match the first time around. \n \n " +
                "We're always on top of the latest tech so you'll never be late to the game.\n \n" +
                "Your satisfaction makes our day bright .");

        descList.add(d);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new DescAdapter(descList);
        recyclerView.setAdapter(adapter);
        btnShop = findViewById(R.id.btnShop);

        btnShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , ElectronicActivity.class);
                startActivity(intent);
            }
        });


    }


}