package com.pravin.dice;

import android.animation.Animator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button roller;
    ImageView img_6;
    Random r;
    int rolledNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        roller=(Button) findViewById(R.id.roller);
        img_6=(ImageView) findViewById(R.id.img_6);
        r=new Random();
        roller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rolledNumber = r.nextInt(6) + 1;
                if (rolledNumber == 1) {
                    img_6.setImageResource(R.drawable.die_1);
                } else if (rolledNumber == 2) {
                    img_6.setImageResource(R.drawable.die_2);
                } else if (rolledNumber == 3) {
                    img_6.setImageResource(R.drawable.die_3);
                } else if (rolledNumber == 4) {
                    img_6.setImageResource(R.drawable.die_4);
                } else if (rolledNumber == 5) {
                    img_6.setImageResource(R.drawable.die_5);
                } else if (rolledNumber == 6) {
                    img_6.setImageResource(R.drawable.die_6);
                }

            }
        });
        roller.animate().scaleXBy(1f).setDuration(2000);
        img_6.animate().scaleYBy(1f).setDuration(2000);


    }
}
