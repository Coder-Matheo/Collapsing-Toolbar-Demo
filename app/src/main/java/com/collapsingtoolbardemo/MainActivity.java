package com.collapsingtoolbardemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    //Initialize Variable
    TabLayout tabLayout;
    ViewPager viewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager);

        MainAdapter mainAdapter = new MainAdapter(getSupportFragmentManager());
        //Add Fragment

        mainAdapter.AddFragment(new HomeFragment(), "Home");
        mainAdapter.AddFragment(new SettingFragment(), "Setting");
        viewPager.setAdapter(mainAdapter);

        //Connect
        tabLayout.setupWithViewPager(viewPager);
    }
}