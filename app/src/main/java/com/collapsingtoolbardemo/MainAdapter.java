package com.collapsingtoolbardemo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment> lstFragment = new ArrayList<>();
    ArrayList<String> lstTitle = new ArrayList<>();

    public MainAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        return lstFragment.get(position);
    }

    @Override
    public int getCount() {
        return lstFragment.size();
    }

    public void AddFragment(Fragment fragment, String s){
        lstFragment.add(fragment);
        lstTitle.add(s);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return lstTitle.get(position);
    }
}
