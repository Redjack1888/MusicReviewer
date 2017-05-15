package com.example.android.musicreviewer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Button profile = (Button)findViewById(R.id.go_profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profileIntent = new Intent(SettingsActivity.this, ProfileActivity.class);
                startActivity(profileIntent);
            }
        });

    }

    //        Create a Menu in the AppBar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.dashboard_menu:
                Intent dashboardIntent = new Intent(SettingsActivity.this, DashboardActivity.class);
                startActivity(dashboardIntent);
                return true;
            case R.id.rack_menu:
                Intent rackIntent = new Intent(SettingsActivity.this, RackActivity.class);
                startActivity(rackIntent);
                return true;
            case R.id.title_menu:
                Intent findIntent = new Intent(SettingsActivity.this, FindActivity.class);
                startActivity(findIntent);
                return true;
            case R.id.label_menu:
                Intent labelIntent = new Intent(SettingsActivity.this, BrowseActivity.class);
                startActivity(labelIntent);
                return true;
            case R.id.profile_menu:
                Intent profileIntent = new Intent (SettingsActivity.this, ProfileActivity.class);
                startActivity(profileIntent);
                return true;
            case R.id.logout_menu:
                Intent logoutIntent = new Intent(SettingsActivity.this, LoginActivity.class);
                startActivity(logoutIntent);
                return true;
            case R.id.help_menu:
                return true;

        }
        return super.onOptionsItemSelected(item);
    }
}
