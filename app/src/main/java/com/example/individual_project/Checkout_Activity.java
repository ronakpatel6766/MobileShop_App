package com.example.individual_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Checkout_Activity extends AppCompatActivity {

    public ImageView imgCimg;
    public TextView txtCname;
    public TextView txtCprice;
    public EditText txtFirstname;
    public EditText txtLastname;
    public EditText txtQuantity;
    public Button btnOrder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout_);

        imgCimg = findViewById(R.id.imgCimg);
        txtCname = findViewById(R.id.txtCname);
        txtCprice = findViewById(R.id.txtCprice);
        txtFirstname = findViewById(R.id.txtFirstname);
        txtLastname = findViewById(R.id.txtLastname);
        txtQuantity = findViewById(R.id.txtQuantity);
        btnOrder = findViewById(R.id.btnOrder);

        Bundle bundle=getIntent().getExtras();
        int Resid  = bundle.getInt("cimg");
        String nameid = bundle.getString("cname");
        String priceid = bundle.getString("cprice");

        imgCimg.setImageResource(Resid);
        txtCname.setText(nameid);
        txtCprice.setText(priceid);

        btnOrder.setOnClickListener(v -> {
            Intent intent = new Intent(Checkout_Activity.this,CheckoutDisplay.class);
            intent.putExtra("limage",Resid);
            intent.putExtra("fname",txtFirstname.getText().toString());
            intent.putExtra("lname",txtLastname.getText().toString());
            intent.putExtra("quantity",txtQuantity.getText().toString());
            startActivity(intent);
        });

    }
}