package com.hackathon.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hackathon.Country;
import com.hackathon.tradurgence.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    public interface OnItemClickListener {
        void onItemClick(Country item);
    }



    List<Country> list;
    OnItemClickListener listener;

    //ajouter un constructeur prenant en entrée une liste
    public MyAdapter(List<Country> list, OnItemClickListener listener) {
        this.list = list;
        this.listener = listener;
    }

    //cette fonction permet de créer les viewHolder
    //et par la même indiquer la vue à inflater (à partir des layout xml)
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int itemType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_language,viewGroup,false);
        return new MyViewHolder(view);
    }

    //c'est ici que nous allons remplir notre cellule avec le texte/image de chaque MyObjects
    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int position) {
        Country myObject = list.get(position);
        myViewHolder.bind(myObject,listener);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}