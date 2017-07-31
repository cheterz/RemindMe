package com.cheterz.remindme.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.cheterz.remindme.R;
import com.cheterz.remindme.fragments.AbstractTabFragment;
import com.cheterz.remindme.fragments.BirthdaysFragment;
import com.cheterz.remindme.fragments.HistoryFragment;
import com.cheterz.remindme.fragments.IdeasFragment;
import com.cheterz.remindme.fragments.TodoFragment;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cheterz on 25.07.2017.
 */

public class TabsFragmentAdaper extends FragmentPagerAdapter {

    private Map<Integer,AbstractTabFragment> tabs;
    private Context context;

    public TabsFragmentAdaper(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        initTabsMap(context);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabsMap(Context context) {
        tabs = new HashMap<>();
        tabs.put(0, HistoryFragment.getInstance(context));
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, TodoFragment.getInstance(context));
        tabs.put(3, BirthdaysFragment.getInstance(context));
    }
}
