package com.example.fighting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Soal5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal5);
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }

    public void mobil(View view) {
        Toast.makeText(this, "Yhaa.. jawaban kamu BELUM BENAR:(", Toast.LENGTH_SHORT).show();
    }

    public void becak(View view) {
        Toast.makeText(this, "Yhaa.. jawaban kamu BELUM BENAR:(", Toast.LENGTH_SHORT).show();
    }

    public void pesawat(View view) {
        Intent intent = new Intent(this,AkhirBermain.class);
        startActivity(intent);
    }

}
