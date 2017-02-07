package com.example.bkmiecik.chessclock;

import android.os.CountDownTimer;
import android.widget.TextView;

/**
 * Created by bkmiecik on 06.02.17.
 */
public class Player extends CountDownTimer {

    TextView textView;
    long millisTillend;

    /**
     * @param millisInFuture    The number of millis in the future from the call
     *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
     *                          is called.
     * @param countDownInterval The interval along the way to receive
     *                          {@link #onTick(long)} callbacks.
     */
    public Player(long millisInFuture, long countDownInterval) {
        super(millisInFuture, countDownInterval);
        millisTillend=millisInFuture;
    }


    @Override
    public void onTick(long millisUntilFinished) {
        String min = String.format("%02d", millisUntilFinished/60000);
        int sec = (int)( (millisUntilFinished%60000)/1000);
        int ms = (int)( (millisUntilFinished%1000));
        textView.setText(min+":"+String.format("%02d",sec)+"."+String.format("%03d",ms));
        millisTillend=millisUntilFinished;
    }

    @Override
    public void onFinish() {
            textView.setText("done!");
    }

    public void setTime(){
        new Player(millisTillend,1);
    }

    public void setTextView(){
        String min = String.format("%02d", millisTillend/60000);
        int sec = (int)( (millisTillend%60000)/1000);
        int ms = (int)( (millisTillend%1000));
        textView.setText(min+":"+String.format("%02d",sec)+"."+String.format("%03d",ms));
    };

    public void stop(){
        this.setTime();
        setTextView();
    }
}
