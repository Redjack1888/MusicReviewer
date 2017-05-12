package com.example.android.musicreviewer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list);


        // Create a list of items
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.string.band_name, R.string.album_title,
                R.drawable.nocover));
        items.add(new Item(R.string.band_name, R.string.album_title,
                R.drawable.nocover));
        items.add(new Item(R.string.band_name, R.string.album_title,
                R.drawable.nocover));
        items.add(new Item(R.string.band_name, R.string.album_title,
                R.drawable.nocover));
        items.add(new Item(R.string.band_name, R.string.album_title,
                R.drawable.nocover));
        items.add(new Item(R.string.band_name, R.string.album_title,
                R.drawable.nocover));
        items.add(new Item(R.string.band_name, R.string.album_title,
                R.drawable.nocover));
        items.add(new Item(R.string.band_name, R.string.album_title,
                R.drawable.nocover));
        items.add(new Item(R.string.band_name, R.string.album_title,
                R.drawable.nocover));
        items.add(new Item(R.string.band_name, R.string.album_title,
                R.drawable.nocover));

        // Create an {@link ItemAdapter}, whose data source is a list of {@link Item}s. The
        // adapter knows how to create list items for each item in the list.
        ItemAdapter adapter = new ItemAdapter(this, items, R.color.category_phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // item_listyout file.
        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ItemAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Item} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Get the {@link Item} object at the given position the user clicked on
                Item item = items.get(position);
                // Create a new intent to open the {@link AlbumsActivity} according to item selected
                Intent albumIntent = new Intent(AlbumsActivity.this, AlbumsActivity.class);

                // Start the new activity
                startActivity(albumIntent);


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

            case R.id.rack_menu:
//                Intent rackIntent = new Intent(ProfileActivity.this, RackActivity.class);
//                startActivity(rackIntent);
                return true;
            case R.id.title_menu:
                return true;
            case R.id.label_menu:
                return true;
            case R.id.logout_menu:
                return true;
            case R.id.setting_menu:
                Intent settingsIntent = new Intent(AlbumsActivity.this, SettingsActivity.class);
                startActivity(settingsIntent);
                return true;
            case R.id.help_menu:
                return true;

        }
        return super.onOptionsItemSelected(item);
    }
}