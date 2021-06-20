package com.example.individual_project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DescAdapter extends RecyclerView.Adapter<DescAdapter.MyViewHolder> {

    private ArrayList<Desc> desc;

    public DescAdapter(ArrayList<Desc> descList) { desc = descList;  }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        return new MyViewHolder(layoutInflater, parent);
    }

    @Override
    public void onBindViewHolder(@NonNull DescAdapter.MyViewHolder holder, int position) {
        Desc d = desc.get(position);

        holder.txtDesc.setText(d.getDescription());
    }

    @Override
    public int getItemCount() {
        return desc.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView txtDesc;

        public MyViewHolder(LayoutInflater inflater, ViewGroup parent){
            super(inflater.inflate(R.layout.desc_list, parent, false ));
            itemView.setOnClickListener(this);

            txtDesc = itemView.findViewById(R.id.txtDesc);

        }
        public void onClick(View v) {


        }
    }
}

