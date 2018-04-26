package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int aWins = 0;
    int bWins = 0;
    int aKills = 0;
    int bKills = 0;
    int aDeaths = 0;
    int bDeaths = 0;
    TextView aWinView;
    TextView bWinView;
    TextView aKillView;
    TextView bKillView;
    TextView aDeathView;
    TextView bDeathView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aWinView = findViewById(R.id.AWins);
        bWinView = findViewById(R.id.BWins);
        aKillView = findViewById(R.id.AKills);
        bKillView = findViewById(R.id.BKills);
        aDeathView = findViewById(R.id.ADeaths);
        bDeathView = findViewById(R.id.BDeaths);
    }

    public void AKillPlus(View view){
        aKills++;
        aKillView.setText(String.valueOf(aKills));
    }
    public void BKillPlus(View view){
        bKills++;
        bKillView.setText(String.valueOf(bKills));
    }
    public void ADeathPlus(View view){
        aDeaths++;
        aDeathView.setText(String.valueOf(aDeaths));
    }
    public void BDeathPlus(View view){
        bDeaths++;
        bDeathView.setText(String.valueOf(bDeaths));
    }
    public void AWinPlus(View view){
        aWins++;
        aWinView.setText(String.valueOf(aWins));
        WinReset();
    }
    public void BWinPlus(View view){
        bWins++;
        bWinView.setText(String.valueOf(bWins));
        WinReset();
    }
    private void WinReset (){
        aKills = 0;
        bKills = 0;
        aDeaths = 0;
        bDeaths = 0;
        aKillView.setText(String.valueOf(aKills));
        bKillView.setText(String.valueOf(bKills));
        aDeathView.setText(String.valueOf(aDeaths));
        bDeathView.setText(String.valueOf(bDeaths));
    }
    public void Reset(View view){
        aWins = 0;
        bWins = 0;
        aKills = 0;
        bKills = 0;
        aDeaths = 0;
        bDeaths = 0;
        aWinView.setText(String.valueOf(0));
        bWinView.setText(String.valueOf(0));
        aKillView.setText(String.valueOf(aKills));
        bKillView.setText(String.valueOf(bKills));
        aDeathView.setText(String.valueOf(aDeaths));
        bDeathView.setText(String.valueOf(bDeaths));
    }

}
