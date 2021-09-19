package com.example.getlistofalbums_retrofit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("/albums")
    Call<List<ResponceDTOItem>> getAlbums();
}
