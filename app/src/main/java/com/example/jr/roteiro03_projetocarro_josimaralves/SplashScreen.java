package com.example.jr.roteiro03_projetocarro_josimaralves;

import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity implements Runnable {
    private static final int DELAY = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Handler handler = new Handler();
        handler.postDelayed(this, DELAY);
        ImageView img = (ImageView) findViewById(R.id.logo);
        ObjectAnimator obj = ObjectAnimator.ofFloat(img, "alpha", 0f, 1f);
        obj.setDuration(3000);
        obj.start();
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void ocultarBarraDeNavegação() {
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }

    @Override
    public void run() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
