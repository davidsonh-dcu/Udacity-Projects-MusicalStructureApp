package com.example.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ManicStreetPreachersActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manic_street_preachers);

        // Set onClickListeners on ImageButtons
        // Ref: https://stackoverflow.com/questions/5812744/how-to-set-an-onclick-listener-for-an-imagebutton-in-an-alertdialog

        // Navigate back to the main Activity
        ImageButton homeImageButton = (ImageButton) findViewById(R.id.imageButtonHome);
        homeImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create a new intent to open the {@link Westlife Activity}
                Intent mainActivty = new Intent (ManicStreetPreachersActivity.this , MainActivity.class);
                // set the new Westlife activity
                startActivity(mainActivty);
            }
        });

        // Stop song
        ImageButton stopImageButton = (ImageButton) findViewById(R.id.imageButtonStop);
        stopImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ManicStreetPreachersActivity.this, "Stop playing song", Toast.LENGTH_SHORT).show();
            }
        });

        // Pause song
        ImageButton pauseImageButton = (ImageButton) findViewById(R.id.imageButtonPause);
        pauseImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ManicStreetPreachersActivity.this, "Pause song", Toast.LENGTH_SHORT).show();
            }
        });

        // Play Song
        ImageButton playImageButton = (ImageButton) findViewById(R.id.imageButtonPlay);
        playImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ManicStreetPreachersActivity.this, "Play song", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
