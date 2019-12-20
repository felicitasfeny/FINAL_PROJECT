package com.example.fighting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private long backPressedTime;
    private Toast backToast;

    @Override
    public void onBackPressed() {
        if (backPressedTime+2000>System.currentTimeMillis()){
            backToast.cancel();
            super.onBackPressed();
            finishAffinity();
//            return;
//            android.os.Process.killProcess(android.os.Process.myPid());
//           System.exit(0);
        }else{
            backToast= Toast.makeText(getBaseContext(), "Tekan sekali lagi untuk keluar", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime=System.currentTimeMillis();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }

    public void belajar(View view) {
        Intent intent = new Intent(this,BelajarMenuActivity.class);
        startActivity(intent);
    }

    public void nyanyi(View view) {
        Intent intent = new Intent(this,NyanyiMenuActivity.class);
        startActivity(intent);
    }

    public void main(View view) {
        Intent intent = new Intent(this,BermainMenuActivity.class);
        startActivity(intent);
    }
}
