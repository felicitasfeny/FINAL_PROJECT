package com.example.fighting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class BelajarMenuActivity extends AppCompatActivity {

    private long backPressedTime;
    private Toast backToast;

    @Override
    public void onBackPressed() {
        if (backPressedTime+2000>System.currentTimeMillis()){
            backToast.cancel();
            super.onBackPressed();
            return;
        }else{
            backToast= Toast.makeText(getBaseContext(), "Tekan sekali lagi untuk keluar", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime=System.currentTimeMillis();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar_menu);
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }

    public void warna(View view) {
        Intent intent = new Intent(this,BelajarWarna.class);
        startActivity(intent);
    }

    public void transportasi(View view) {
        Intent intent = new Intent(this,Transportasi.class);
        startActivity(intent);
    }

    public void buah(View view) {
        Intent intent = new Intent(this,Buah.class);
        startActivity(intent);
    }

    public void hewan(View view) {
        Intent intent = new Intent(this,Hewan.class);
        startActivity(intent);
    }
}
