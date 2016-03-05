package com.example.jr.roteiro02;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity implements Runnable {
    private static final int DELAY = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler handler = new Handler();
        handler.postDelayed(this, DELAY);
        ImageView img = (ImageView) findViewById(R.id.splash);
        ObjectAnimator obj = ObjectAnimator.ofFloat(img, "alpha", 0f, 1f);
        obj.setDuration(3000);
        obj.start();
    }

    @Override
    public void run() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
