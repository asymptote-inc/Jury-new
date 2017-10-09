package com.androidtutorialpoint.androidlogin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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
        previous = (Button) findViewById(R.id.btn_previous);
        next = (Button) findViewById(R.id.btn_next);


        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), TermsActivity.class);
                startActivity(i);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), GameActivity.class);
                startActivity(i);
            }
        });

    }


    public void testIt(){

    }
}
