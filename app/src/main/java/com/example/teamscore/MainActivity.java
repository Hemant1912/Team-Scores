package com.example.teamscore;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     Boolean a= true,b=false;

   int scoreA = 0;
   int scoreB = 0;
   MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this,R.raw.tone);
    }


    private void Display(int number) {

        if(a){
            TextView teamA = (TextView) findViewById(R.id.scoreA);
            teamA.setText(" "+number);

        }
        if(b){
            TextView teamB = (TextView)findViewById(R.id.scoreB);
            teamB.setText(" " + number);
        }
        if(a&&b){
            TextView teamA = (TextView) findViewById(R.id.scoreA);
            teamA.setText(" "+number);
            TextView teamB = (TextView)findViewById(R.id.scoreB);
            teamB.setText(" " + number);
            a = true;
            b = false;
        }

    }

    public void plusThreeA(View view)
    {  if(a&&!b) {
        mediaPlayer.start();
        scoreA += 3;
        Display(scoreA);
        b = true;
        a = false;
    }
    }
    public void plusThreeB(View view)
    {   if(!a && b) {
        scoreB += 3;
        mediaPlayer.start();
        Display(scoreB);
        a = true;
        b = false;
    }
    }
    public void plusTwoA(View view)
    {  if(a&&!b) {
        mediaPlayer.start();
        scoreA += 2;
        Display(scoreA);
        b = true;
        a = false;
    }
    }
    public void plusTwoB(View view)
    { if(!a&&b)
    {mediaPlayer.start();
        scoreB += 2;
        Display(scoreB);
        a = true;
        b = false;
    }

    }
    public void freeFallA(View view)
    {  if(a&&!b) {
        mediaPlayer.start();
        scoreA += 1;
        Display(scoreA);
        b = true;
        a = false;
    }
    }
    public void freeFallB(View view)
    {  if(!a&&b) {
        mediaPlayer.start();
        scoreB += 1;

        Display(scoreB);
        a = true;
        b = false;
    }
    }

    public void reset(View view)
    {
        mediaPlayer.start();
        int num = 0;
        scoreB = 0;
        scoreA = 0;
        a = true;
        b = true;
        Display(num);
        Display(num);
    }


}