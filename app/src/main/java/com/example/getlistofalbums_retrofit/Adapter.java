package com.example.getlistofalbums_retrofit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<viewHolder> {

    private List<ResponceDTOItem> dataList;

    public Adapter(List<ResponceDTOItem> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        ResponceDTOItem item = dataList.get(position);
        holder.setData(item);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
