package com.example.android.musicreviewer;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * {@link GenreCategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Item} objects.
 */
public class GenreCategoryAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link GenreCategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public GenreCategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new GenreAlbumsFragment1();

        } else if (position == 1) {
            return new GenreAlbumsFragment2() ;
        } else if (position == 2) {
            return new GenreAlbumsFragment3();
        } else {
            return new GenreAlbumsFragment4();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
//            Available for Request
            return mContext.getString(R.string.genre_available);
        } else if (position == 1) {
//            Read Now
            return mContext.getString(R.string.genre_listen);
        } else if (position == 2) {
//            Most Requested
            return mContext.getString(R.string.genre_most_request);
        } else {
//            Previously on MusicReviewer
            return mContext.getString(R.string.genre_previously);
        }
    }
}