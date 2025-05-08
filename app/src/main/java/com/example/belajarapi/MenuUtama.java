package com.example.belajarapi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuUtama extends AppCompatActivity {

    private Button Premiere;
    private Button LaLiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        Premiere = findViewById(R.id.Premiere);
        LaLiga = findViewById(R.id.LaLiga);

        Premiere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuUtama.this, MainActivity.class);
                intent.putExtra("NamaLiga", "English Premier League");
                startActivity(intent);
            }
        });

        LaLiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuUtama.this, MainActivity.class);
                intent.putExtra("NamaLiga", "Spanish La Liga");
                startActivity(intent);
            }
        });
    }
}