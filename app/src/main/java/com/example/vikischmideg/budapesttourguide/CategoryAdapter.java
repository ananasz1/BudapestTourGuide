package com.example.vikischmideg.budapesttourguide;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


class CategoryAdapter extends FragmentPagerAdapter {

    private final Context mContext;

    CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if (position == 0) {
            return new SightFragment();
        } else if (position == 1) {
            return new ViewsFragment();
        } else if (position == 2) {
            return new RestaurantFragment();
        } else {
            return new WithKidsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.sight_tab);
            case 1:
                return mContext.getString(R.string.lookout_tab);
            case 2:
                return mContext.getString(R.string.restaurant_tab);
            case 3:
                return mContext.getString(R.string.kids_tab);
        }
        return null;
    }
}
