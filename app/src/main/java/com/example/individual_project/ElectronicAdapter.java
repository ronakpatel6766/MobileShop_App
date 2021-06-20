package com.example.individual_project;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ElectronicAdapter extends RecyclerView.Adapter<ElectronicAdapter.MyViewHolder> {

    private ArrayList<Electronic> elect;
    Context d;


    public ElectronicAdapter(ArrayList<Electronic> electronicsList,Context context) {
        elect = electronicsList;
        d=context;

    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        return new MyViewHolder(layoutInflater, parent);
    }

    @Override
    public void onBindViewHolder(@NonNull ElectronicAdapter.MyViewHolder holder, int position) {
        Electronic e = elect.get(position);

        Context actContext = holder.itemView.getContext();
        int resid = actContext.getResources().getIdentifier(e.getImage(), "drawable", actContext.getPackageName());
        holder.txtName.setText(e.getName());
        holder.imgLaptop.setImageResource(resid);
        holder.txtCompany.setText(e.getCompany());
        holder.txtPrice.setText(e.getPrice());
        holder.txtDetail.setText(e.getDetail());


        holder.imgLaptop.setOnClickListener(v -> {
            Intent intent = new Intent(d,ProductInfo.class);
            intent.putExtra("data",resid);
            intent.putExtra("name",e.getName());
            intent.putExtra("company",e.getCompany());
            intent.putExtra("price", e.getPrice());
            intent.putExtra("pdesc",e.getDetail());
            d.startActivity(intent);


        });

    }


    @Override
    public int getItemCount() {
        return elect.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView txtName;
        TextView txtCompany;
        TextView txtPrice;
        ImageView imgLaptop;
        TextView txtDetail;

        public MyViewHolder(LayoutInflater inflater, ViewGroup parent){
            super(inflater.inflate(R.layout.activity_second, parent, false ));
            itemView.setOnClickListener(this);
            txtName = itemView.findViewById(R.id.txtName);
            imgLaptop = itemView.findViewById(R.id.imgLaptop);
            txtCompany = itemView.findViewById(R.id.txtCompany);
            txtPrice = itemView.findViewById(R.id.txtPrice);
            txtDetail = itemView.findViewById(R.id.txtDetail);



        }

        public void onClick(View v){



            };


        }
    }

