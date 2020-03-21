package com.example.myapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.myapplication.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class LoginActivity extends AppCompatActivity {


    private List<View> viewList = new ArrayList<>();
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private ViewPager tab_ViewPaper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initLoopView();
    }

    private List<FragmentInfo> initFragments() {
        List<FragmentInfo> mFragments = new ArrayList<>(4);
        mFragments.add(new FragmentInfo("推荐", RecommendFragment.class));
        mFragments.add(new FragmentInfo("排行", TopListFragment.class));
        mFragments.add(new FragmentInfo("游戏", GamesFragment.class));
        mFragments.add(new FragmentInfo("分类", CategoryFragment.class));
        return mFragments;
    }

    private void initLoopView() {

        viewPager = findViewById(R.id.ViewPager1);
        tabLayout = findViewById(R.id.tab_layout);
        tab_ViewPaper = findViewById(R.id.login_table_viewpaper);
        for(int i = 0; i< 4; i++) {

            View view = new View(this);
            if (i == 0) view.setBackgroundColor(Color.RED);
            if (i == 1) view.setBackgroundColor(Color.GREEN);
            if (i == 2) view.setBackgroundColor(Color.YELLOW);
            if (i == 3) view.setBackgroundColor(Color.BLACK);

//            view.setBackgroundColor(Color.rgb(i*20/255,i*20/255,i*20/255));
            viewList.add(view);
        }
        viewPager.setAdapter(new MyPagerAdapter(viewList));

        PagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), initFragments());
        tab_ViewPaper.setOffscreenPageLimit(adapter.getCount());
        tab_ViewPaper.setAdapter(adapter);
        tabLayout.setupWithViewPager(tab_ViewPaper);
    }
}
