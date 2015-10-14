package com.blogjihad.nano.nanodegreeproject;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button spotifyButton = (Button) findViewById(R.id.spotify_streamer);
        spotifyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(getApplicationContext(), "Spotify Streamer", Toast.LENGTH_SHORT).show();
            }
        });



        Button scoresButton = (Button) findViewById(R.id.scores_btn);
        scoresButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(getApplicationContext(), "Scores App", Toast.LENGTH_SHORT).show();
            }
        });



        Button libraryButton = (Button) findViewById(R.id.library_btn);
        libraryButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(getApplicationContext(), "Library App", Toast.LENGTH_SHORT).show();
            }
        });



        Button buildBtn = (Button) findViewById(R.id.build_btn);
        buildBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(getApplicationContext(), "Build it Bigger App", Toast.LENGTH_SHORT).show();
            }
        });



        Button xyzButton = (Button) findViewById(R.id.xyz_btn);
        xyzButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(getApplicationContext(), "XYZ App", Toast.LENGTH_SHORT).show();
            }
        });


        Button capstoneButton = (Button) findViewById(R.id.capstone_btn);
        capstoneButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(getApplicationContext(), "Capstone App", Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
