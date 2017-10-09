package com.androidtutorialpoint.androidlogin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * Created by sithi on 10/9/2017.
 */

public class GameActivity extends AppCompatActivity {

    private static SeekBar toxicBar;
    private static SeekBar identityHateBar;
    private static SeekBar obsceneBar;
    private static SeekBar insultBar;
    private static SeekBar threatBar;
    private static TextView questionDisplay;
    private String[] questions;
    private int questionID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        questionDisplay = (TextView)findViewById(R.id.textDisplay);

        questions = new String[]{"What the fuck","Why the fuck","FuckOff"};
    }

    public void onNextClick(View v){
        if (v.getId()== R.id.nextButton){
            // Intent i  = new Intent( Home.this, PostJob.class);
            //i.putExtra("User",user.toString());
            //startActivity(i);
            //setToxicBarColor();
        }
    }

    public void onPreviousClick(View v){
        if (v.getId()== R.id.previousButton){
            // Intent i  = new Intent( Home.this, PostJob.class);
            //i.putExtra("User",user.toString());
            //startActivity(i);
        }
    }

    public void getToxicBarLevel(){
        toxicBar = (SeekBar)findViewById(R.id.obsceneBar);
        int a = toxicBar.getProgress();

        Log.d("AAAAAaa", Integer.toString(a));
    }

    public void setText(String text){
        questionDisplay.setText(text);
    }

}
