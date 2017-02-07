package com.example.bkmiecik.chessclock;

import android.os.CountDownTimer;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Player player1;
    private Player player2;
    private Button b_switch;
    private Button b_start;
    private boolean isStart;
    private long defaultTime=180000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b_start = (Button) findViewById(R.id.b_start);
        b_switch = (Button) findViewById(R.id.b_switch);
        b_start.setText("Start");
        isStart=false;
        player1 = new Player(defaultTime,1);
        player2 = new Player(defaultTime,1);
        player1.textView = (TextView) findViewById(R.id.c_first_player);
        player2.textView = (TextView) findViewById(R.id.c_sec_player);
    }
    void pressStart(View view){
        if(!isStart){
            isStart=true;
            b_start.setText("Stop");
            player1.start();
        }
        else {
            player1.stop();
            player2.cancel();
            isStart=false;
            b_start.setText("Start");
        }
    }
    void pressSwitch(View view){


    }

}
