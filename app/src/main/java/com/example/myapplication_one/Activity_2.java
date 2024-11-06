package com.example.myapplication_one;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_2 extends AppCompatActivity
{

    public Activity_2() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_2);
        Button btnGoToMainAct =  (Button) findViewById(R.id.btnGoToMainAct);

        View.OnClickListener oclBtnGoToMainAct = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Activity_2.this, MainActivity.class);
                startActivity(intent);
            }
        };
        btnGoToMainAct.setOnClickListener(oclBtnGoToMainAct);
    }
}