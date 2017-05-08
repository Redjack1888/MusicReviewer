package com.example.android.musicreviewer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of phrases.
 */
public class GenresFragment extends Fragment {

    public GenresFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        // Create a list of words
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.string.sub_genres_title, R.string.genre_title));
        items.add(new Item(R.string.sub_genres_title, R.string.genre_title));
        items.add(new Item(R.string.sub_genres_title, R.string.genre_title));
        items.add(new Item(R.string.sub_genres_title, R.string.genre_title));
        items.add(new Item(R.string.sub_genres_title, R.string.genre_title));
        items.add(new Item(R.string.sub_genres_title, R.string.genre_title));
        items.add(new Item(R.string.sub_genres_title, R.string.genre_title));
        items.add(new Item(R.string.sub_genres_title, R.string.genre_title));
        items.add(new Item(R.string.sub_genres_title, R.string.genre_title));
        items.add(new Item(R.string.sub_genres_title, R.string.genre_title));

        // Create an {@link ItemAdapter}, whose data source is a list of {@link Item}s. The
        // adapter knows how to create list items for each item in the list.
        ItemAdapter adapter = new ItemAdapter(getActivity(), items, R.color.category_phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // item_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ItemAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        // Set a click listener when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Get the {@link Word} object at the given position the user clicked on
                Item item = items.get(position);


            }
        });

        return rootView;
    }


}