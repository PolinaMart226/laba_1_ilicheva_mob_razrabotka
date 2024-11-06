package com.example.myapplication_one;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Activity_3 extends AppCompatActivity {

    public Activity_3() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_3);
        Button btnGoToMainActv = (Button) findViewById(R.id.btnGoToMainActv);

        View.OnClickListener oclBtnGoMainActv = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_3.this, MainActivity.class);
                startActivity(intent);
            }

        };

        btnGoToMainActv.setOnClickListener(oclBtnGoMainActv );
    }
}