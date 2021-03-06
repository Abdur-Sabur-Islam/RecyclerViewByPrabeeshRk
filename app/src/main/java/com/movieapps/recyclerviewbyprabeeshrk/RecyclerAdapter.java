package com.movieapps.recyclerviewbyprabeeshrk;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by acer on 1/28/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
    String[] countryNames,capitalNames;

    public RecyclerAdapter(String[] countryNames, String[] capitalNames) {
        this.capitalNames = capitalNames;
        this.countryNames = countryNames;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);

        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        holder.country.setText(countryNames[position]);
        holder.capital.setText(capitalNames[position]);

    }

    @Override
    public int getItemCount() {
        return countryNames.length;
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

        TextView country,capital;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            country = (TextView) itemView.findViewById(R.id.countryNameTv);
            capital = (TextView) itemView.findViewById(R.id.capitalNameTv);
        }
    }
}
