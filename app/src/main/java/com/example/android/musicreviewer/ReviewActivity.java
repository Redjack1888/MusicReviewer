package com.example.android.musicreviewer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class ReviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case R.id.dashboard_menu:
                Intent dashboardIntent = new Intent(ReviewActivity.this, DashboardActivity.class);
                startActivity(dashboardIntent);
                return true;
            case R.id.rack_menu:
                Intent rackIntent = new Intent(ReviewActivity.this, RackActivity.class);
                startActivity(rackIntent);
                return true;
            case R.id.title_menu:
                Intent findIntent = new Intent(ReviewActivity.this, FindActivity.class);
                startActivity(findIntent);
                return true;
            case R.id.label_menu:
                Intent labelIntent = new Intent(ReviewActivity.this, BrowseActivity.class);
                startActivity(labelIntent);
                return true;
            case R.id.profile_menu:
                Intent profileIntent = new Intent (ReviewActivity.this, ProfileActivity.class);
                startActivity(profileIntent);
                return true;
            case R.id.logout_menu:
                Intent logoutIntent = new Intent(ReviewActivity.this, LoginActivity.class);
                startActivity(logoutIntent);
                return true;
            case R.id.setting_menu:
                Intent settingsIntent = new Intent(ReviewActivity.this, SettingsActivity.class);
                startActivity(settingsIntent);
                return true;
            case R.id.help_menu:
                return true;

        }
        return super.onOptionsItemSelected(item);
    }
}
