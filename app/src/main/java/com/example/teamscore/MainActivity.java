package com.example.teamscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   int scoreA = 0;
   int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private void DisplayA(int number) {
        TextView teamA = (TextView) findViewById(R.id.scoreA);
        teamA.setText(" "+number);

    }
    private void DisplayB(int number) {
        TextView teamB = (TextView)findViewById(R.id.scoreB);
        teamB.setText(" " + number);
    }
    public void plusThreeA(View view)
    {  scoreA += 3;
    DisplayA(scoreA);

    }
    public void plusThreeB(View view)
    {   scoreB += 3;
        DisplayB(scoreB);

    }
    public void plusTwoA(View view)
    {  scoreA += 2;
        DisplayA(scoreA);
    }
    public void plusTwoB(View view)
    { scoreB += 2;
        DisplayB(scoreB);
    }
    public void freeFallA(View view)
    {  scoreA += 1;
        DisplayA(scoreA);
    }
    public void freeFallB(View view)
    {  scoreB += 1;
        DisplayB(scoreB);
    }

    public void reset(View view)
    {
        int num = 0;
        scoreB = 0;
        scoreA = 0;
        DisplayA(num);
        DisplayB(num);
    }


}