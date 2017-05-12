package com.example.android.musicreviewer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView facebook = (TextView) findViewById(R.id.facebook_login);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get User Login Info and verify credentials with Facebook Authentication API
                // Create a new intent to open the {@link ProfileActivity}
                Intent profileIntent = new Intent(LoginActivity.this, ProfileActivity.class);

                // Start the new activity
                startActivity(profileIntent);
            }
        });

        TextView twitter = (TextView) findViewById(R.id.twitter_login);
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get User Login Info and verify credentials with Twitter Authentication API
                // Create a new intent to open the {@link ProfileActivity}
                Intent profileIntent = new Intent(LoginActivity.this, ProfileActivity.class);

                // Start the new activity
                startActivity(profileIntent);
            }
        });

        TextView googleplus = (TextView) findViewById(R.id.googleplus_login);
        googleplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Create a new intent to open the {@link ProfileActivity}
                Intent profileIntent = new Intent(LoginActivity.this, ProfileActivity.class);

                // Start the new activity
                startActivity(profileIntent);
            }
        });

        final EditText username = (EditText) findViewById(R.id.username);
        final EditText password = (EditText) findViewById(R.id.password);

        CheckBox KeepLogin = (CheckBox) findViewById(R.id.keepLogin);
                KeepLogin.setChecked(false);
        KeepLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Button submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get User Login Info and verify credentials
                username.getText().toString();
                password.getText().toString();
                // Create a new intent to open the {@link RackActivity}
                Intent settingsIntent = new Intent(LoginActivity.this, SettingsActivity.class);

                // Start the new activity
                startActivity(settingsIntent);
            }
        });
        TextView signup = (TextView) findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent signupIntent = new Intent(LoginActivity.this, SignupActivity.class);
            }
        });

            }
}
