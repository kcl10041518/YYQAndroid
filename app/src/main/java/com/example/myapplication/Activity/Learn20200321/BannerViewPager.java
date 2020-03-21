package com.example.myapplication.Activity.Learn20200321;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class BannerViewPager extends ViewPager {

    private Context mContext;
    private BannerAdapter mAdapter;

    public BannerViewPager(@NonNull Context context) {
        this(context, null);
    }

    public BannerViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
    }

    public void setmAdapter(BannerAdapter mAdapter) {
        this.mAdapter = mAdapter;
    }

    private class BannerPagerAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            //返回一个很大的值，确保可以无限轮播
            return Integer.MAX_VALUE;
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            // 这么写就对了，看了源码应该就明白
            return view == object;
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            View bannerView = mAdapter.getView(position);
            container.addView(bannerView);
            return bannerView;
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            // 销毁回调的方法  移除页面即可
            container.removeView((View)object);
        }
    }
}
