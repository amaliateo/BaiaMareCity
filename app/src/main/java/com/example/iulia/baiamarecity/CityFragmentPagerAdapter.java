package com.example.iulia.baiamarecity;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CityFragmentPagerAdapter extends FragmentPagerAdapter {
    private Context context;

    private String tabTitles[] = new String[]{"City Attractions", "Day Trips", "Restaurants", "Hotels"};

    public CityFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CityAttractions();
        } else if (position == 1) {
            return new DayTrips();
        } else if (position == 2) {
            return new Restaurants();
        } else return new Hotels();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
