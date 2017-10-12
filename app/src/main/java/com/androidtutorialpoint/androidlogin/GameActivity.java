package com.androidtutorialpoint.androidlogin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.RadioGroup.OnCheckedChangeListener;

/**
 * Created by sithi on 10/9/2017.
 */

public class GameActivity extends AppCompatActivity {

    private static SeekBar toxicBar;
    private static TextView questionDisplay;
    private String[] questions;
    private int questionID;
    private RadioGroup toxicityRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        questionDisplay = (TextView)findViewById(R.id.textDisplay);

        questions = new String[]{"What the fuck","Why the fuck","FuckOff"};
        toxicityRadioGroup = (RadioGroup) findViewById(R.id.toxicity_radio_group);

        // Allows you to interact with Fragments in an Activity
        FragmentManager fragmentManager = getFragmentManager();

        // beginTransaction() begins the FragmentTransaction which allows you to
        // add, attach, detach, hide, remove, replace, animate, transition or
        // show fragments
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // The Configuration object provides device configuration info
        // http://developer.android.com/reference/android/content/res/Configuration.html
        Configuration configInfo = getResources().getConfiguration();


        if (toxicityRadioGroup.getCheckedRadioButtonId() == -1)
        {
            // no radio buttons are checked,toxic levels step 1
            // call the button clicked identifier method submitForm()
            FragmentOne fragmentOne = new FragmentOne();

            fragmentTransaction.replace(android.R.id.content,
                    fragmentOne);

        }
        else
        {
            // one of the radio buttons is checked,toxic level step 2
            FragmentTwo fragmentTwo = new FragmentTwo();

            fragmentTransaction.replace(android.R.id.content,
                    fragmentTwo);
        }



//        toxicityRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
//        {
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//               submitForm();
//
//            }
//        });
        // Depending on the screen orientation replace with the correct fragment
//        if(configInfo.orientation == Configuration.ORIENTATION_LANDSCAPE){
//
//            FragmentOne fragmentOne = new FragmentOne();
//
//            fragmentTransaction.replace(android.R.id.content,
//                    fragmentOne);
//
//        } else {
//
//            FragmentTwo fragmentTwo = new FragmentTwo();
//
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.toxicity_radio_group);

        radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected
                FragmentTwo fragmentTwo = new FragmentTwo();
                switch(checkedId) {


                    case R.id.toxic_radio_btn:
                        // switch to fragment 1

                        fragmentTransaction.replace(android.R.id.content,
                                fragmentTwo);

                        fragmentTransaction.commit();

                        break;

                    case R.id.somewhattoxic_radio_btn:
//                       FragmentTwo fragmentTwo = new FragmentTwo();
                        fragmentTransaction.replace(android.R.id.content,
                                fragmentTwo);

                        fragmentTransaction.commit();
                        // Fragment 2

                        break;
                    case R.id.nottoxic_radio_btn:

                        fragmentTransaction.replace(android.R.id.content,
                                fragmentTwo);

                        fragmentTransaction.commit();
                        // Fragment 3

                        break;
                    default:

                        FragmentOne fragmentOne = new FragmentOne();

                        fragmentTransaction.replace(android.R.id.content,
                                fragmentOne);
                        fragmentTransaction.commit();

                        break;

                }
            }
        });
//            fragmentTransaction.replace(android.R.id.content,
//                    fragmentTwo);
//
//        }

        // Schedule for the replacement of the Fragment as soon as possible
//        fragmentTransaction.commit();

        // setContentView(R.layout.activity_my);
    }


    private void submitForm() {

        int selectedId = toxicityRadioGroup.getCheckedRadioButtonId();
        String toxicityLevel;
        if(selectedId == R.id.toxic_radio_btn)
            toxicityLevel = "toxic";
        FragmentManager fragmentManager = getFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        FragmentTwo fragmentTwo = new FragmentTwo();

        fragmentTransaction.replace(android.R.id.content,
                fragmentTwo);
        fragmentTransaction.commit();

        if(selectedId == R.id.nottoxic_radio_btn)
            toxicityLevel = "nottoxic";
        else
            toxicityLevel = "somewhattoxic";


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
