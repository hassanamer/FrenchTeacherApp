package com.example.frenchteacherapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button black_btn, yellow_btn,green_btn,red_btn,purple_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
            black_btn = findViewById(R.id.button_black);
            yellow_btn = findViewById(R.id.button_yellow);
            green_btn = findViewById(R.id.button_green);
            purple_btn = findViewById(R.id.button_purple);
            red_btn = findViewById(R.id.button_red);

            black_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.black);
                    mediaPlayer.start();
                }
            });
            yellow_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.yellow);
                    mediaPlayer.start();
                }
            });
            green_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.green);
                    mediaPlayer.start();
                }
            });
            red_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.red);
                    mediaPlayer.start();
                }
            });
            purple_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.purple);
                    mediaPlayer.start();
                }
            });

    }
}