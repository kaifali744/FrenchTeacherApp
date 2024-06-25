package com.example.frenchteacherapp;

import android.icu.text.CaseMap;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView title;
    Button blackBtn, greenBtn, purpleBtn, redBtn ,yellowBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        blackBtn = findViewById(R.id.blackBtn);
        greenBtn = findViewById(R.id.greenBtn);
        purpleBtn = findViewById(R.id.purpleBtn);
        redBtn = findViewById(R.id.redBtn);
        yellowBtn = findViewById(R.id.yellowBtn);

        redBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
        purpleBtn.setOnClickListener(this);
        blackBtn.setOnClickListener(this);
        yellowBtn.setOnClickListener(this);
        }

    @Override
    public void onClick(View v) {
        //Getting the id of clicked button
        int clickedBtnId = v.getId();
        if (clickedBtnId == R.id.blackBtn){
            playSound(R.raw.black);
        } else if (clickedBtnId == R.id.redBtn){
            playSound(R.raw.red);
        }else if (clickedBtnId == R.id.greenBtn){
            playSound(R.raw.green);
        }else if (clickedBtnId == R.id.purpleBtn){
            playSound(R.raw.purple);
        }else if (clickedBtnId == R.id.yellowBtn){
            playSound(R.raw.yellow);
        }

    }

    private void playSound(int id) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this , id);
        mediaPlayer.start();
    }

}
