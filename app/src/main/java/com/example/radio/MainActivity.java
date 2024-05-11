package com.example.radio;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button button1,button2;
    RadioGroup radioGroup;
    TextView textView;
    RadioButton radioButton1,radioButton2,radioButton3,radioButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        textView = findViewById(R.id.txt);
        radioButton1 = findViewById(R.id.rd1);
        radioButton2 = findViewById(R.id.rd2);
        radioButton3 = findViewById(R.id.rd3);
        radioButton4 = findViewById(R.id.rd4);
        radioGroup = findViewById(R.id.groupe);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String r1 = radioButton1.getText().toString();
                if (radioButton1.isChecked()) {
                    textView.setText(r1);
                }
                String r2 = radioButton2.getText().toString();
                if (radioButton2.isChecked()) {
                    textView.setText(r2);
                }
                String r3 = radioButton3.getText().toString();
                if (radioButton3.isChecked()) {
                    textView.setText(r3);
                }
                String r4 = radioButton4.getText().toString();
                if (radioButton4.isChecked()) {
                    textView.setText(r4);
                }

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioGroup.clearCheck();
                textView.setText("");
            }
        });

    }
}