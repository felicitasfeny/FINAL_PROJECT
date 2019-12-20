package com.example.fighting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Soal1 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal1);
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }

    public void sapi(View view) {
        Intent intent = new Intent(this,Soal2.class);
        startActivity(intent);
    }

    public void ikan(View view) {
        Toast.makeText(this, "Yhaa.. jawaban kamu BELUM BENAR:(", Toast.LENGTH_SHORT).show();
    }

    public void harimau(View view) {
        Toast.makeText(this, "Yhaa.. jawaban kamu BELUM BENAR:(", Toast.LENGTH_SHORT).show();
    }
}
