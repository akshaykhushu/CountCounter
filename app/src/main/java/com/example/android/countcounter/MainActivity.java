package com.example.android.countcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int TeamAScore = 0;
    private int TeamBScore = 0;

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        if(savedInstanceState != null) {
            TeamAScore = savedInstanceState.getInt("AScore");
            TeamBScore = savedInstanceState.getInt("BScore");
            TextView teamA = (TextView) findViewById(R.id.editTextTeamAscore);
            TextView teamB = (TextView) findViewById(R.id.editTextTeamBscore);
            teamA.setText(String.valueOf(TeamAScore));
            teamB.setText(String.valueOf(TeamBScore));
        }
    }

    @Override
    public void onSaveInstanceState(Bundle saveInstanceState){
        saveInstanceState.putInt("AScore",TeamAScore);
        saveInstanceState.putInt("BScore",TeamBScore);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void teamA3Points(View view){
        TeamAScore += 3;
        updateA(TeamAScore);
    }

    public void teamA2Points(View view){
        TeamAScore += 2;
        updateA(TeamAScore);
    }

    public void teamAFreeThrow(View view){
        TeamAScore += 1;
        updateA(TeamAScore);
    }

    public void teamB3Points(View view){
        TeamBScore += 3;
        updateB(TeamBScore);
    }

    public void teamB2Points(View view){
        TeamBScore += 2;
        updateB(TeamBScore);
    }

    public void teamBFreeThrow(View view){
        TeamBScore += 1;
        updateB(TeamBScore);
    }

    public void updateA(int number){
        TextView TextViewTeamA = (TextView) findViewById(R.id.editTextTeamAscore);
        String strTeamAScore = Integer.toString(number);
        TextViewTeamA.setText(strTeamAScore);
    }

    public void updateB(int number){
        TextView TextViewTeamB = (TextView) findViewById(R.id.editTextTeamBscore);
        String strTeamBScore = Integer.toString(number);
        TextViewTeamB.setText(strTeamBScore);
    }

    public void resetScore(View view){
        TeamAScore = 0;
        updateA(TeamAScore);
        TeamBScore = 0;
        updateB(TeamBScore);
    }


}
