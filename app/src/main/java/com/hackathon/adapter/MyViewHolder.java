package com.hackathon.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.hackathon.Country;
import com.hackathon.tradurgence.R;

public class MyViewHolder extends RecyclerView.ViewHolder{

    private ImageView imageView;

    //itemView est la vue correspondante à 1 cellule
    public MyViewHolder(View itemView) {
        super(itemView);

        //c'est ici que l'on fait nos findView

        imageView = (ImageView) itemView.findViewById(R.id.image);
    }

    //puis ajouter une fonction pour remplir la cellule en fonction d'un MyObject
    public void bind(final Country myObject, final MyAdapter.OnItemClickListener listener){
        imageView.setImageResource(myObject.image);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                listener.onItemClick(myObject);
            }
        });    }
}
