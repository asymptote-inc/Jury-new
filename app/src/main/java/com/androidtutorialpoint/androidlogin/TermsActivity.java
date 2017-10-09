package com.androidtutorialpoint.androidlogin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

/**
 * Created by sithi on 10/9/2017.
 */

public class TermsActivity extends AppCompatActivity {

    private CheckBox chk1, chk2, chk3;
    private Button btnDisplay;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);

        addListenerOnChkIos();
        addListenerOnButton();
    }

    public void addListenerOnChkIos() {

        chk1 = (CheckBox) findViewById(R.id.chk1);

        chk1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(TermsActivity.this,
                            "Bro, try Android :)", Toast.LENGTH_LONG).show();
                }

            }
        });

    }

    public void addListenerOnButton() {

        chk1 = (CheckBox) findViewById(R.id.chk1);
        chk2 = (CheckBox) findViewById(R.id.chk2);
        chk3 = (CheckBox) findViewById(R.id.chk3);
        btnDisplay = (Button) findViewById(R.id.btnDisplay);

        btnDisplay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if(chk1.isChecked() && chk2.isChecked() && chk3.isChecked()){
                    Intent i = new Intent(getApplicationContext(), InstructionsActivity.class);
                    startActivity(i);

                }
//                StringBuffer result = new StringBuffer();
//                result.append("IPhone check : ")
//                        .append(chk1.isChecked());
//                result.append("\nAndroid check : ").append(
//                        chk2.isChecked());
//                result.append("\nWindows Mobile check :").append(
//                        chk3.isChecked());
//
//                Toast.makeText(TermsActivity.this, result.toString(),
//                        Toast.LENGTH_LONG).show();

            }
        });

    }
}
