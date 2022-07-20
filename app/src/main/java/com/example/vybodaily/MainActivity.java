package com.example.vybodaily;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
TabLayout tabLayout;
TabItem mHome, mSports, mScience, mHealth,mEntertainment, mTech;
PagerAdapter pagerAdapter;
Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mToolbar=findViewById(R.id.toolbar);
//        setSupportActionBar(mToolbar);

        mHome=findViewById(R.id.home);
        mSports=findViewById(R.id.sports);
        mHealth=findViewById(R.id.health);
        mScience=findViewById(R.id.science);
        mEntertainment=findViewById(R.id.entertainment);
        mTech=findViewById(R.id.technology);

        ViewPager viewPager=findViewById(R.id.fragmentContainer);
        tabLayout=findViewById(R.id.tabLayout);

        pagerAdapter= new PagerAdapter(getSupportFragmentManager(), 6);
        viewPager.setAdapter(pagerAdapter);
    }
}