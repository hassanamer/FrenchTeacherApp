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

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

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

        purple_btn.setOnClickListener(this);
        red_btn.setOnClickListener(this);
        black_btn.setOnClickListener(this);
        green_btn.setOnClickListener(this);
        yellow_btn.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        int clickedBtnId = v.getId();
        if (clickedBtnId == R.id.button_black){
            PlaySound(R.raw.black);
        } else if (clickedBtnId == R.id.button_green) {
            PlaySound(R.raw.green);
        }else if (clickedBtnId == R.id.button_yellow) {
            PlaySound(R.raw.yellow);
        }else if (clickedBtnId == R.id.button_red) {
            PlaySound(R.raw.red);
        }else if (clickedBtnId == R.id.button_purple) {
            PlaySound(R.raw.purple);
        }
    }

    private void PlaySound(int id) {
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), id);
        mediaPlayer.start();
    }
}