package com.example.android.musicreviewer;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class GenreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_genre.xml layout file
        setContentView(R.layout.activity_genre);



        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager2 = (ViewPager) findViewById(R.id.viewpager2);

        // Create an adapter that knows which fragment should be shown on each page
        GenreCategoryAdapter adapter = new GenreCategoryAdapter(this, getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager2.setAdapter(adapter);

        // Find the tab layout that shows the tabs
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs2);

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tabLayout.setupWithViewPager(viewPager2);


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
                Intent dashboardIntent = new Intent(GenreActivity.this, DashboardActivity.class);
                startActivity(dashboardIntent);
                return true;
            case R.id.rack_menu:
                Intent rackIntent = new Intent(GenreActivity.this, RackActivity.class);
                startActivity(rackIntent);
                return true;
            case R.id.title_menu:
                Intent findIntent = new Intent(GenreActivity.this, FindActivity.class);
                startActivity(findIntent);
                return true;
            case R.id.label_menu:
                Intent labelIntent = new Intent(GenreActivity.this, BrowseActivity.class);
                startActivity(labelIntent);
                return true;
            case R.id.profile_menu:
                Intent profileIntent = new Intent (GenreActivity.this, ProfileActivity.class);
                startActivity(profileIntent);
                return true;
            case R.id.logout_menu:
                Intent logoutIntent = new Intent(GenreActivity.this, LoginActivity.class);
                startActivity(logoutIntent);
                return true;
            case R.id.setting_menu:
                Intent settingsIntent = new Intent(GenreActivity.this, SettingsActivity.class);
                startActivity(settingsIntent);
                return true;
            case R.id.help_menu:
                return true;

        }
        return super.onOptionsItemSelected(item);
    }

    public void genres(View view) {
        TextView genres = (TextView) findViewById(R.id.genre_selector);
        genres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent genresIntent = new Intent(GenreActivity.this, FindActivity.class);
                startActivity(genresIntent);
            }
        });
    }
}