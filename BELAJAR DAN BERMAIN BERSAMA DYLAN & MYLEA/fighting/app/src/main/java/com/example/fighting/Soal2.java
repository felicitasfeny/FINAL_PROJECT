package com.example.fighting;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Soal2 extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal2);
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

    }

    public void dua(View view) {
        Toast.makeText(this, "Yhaa.. jawaban kamu BELUM BENAR:(", Toast.LENGTH_SHORT).show();
    }

    public void satu(View view) {
        Toast.makeText(this, "Yhaa.. jawaban kamu BELUM BENAR:(", Toast.LENGTH_SHORT).show();
    }

    public void empat(View view) {
        Intent intent = new Intent(this,Soal3.class);
        startActivity(intent);
    }
}
