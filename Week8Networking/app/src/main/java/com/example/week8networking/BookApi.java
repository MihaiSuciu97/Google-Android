package com.example.week8networking;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface BookApi {
    @GET("/mariusgherman/androidfundamentals/weeks/week8/{json}")
    Call<List<Book>> getBooks(@Path("json")String jsonToFetch);
}