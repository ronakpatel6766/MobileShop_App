package com.example.individual_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CheckoutDisplay extends AppCompatActivity {

    public TextView D1;
    public TextView D2;
    public TextView D3;
    public TextView txtLf;
    public TextView txtLl;
    public TextView txtLq;
    public TextView displayLast;
    public ImageView txtLimg;
    public Button btnback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout_display);

        D1= findViewById(R.id.D1);
        D2= findViewById(R.id.D2);
        D3= findViewById(R.id.D3);
        txtLf=findViewById(R.id.txtLf);
        txtLl=findViewById(R.id.txtLl);
        txtLq=findViewById(R.id.txtLq);
        displayLast= findViewById(R.id.displayLast);
        txtLimg=findViewById(R.id.txtLimg);
        btnback=findViewById(R.id.btnback);

        Bundle bundle=getIntent().getExtras();

        String fnameid = bundle.getString("fname");
        String lnameid = bundle.getString("lname");
        String quantityid = bundle.getString("quantity");
        int Resid = bundle.getInt("limage");

        txtLf.setText(fnameid);
        txtLl.setText(lnameid);
        txtLq.setText(quantityid);
        txtLimg.setImageResource(Resid);

        btnback.setOnClickListener(v -> {
            Intent intent = new Intent(CheckoutDisplay.this,ElectronicActivity.class);
            startActivity(intent);
        });
    }
}