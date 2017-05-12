package com.example.android.musicreviewer;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * {@link UserDashboardCategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Item} objects.
 */
public class UserDashboardCategoryAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link UserDashboardCategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public UserDashboardCategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new UserAlbumsFragment();

        } else if (position == 1) {
            return new UserGenresFragment() ;
        } else if (position == 2) {
            return new UserLabelsFragment();
        } else {
            return new UserReviewsFragment();
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
//            Your Genres
            return mContext.getString(R.string.category_suggestions);
        } else if (position == 1) {
//            Your Labels
            return mContext.getString(R.string.category_genres);
        } else if (position == 2) {
//            Your Albums
            return mContext.getString(R.string.category_labels);
        } else {
//            YourReviews
            return mContext.getString(R.string.category_request);
        }
    }
}