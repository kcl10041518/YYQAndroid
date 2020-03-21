package com.example.myapplication.Activity;

public class FragmentInfo {

    private String title;
    private Class fragment;
    public FragmentInfo(String title, Class fragment) {
        this.title = title;
        this.fragment = fragment;
    }

    public Class getFragment() {
        return fragment;
    }

    public String getTitle() {
        return title;
    }

    public void setFragment(Class fragment) {
        this.fragment = fragment;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
