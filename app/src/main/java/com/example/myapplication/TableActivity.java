package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class TableActivity extends AppCompatActivity {
    Button btns[] = new Button[20];
    int[] colors = {R.id.btn0,R.id.btn1,R.id.btn2,R.id.btn3,R.id.btn4,R.id.btn5,R.id.btn6,R.id.btn7,R.id.btn8,R.id.btn9,
            R.id.btnCE,R.id.btnC,R.id.btnBack,R.id.btnPlus,R.id.btnMinus,R.id.btnMultiply,R.id.btnDivide,R.id.btnSign,R.id.btnDot,R.id.btnEqual};
    TextView textDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        textDisplay = findViewById(R.id.textDisplay);
        for (int i = 0; i < colors.length; i++) {
            btns[i] = findViewById(colors[i]);
            final int idx = i;
            btns[i].setOnClickListener(v -> {
                String tmp = textDisplay.getText().toString();
                tmp = tmp.equals("0")?"":tmp;
                if (btns[idx].getText().toString().equals("C")||btns[idx].getText().toString().equals("CE")) {
                    textDisplay.setText("");
                } else {
                textDisplay.setText(tmp+btns[idx].getText());
                }
            });
        }
    }
}