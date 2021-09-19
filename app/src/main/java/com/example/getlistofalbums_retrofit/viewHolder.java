package com.example.getlistofalbums_retrofit;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class viewHolder extends RecyclerView.ViewHolder {
    private TextView mTvId, mTvTitle;

    public viewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mTvId = itemView.findViewById(R.id.tvId);
        mTvTitle = itemView.findViewById(R.id.tvTitle);
    }

    void setData(ResponceDTOItem responseModel) {
        mTvId.setText(responseModel.getId()+"");
        mTvTitle.setText(responseModel.getTitle());
    }
}
