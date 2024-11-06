package com.example.myapplication_one;

import android.graphics.Color;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class Activity_4 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4); // Убедитесь, что используете правильный файл разметки

        Button btnNew = findViewById(R.id.btn_new);

        // Установка слушателя на нажатие кнопки
        btnNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Изменяем цвет кнопки на светло-зеленый
                btnNew.setBackgroundColor(Color.parseColor("#90EE90")); // Светло-зеленый цвет

                // Переход на MainActivity
                Intent intent = new Intent(Activity_4.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
