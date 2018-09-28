package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreForTeamA = 0;
    private int scoreForTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreForTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreForTeamA));
    }

    public void displayForTeamB(int scoreForTeamB){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreForTeamB));
    }

    public void addThreePoints(View view){
        scoreForTeamA = scoreForTeamA +3;
        displayForTeamA(scoreForTeamA);
    }

    public void addTwoPoints(View view){
        scoreForTeamA = scoreForTeamA + 2;
        displayForTeamA(scoreForTeamA);
    }

    public void addOnePoint(View view){
        scoreForTeamA = scoreForTeamA +1;
        displayForTeamA(scoreForTeamA);
    }

    public void addThreePointsTeamB(View view){
        scoreForTeamB = scoreForTeamB + 3;
        displayForTeamB(scoreForTeamB);
    }

    public void addTwoPointsTeamB(View view){
        scoreForTeamB = scoreForTeamB + 2;
        displayForTeamB(scoreForTeamB);
    }

    public void addOnePointTeamB(View view){
        scoreForTeamB = scoreForTeamB +1;
        displayForTeamA(scoreForTeamB);
    }

    public void resetScores(View view){
        scoreForTeamA=0;
        scoreForTeamB=0;
        displayForTeamA(scoreForTeamA);
        displayForTeamB(scoreForTeamB);
    }

}
