package edu.uga.cs.project4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
/**
 * SplashScreen class represents the initial screen of the quiz application.
 * Users can navigate to different sections of the application from this screen.
 */
public class SplashScreen extends AppCompatActivity {
    /**
     * Called when the activity is starting.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_splash);
        Button helpButton = findViewById(R.id.helpButton);
        Button startButton = findViewById(R.id.playButton);

        helpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the MainActivity
                Intent intent = new Intent(SplashScreen.this, HelpActivity.class);
                startActivity(intent);
            }
        });

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the MainActivity
                Intent intent = new Intent(SplashScreen.this, QuizActivity.class);
                startActivity(intent);
            }
        });

        Button scoresButton = findViewById(R.id.scoreButton);
        scoresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the ScoresActivity
                Intent intent = new Intent(SplashScreen.this, PriorQuizActivity.class);
                startActivity(intent);
            }
        });
    }
}