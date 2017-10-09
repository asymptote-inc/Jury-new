package com.androidtutorialpoint.androidlogin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

/**
 * Created by sithi on 10/9/2017.
 */

public class InstructionsActivity extends AppCompatActivity {

    private Button previous;
    private Button next;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);

        testIt();

    }


    public void testIt(){

    }
}
