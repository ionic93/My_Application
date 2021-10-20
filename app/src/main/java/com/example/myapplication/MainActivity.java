package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnConfirm, btnFrame, btnTable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnConfirm = findViewById(R.id.btnConfirm); //view에 있는 버튼을 지정 => 변수가 초기화
        btnFrame = findViewById(R.id.btnFrame);
        btnTable = findViewById(R.id.btnTable);

        btnConfirm.setOnClickListener(v->{
//            Toast.makeText(getApplicationContext(), "Hello Andriod", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(), LinearActivity.class);
            startActivity(intent);
        });

        btnFrame.setOnClickListener(v->{
            Intent intent = new Intent(getApplicationContext(), FrameActivity.class);
            startActivity(intent);
        });

        btnTable.setOnClickListener(v->{
            Intent intent = new Intent(getApplicationContext(), TableActivity.class);
            startActivity(intent);
        });
    }
}