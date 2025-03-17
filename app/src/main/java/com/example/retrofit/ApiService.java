package com.example.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("/api/v2/facts/random")
    Call<Fact> getRandomFact();
}
