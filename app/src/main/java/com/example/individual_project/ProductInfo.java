package com.example.individual_project;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProductInfo extends AppCompatActivity {
    public ImageView imgInfo;
    public TextView txtNameinfo;
    public TextView txtCompanyinfo;
    public TextView txtPriceinfo;
    public TextView txtProductdesc;
    public Button btnCheckout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_info);
        Bundle bundle=getIntent().getExtras();

        imgInfo= findViewById(R.id.imgInfo);
        int Resid  = bundle.getInt("data");

        txtNameinfo = findViewById(R.id.txtNameinfo);
        String  nameid = bundle.getString("name");

        txtCompanyinfo= findViewById(R.id.txtCompanyinfo);
        String companyid = bundle.getString("company");

        txtPriceinfo = findViewById(R.id.txtPriceinfo);
        String  priceid = bundle.getString("price");

        txtProductdesc = findViewById(R.id.txtProductdesc);
        String productdesid = bundle.getString("pdesc");

        imgInfo.setImageResource(Resid);
        txtNameinfo.setText(nameid);
        txtCompanyinfo.setText(companyid);
        txtPriceinfo.setText(priceid);
        txtProductdesc.setText(productdesid);


        btnCheckout= findViewById(R.id.btnCheckout);
        btnCheckout.setOnClickListener(v -> {
            Intent intent = new Intent(ProductInfo.this,Checkout_Activity.class);
            intent.putExtra("cimg",Resid);
            intent.putExtra("cname",nameid);
            intent.putExtra("cprice",priceid);
            startActivity(intent);

        });



    }
}
