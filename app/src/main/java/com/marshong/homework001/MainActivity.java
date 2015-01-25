package com.marshong.homework001;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    // tagging
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(LOG_TAG, "onCreate() called");

        //create and implement the start button listener in a virtual class
        Button startButton = (Button) findViewById(R.id.second_screen_button);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change the layout to the second page
                Log.d(LOG_TAG, "onClick() called");

                //use intents to start another activity.
                //this is helpful when pressing the back button, to return to the previous screen
                //instead of exiting the app.
                Intent screenChangeIntent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(screenChangeIntent);
            }
        });
    }


}
