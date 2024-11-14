package com.example.zadanieguzik;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button1, button2, button3, button4, button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicjalizacja widoków przy użyciu findViewById
        textView = findViewById(R.id.textView);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);

        // Przycisk 1: Zmiana koloru tekstu w TextView
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setTextColor(Color.RED); // lub inny kolor
            }
        });

        // Przycisk 2: Zmiana treści tekstu w TextView
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Nowy tekst");
            }
        });

        // Przycisk 3: Ukrycie TextView
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setVisibility(View.GONE);
            }
        });

        // Przycisk 4: Otwarcie nowej aktywności
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NewActivity.class);
                startActivity(intent);
            }
        });

        // Przycisk 5: Zwiększenie rozmiaru tekstu w TextView
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float currentSize = textView.getTextSize() / getResources().getDisplayMetrics().scaledDensity;
                textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, currentSize + 2); // Zwiększenie rozmiaru o 2sp
            }
        });
    }
}
