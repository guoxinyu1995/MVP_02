package com.example.mve_week2_01.adaper;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.mve_week2_01.fragment.CardFragment;
import com.example.mve_week2_01.fragment.DataFragment;

public class LoginAdaper extends FragmentPagerAdapter {
    String[] page = new String[]{
            "我的数据","我的名片"
    };
    public LoginAdaper(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                return new DataFragment();
            case 1:
                return new CardFragment();
                default:
                    return new Fragment();
        }
    }

    @Override
    public int getCount() {
        return page.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return page[position];
    }
}
