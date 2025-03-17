package com.example.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

// Интерфейс ApiService для взаимодействия с API
public interface ApiService {
    // Метод для получения случайного факта из API
    @GET("/api/v2/facts/random")
    Call<Fact> getRandomFact();
}
