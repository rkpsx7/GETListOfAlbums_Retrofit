package com.example.getlistofalbums_retrofit;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ProgressBar progressBar;
    private Adapter adapter;
    private List<ResponceDTOItem> dataList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        callApi();
    }

    private void callApi() {
        ApiService apiService = NetWork.getInstance().create(ApiService.class);
        apiService.getAlbums().enqueue(new Callback<List<ResponceDTOItem>>() {
            @Override
            public void onResponse(Call<List<ResponceDTOItem>> call, Response<List<ResponceDTOItem>> response) {
                dataList = response.body();
                setRecyclerView();
                progressBar.setVisibility(View.GONE);
            }

            @Override
            public void onFailure(Call<List<ResponceDTOItem>> call, Throwable t) {

            }
        });
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
        progressBar = findViewById(R.id.progressBar);
    }

    private void setRecyclerView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        Adapter adapter = new Adapter(dataList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}