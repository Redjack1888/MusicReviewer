package com.example.android.musicreviewer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class CdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        Button request = (Button) findViewById(R.id.request_button);
        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent requestIntent = new Intent(CdActivity.this, RequestActivity.class);
                startActivity(requestIntent);
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
                Intent dashboardIntent = new Intent(CdActivity.this, DashboardActivity.class);
                startActivity(dashboardIntent);
            case R.id.rack_menu:
                Intent rackIntent = new Intent(CdActivity.this, RackActivity.class);
                startActivity(rackIntent);
                return true;
            case R.id.title_menu:
                Intent findIntent = new Intent(CdActivity.this, FindActivity.class);
                startActivity(findIntent);
                return true;
            case R.id.label_menu:
                Intent labelIntent = new Intent(CdActivity.this, BrowseActivity.class);
                startActivity(labelIntent);
                return true;
            case R.id.profile_menu:
                Intent profileIntent = new Intent(CdActivity.this, ProfileActivity.class);
                startActivity(profileIntent);
                return true;
            case R.id.logout_menu:
                Intent logoutIntent = new Intent(CdActivity.this, LoginActivity.class);
                startActivity(logoutIntent);
                return true;
            case R.id.setting_menu:
                Intent settingsIntent = new Intent(CdActivity.this, SettingsActivity.class);
                startActivity(settingsIntent);
                return true;
            case R.id.help_menu:
                return true;

        }
        return super.onOptionsItemSelected(item);
    }
}
