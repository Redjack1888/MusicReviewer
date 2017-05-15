package com.example.android.musicreviewer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class RequestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);

        Button dashboard = (Button) findViewById(R.id.go_dashboard2);
        dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dashboardIntent = new Intent(RequestActivity.this, DashboardActivity.class);
                startActivity(dashboardIntent);
            }
        });
        Button rack = (Button) findViewById(R.id.go_rack);
        rack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rackIntent = new Intent(RequestActivity.this, RackActivity.class);
                startActivity(rackIntent);
            }
        });

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
                Intent dashboardIntent = new Intent(RequestActivity.this, DashboardActivity.class);
                startActivity(dashboardIntent);
                return true;
            case R.id.rack_menu:
                Intent rackIntent = new Intent(RequestActivity.this, RackActivity.class);
                startActivity(rackIntent);
                return true;
            case R.id.title_menu:
                Intent findIntent = new Intent(RequestActivity.this, FindActivity.class);
                startActivity(findIntent);
                return true;
            case R.id.label_menu:
                Intent labelIntent = new Intent(RequestActivity.this, BrowseActivity.class);
                startActivity(labelIntent);
                return true;
            case R.id.profile_menu:
                Intent profileIntent = new Intent (RequestActivity.this, ProfileActivity.class);
                startActivity(profileIntent);
                return true;
            case R.id.logout_menu:
                Intent logoutIntent = new Intent(RequestActivity.this, LoginActivity.class);
                startActivity(logoutIntent);
                return true;
            case R.id.setting_menu:
                Intent settingsIntent = new Intent(RequestActivity.this, SettingsActivity.class);
                startActivity(settingsIntent);
                return true;
            case R.id.help_menu:
                return true;

        }
        return super.onOptionsItemSelected(item);
    }
}
