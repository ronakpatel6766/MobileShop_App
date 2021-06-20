package com.example.individual_project;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

public class WelcomeActivity extends AppCompatActivity {



        private static int splashTimeOut= 4000;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_welcome);



            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent HomeIntent = new Intent(WelcomeActivity.this,MainActivity.class);
                    startActivity(HomeIntent);
                    finish();



                }
            },splashTimeOut);
        }

    }


