package com.example.individual_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.ArrayList;

public class ElectronicActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private ArrayList<Electronic> electronicsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.electronic_list);

        Electronic e1 = new Electronic();
        e1.setName("Mobile");
        e1.setCompany("Apple");
        e1.setImage("iphone11");
        e1.setPrice("$999");
        e1.setDetail("Info :- This is the apple iphone which is very popular in all mobile phones.it was founded by Steve Jobs");

        Electronic e2 = new Electronic();
        e2.setName("laptop");
        e2.setCompany("Dell");
        e2.setImage("dell");
        e2.setPrice("$2599");
        e2.setDetail("Info :- This laptop is from dell . It is very well known brand and all their laptops runs very smoothly");

        Electronic e3 = new Electronic();
        e3.setName("Television");
        e3.setCompany("Sony");
        e3.setImage("sony");
        e3.setPrice("$1200");
        e3.setDetail("Info :- Sony television are popular for their sound and color and its shows very perfect");

        Electronic e4 = new Electronic();
        e4.setName("Refrigerator");
        e4.setCompany("Samsung");
        e4.setImage("fridge");
        e4.setPrice("$1800");
        e4.setDetail("Info :- Samsung introduce the idea of connecting refrigerators to the internet of things had been very popularized all oer the world ");

        Electronic e5 = new Electronic();
        e5.setName("AC");
        e5.setCompany("hitachi");
        e5.setImage("hit");
        e5.setPrice("$2100");
        e5.setDetail("Info :- Hitachi is very famous for thie Air conditioners and this copmany first introduces Ac in 1975.");

        electronicsList.add(e1);
        electronicsList.add(e2);
        electronicsList.add(e3);
        electronicsList.add(e4);
        electronicsList.add(e5);

        recyclerView = findViewById(R.id.recyclerProductview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ElectronicAdapter(electronicsList,this);
        recyclerView.setAdapter(adapter);



    }
}
