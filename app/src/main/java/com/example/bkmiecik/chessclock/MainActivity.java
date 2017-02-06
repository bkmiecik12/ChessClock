package com.example.bkmiecik.chessclock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Player player1;
    private Player player2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        player1.chronometer = (Button) findViewById(R.id.b_first_player);
        player2.chronometer = (Button) findViewById(R.id.b_sec_player);
    }

}
