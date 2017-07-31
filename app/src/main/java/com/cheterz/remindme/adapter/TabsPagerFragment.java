package com.cheterz.remindme.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.cheterz.remindme.fragments.ExampleFragment;

/**
 * Created by cheterz on 25.07.2017.
 */

public class TabsPagerFragment extends FragmentPagerAdapter {

    private String[] tabs;

    public TabsPagerFragment(FragmentManager fm) {
        super(fm);
        tabs = new String[]{"ТАБ1", "Напоминания", "ТАБ2"};
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return ExampleFragment.getInstance();
            case 1:
                return ExampleFragment.getInstance();
            case 2:
                return ExampleFragment.getInstance();
        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}