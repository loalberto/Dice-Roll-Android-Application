package com.example.android.dicerollapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

import java.security.SecureRandom;

public class MainActivity extends AppCompatActivity {

    SecureRandom mSecureRandom = new SecureRandom();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ImageView imgLeftDice = (ImageView)findViewById(R.id.imgLeftDice);
        final ImageView imgRightDice = (ImageView)findViewById(R.id.imgRightDice);
        final Button btnRoll = (Button)findViewById(R.id.btnRoll);

        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomNum = 1 + mSecureRandom.nextInt(6);
                int randomNum2 = 1 + mSecureRandom.nextInt(6);

                switch (randomNum){
                    case 1:
                        imgLeftDice.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        imgLeftDice.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        imgLeftDice.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        imgLeftDice.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        imgLeftDice.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        imgLeftDice.setImageResource(R.drawable.dice6);
                        break;
                    default:
                        break;
                }
                switch (randomNum2){
                    case 1:
                        imgRightDice.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        imgRightDice.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        imgRightDice.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        imgRightDice.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        imgRightDice.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        imgRightDice.setImageResource(R.drawable.dice6);
                        break;
                    default:
                        break;
                }
            }
        });

    }
}
