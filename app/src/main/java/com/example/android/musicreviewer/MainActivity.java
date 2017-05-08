package com.example.android.musicreviewer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the login
        Button login = (Button) findViewById(R.id.start);

        // Set a click listener on that View
        login.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the login is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link LoginActivity}
                Intent loginIntent = new Intent(MainActivity.this, LoginActivity.class);

                // Start the new activity
                startActivity(loginIntent);
            }
        });
    }
}
