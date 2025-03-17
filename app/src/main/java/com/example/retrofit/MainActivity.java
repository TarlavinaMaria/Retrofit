package com.example.retrofit;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView textViewFact; // TextView для отображения факта
    Button buttonRefresh; // Кнопка для обновления факта

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewFact = findViewById(R.id.textViewFact);
        buttonRefresh = findViewById(R.id.buttonRefresh);

        buttonRefresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadRandomFact();
            }
        });

        // Загрузить факт при запуске приложения
        loadRandomFact();
    }

    private void loadRandomFact() {
        ApiService apiService = RetrofitClient.getApiService(); // Получаем экземпляр ApiService
        Call<Fact> call = apiService.getRandomFact(); // Вызываем метод getRandomFact(), чтобы получить случайный факт
        call.enqueue(new Callback<Fact>() { // Ожидаем ответ от сервера
            @Override
            public void onResponse(Call<Fact> call, Response<Fact> response) {
                if (response.isSuccessful() && response.body() != null) { // Проверяем успешность ответа
                    Fact fact = response.body();
                    textViewFact.setText(fact.getText());
                } else {
                    textViewFact.setText("Не удалось загрузить факт.");
                }
            }

            @Override
            public void onFailure(Call<Fact> call, Throwable t) {
                textViewFact.setText("Ошибка: " + t.getMessage());
            }
        });
    }
}