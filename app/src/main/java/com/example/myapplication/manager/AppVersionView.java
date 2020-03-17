package com.example.myapplication.manager;

public interface AppVersionView {
    void onSuccess(AppVersionModel appVersionModel);
    void onError(String error);
}
