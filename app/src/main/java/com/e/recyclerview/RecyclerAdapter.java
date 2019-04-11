package com.e.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ItemViewHolder> {
    restroitem[] restroitem;

    public RecyclerAdapter(com.e.recyclerview.restroitem[] restroitem) {
        this.restroitem = restroitem;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemview = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout, viewGroup, false);
        return new ItemViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder itemViewHolder, int i) {

        restroitem ri= restroitem[i];
        itemViewHolder.textViewName.setText(ri.getName());
        itemViewHolder.textViewviewPrice.setText(ri.getPrice());
        itemViewHolder.imageView.setImageResource(ri.getImage());
    }

    @Override
    public int getItemCount() {
        return restroitem.length;
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textViewName, textViewviewPrice;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.img);
            textViewName = itemView.findViewById(R.id.text1);
            textViewviewPrice = itemView.findViewById(R.id.text);
        }
    }


}
