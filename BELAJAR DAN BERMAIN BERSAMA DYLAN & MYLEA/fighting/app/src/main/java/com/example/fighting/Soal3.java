package com.example.fighting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Soal3 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal3);
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }

    public void burung(View view) {
        Toast.makeText(this, "Yhaa.. jawaban kamu BELUM BENAR:(", Toast.LENGTH_SHORT).show();

    }

    public void gajah(View view) {
        Intent intent = new Intent(this,Soal4.class);
        startActivity(intent);
    }

    public void jerapah(View view) {
        Toast.makeText(this, "Yhaa.. jawaban kamu BELUM BENAR:(", Toast.LENGTH_SHORT).show();
    }
}
