package com.example.myapplication_one;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

//
public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnGoToSecAct = (Button) findViewById(R.id.btnGoToSecAct);

        View.OnClickListener oclBtnGoToSecAct = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_2.class);
                startActivity(intent);
            }
        };
        btnGoToSecAct.setOnClickListener(oclBtnGoToSecAct);

        Button btnGoToAct3 = (Button) findViewById(R.id.btnGoToAct3);
        btnGoToAct3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_3.class);
                startActivity(intent);
            }
        });

        Button btnGoToAct4 = (Button) findViewById(R.id.btnGoToAct4);
        btnGoToAct4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_4.class);
                startActivity(intent);
            }
        });

        Button btn_exit = findViewById(R.id.btn_exit);

        // Установка слушателя нажатия кнопки
        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Закрытие приложения
                finish(); // Закрывает текущую активность
                System.exit(0); // Завершает процесс приложения
            }
        });
    }
}