package com.example.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

// Класс RetrofitClient для создания и получения экземпляра Retrofit
public class RetrofitClient {
    private static final String BASE_URL = "https://uselessfacts.jsph.pl/"; // URL базового API
    private static Retrofit retrofit = null; // Статическая переменная для хранения экземпляра Retrofit

    public static ApiService getApiService() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL) // Устанавливаем базовый URL
                    .addConverterFactory(GsonConverterFactory.create()) // Добавляем конвертер Gson, чтобы преобразовывать JSON в объекты Java
                    .build(); // Создаем экземпляр Retrofit
        }
        return retrofit.create(ApiService.class);
    }
}
