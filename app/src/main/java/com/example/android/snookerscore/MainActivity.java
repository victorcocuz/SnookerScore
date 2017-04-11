package com.example.android.snookerscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import static com.example.android.snookerscore.R.id.faulBlackB;
import static com.example.android.snookerscore.R.id.faulGreyA;

public class MainActivity extends AppCompatActivity {
    //    Player A Variables
    int scorePlayerA = 0;
    int scoreRedA = 0;
    int scoreYellowA = 0;
    int scoreGreenA = 0;
    int scoreBrownA = 0;
    int scoreBlueA = 0;
    int scorePinkA = 0;
    int scoreBlackA = 0;
    //      Player B Variables
    int scorePlayerB = 0;
    int scoreRedB = 0;
    int scoreYellowB = 0;
    int scoreGreenB = 0;
    int scoreBrownB = 0;
    int scoreBlueB = 0;
    int scorePinkB = 0;
    int scoreBlackB = 0;
    //      Frame Variables
    int scoreFramePlayerA = 0;
    int scoreFramePlayerB = 0;
    //      Faul Variables
    int faulGreyA = 0;
    int faulBlueA = 0;
    int faulPinkA = 0;
    int faulBlackA = 0;
    int faulGreyB = 0;
    int faulBlueB = 0;
    int faulPinkB = 0;
    int faulBlackB = 0;
    //      Calculation Variables
    int remaining = 147;
    int difference = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        displayRemaining(remaining);
        displayDifference(difference);
    }

    //      Player A score
    public void addOnePlayerA(View v) {
        scorePlayerA = scorePlayerA + 1;
        scoreRedA = scoreRedA + 1;
        remaining = remaining - 8;
        displayPlayerA(scorePlayerA);
        displayRedA(scoreRedA);
        displayRemaining(remaining);
        difference = Math.abs(scorePlayerA - scorePlayerB);
        displayDifference(difference);
    }

    public void addTwoPlayerA(View v) {
        scorePlayerA = scorePlayerA + 2;
        scoreYellowA = scoreYellowA + 1;
        displayPlayerA(scorePlayerA);
        displayYellowA(scoreYellowA);
        difference = Math.abs(scorePlayerA - scorePlayerB);
        displayDifference(difference);
    }

    public void addThreePlayerA(View v) {
        scorePlayerA = scorePlayerA + 3;
        scoreGreenA = scoreGreenA + 1;
        displayPlayerA(scorePlayerA);
        displayGreenA(scoreGreenA);
        difference = Math.abs(scorePlayerA - scorePlayerB);
        displayDifference(difference);
    }

    public void addFourPlayerA(View v) {
        scorePlayerA = scorePlayerA + 4;
        scoreBrownA = scoreBrownA + 1;
        displayPlayerA(scorePlayerA);
        displayBrownA(scoreBrownA);
        difference = Math.abs(scorePlayerA - scorePlayerB);
        displayDifference(difference);
    }

    public void addFivePlayerA(View v) {
        scorePlayerA = scorePlayerA + 5;
        scoreBlueA = scoreBlueA + 1;
        displayPlayerA(scorePlayerA);
        displayBlueA(scoreBlueA);
        difference = Math.abs(scorePlayerA - scorePlayerB);
        displayDifference(difference);
    }

    public void addSixPlayerA(View v) {
        scorePlayerA = scorePlayerA + 6;
        scorePinkA = scorePinkA + 1;
        displayPlayerA(scorePlayerA);
        displayPinkA(scorePinkA);
        difference = Math.abs(scorePlayerA - scorePlayerB);
        displayDifference(difference);
    }

    public void addSevenPlayerA(View v) {
        scorePlayerA = scorePlayerA + 7;
        scoreBlackA = scoreBlackA + 1;
        displayPlayerA(scorePlayerA);
        displayBlackA(scoreBlackA);
        difference = Math.abs(scorePlayerA - scorePlayerB);
        displayDifference(difference);
    }

    //      Player B score
    public void addOnePlayerB(View v) {
        scorePlayerB = scorePlayerB + 1;
        scoreRedB = scoreRedB + 1;
        remaining = remaining - 8;
        displayPlayerB(scorePlayerB);
        displayRedB(scoreRedB);
        displayRemaining(remaining);
        difference = Math.abs(scorePlayerA - scorePlayerB);
        displayDifference(difference);
    }

    public void addTwoPlayerB(View v) {
        scorePlayerB = scorePlayerB + 2;
        scoreYellowB = scoreYellowB + 1;
        displayPlayerB(scorePlayerB);
        displayYellowB(scoreYellowB);
        difference = Math.abs(scorePlayerA - scorePlayerB);
        displayDifference(difference);
    }

    public void addThreePlayerB(View v) {
        scorePlayerB = scorePlayerB + 3;
        scoreGreenB = scoreGreenB + 1;
        displayPlayerB(scorePlayerB);
        displayGreenB(scoreGreenB);
        difference = Math.abs(scorePlayerA - scorePlayerB);
        displayDifference(difference);
    }

    public void addFourPlayerB(View v) {
        scorePlayerB = scorePlayerB + 4;
        scoreBrownB = scoreBrownB + 1;
        displayPlayerB(scorePlayerB);
        displayBrownB(scoreBrownB);
        difference = Math.abs(scorePlayerA - scorePlayerB);
        displayDifference(difference);
    }

    public void addFivePlayerB(View v) {
        scorePlayerB = scorePlayerB + 5;
        scoreBlueB = scoreBlueB + 1;
        displayPlayerB(scorePlayerB);
        displayBlueB(scoreBlueB);
        difference = Math.abs(scorePlayerA - scorePlayerB);
        displayDifference(difference);
    }

    public void addSixPlayerB(View v) {
        scorePlayerB = scorePlayerB + 6;
        scorePinkB = scorePinkB + 1;
        displayPlayerB(scorePlayerB);
        displayPinkB(scorePinkB);
        difference = Math.abs(scorePlayerA - scorePlayerB);
        displayDifference(difference);
    }

    public void addSevenPlayerB(View v) {
        scorePlayerB = scorePlayerB + 7;
        scoreBlackB = scoreBlackB + 1;
        displayPlayerB(scorePlayerB);
        displayBlackB(scoreBlackB);
        difference = Math.abs(scorePlayerA - scorePlayerB);
        displayDifference(difference);
    }

    //      Fauls
    public void increaseFourPlayerB(View V) {
        scorePlayerB = scorePlayerB + 4;
        faulGreyA++;
        displayPlayerB(scorePlayerB);
        displayFaulGreyA(faulGreyA);
    }

    public void increaseFivePlayerB(View V) {
        scorePlayerB = scorePlayerB + 5;
        faulBlueA++;
        displayPlayerB(scorePlayerB);
        displayFaulBlueA(faulBlueA);
    }

    public void increaseSixPlayerB(View V) {
        scorePlayerB = scorePlayerB + 6;
        faulPinkA++;
        displayPlayerB(scorePlayerB);
        displayFaulPinkA(faulPinkA);
    }

    public void increaseSevenPlayerB(View V) {
        scorePlayerB = scorePlayerB + 7;
        faulBlackA++;
        displayPlayerB(scorePlayerB);
        displayFaulBlackA(faulBlackA);
    }

    public void increaseFourPlayerA(View V) {
        scorePlayerA = scorePlayerA + 4;
        faulGreyB++;
        displayPlayerA(scorePlayerA);
        displayFaulGreyB(faulGreyB);
    }

    public void increaseFivePlayerA(View V) {
        scorePlayerA = scorePlayerA + 5;
        faulBlueB++;
        displayPlayerA(scorePlayerA);
        displayFaulBlueB(faulBlueB);
    }

    public void increaseSixPlayerA(View V) {
        scorePlayerA = scorePlayerA + 6;
        faulPinkB++;
        displayPlayerA(scorePlayerA);
        displayFaulPinkB(faulPinkB);
    }

    public void increaseSevenPlayerA(View V) {
        scorePlayerA = scorePlayerA + 7;
        faulBlackB++;
        displayPlayerA(scorePlayerA);
        displayFaulBlackB(faulBlackB);
    }

    //      Reset Score
    public void reset() {
        scorePlayerA = 0;
        scorePlayerB = 0;
        scoreRedA = 0;
        scoreYellowA = 0;
        scoreGreenA = 0;
        scoreBrownA = 0;
        scoreBlueA = 0;
        scorePinkA = 0;
        scoreBlackA = 0;
        scoreRedB = 0;
        scoreYellowB = 0;
        scoreGreenB = 0;
        scoreBrownB = 0;
        scoreBlueB = 0;
        scorePinkB = 0;
        scoreBlackB = 0;
        faulGreyA = 0;
        faulBlueA = 0;
        faulPinkA = 0;
        faulBlackA = 0;
        faulGreyB = 0;
        faulBlueB = 0;
        faulPinkB = 0;
        faulBlackB = 0;
        remaining = 147;
        difference = 0;
        displayPlayerA(scorePlayerA);
        displayPlayerB(scorePlayerB);
        displayRedA(scoreRedA);
        displayYellowA(scoreYellowA);
        displayGreenA(scoreGreenA);
        displayBrownA(scoreBrownA);
        displayBlueA(scoreBlueA);
        displayPinkA(scorePinkA);
        displayBlackA(scoreBlackA);
        displayRedB(scoreRedB);
        displayYellowB(scoreYellowB);
        displayGreenB(scoreGreenB);
        displayBrownB(scoreBrownB);
        displayBlueB(scoreBlueB);
        displayPinkB(scorePinkB);
        displayBlackB(scoreBlackB);
        displayFaulGreyA(faulGreyA);
        displayFaulBlueA(faulBlueA);
        displayFaulPinkA(faulPinkA);
        displayFaulBlackA(faulBlackA);
        displayFaulGreyB(faulGreyB);
        displayFaulBlueB(faulBlueB);
        displayFaulPinkB(faulPinkB);
        displayFaulBlackB(faulBlackB);
        displayRemaining(remaining);
        displayDifference(difference);
    }

    public void resetScore(View v) {
        reset();
    }

    //      Concede
    public void concedeFrame(View v) {
        if (scorePlayerA > scorePlayerB) {
            scoreFramePlayerA = scoreFramePlayerA + 1;
            displayScoreFramePlayerA(scoreFramePlayerA);
        } else {
            scoreFramePlayerB = scoreFramePlayerB + 1;
            displayScoreFramePlayerB(scoreFramePlayerB);
        }
        reset();
    }

    //      Display Player A Score
    public void displayPlayerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreFrameA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRedA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pointRedA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pointYellowA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayGreenA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pointGreenA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBrownA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pointBrownA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBlueA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pointBlueA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPinkA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pointPinkA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBlackA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pointBlackA);
        scoreView.setText(String.valueOf(score));
    }

    //      Display Player B Score
    public void displayPlayerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreFrameB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRedB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pointRedB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pointYellowB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayGreenB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pointGreenB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBrownB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pointBrownB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBlueB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pointBlueB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPinkB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pointPinkB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBlackB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pointBlackB);
        scoreView.setText(String.valueOf(score));
    }

    //      Display Fauls
    public void displayFaulGreyA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faulTextGreyA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFaulBlueA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faulTextBlueA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFaulPinkA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faulTextPinkA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFaulBlackA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faulTextBlackA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFaulGreyB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faulTextGreyB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFaulBlueB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faulTextBlueB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFaulPinkB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faulTextPinkB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFaulBlackB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faulTextBlackB);
        scoreView.setText(String.valueOf(score));
    }

    //      Display Remaining Score
    public void displayRemaining(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreRemaining);
        scoreView.setText(String.valueOf(score));
    }

    //      Display Frame Score
    public void displayScoreFramePlayerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreMatchA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayScoreFramePlayerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreMatchB);
        scoreView.setText(String.valueOf(score));
    }

    //      Display Difference
    public void displayDifference(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreDifference);
        scoreView.setText(String.valueOf(score));
    }

}
