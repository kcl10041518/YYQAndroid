package com.example.myapplication.Presenter;

import android.content.Intent;
import android.view.View;

public interface Presenter {

    void onCreate();
    void onStart();
    void onDestory();
    void pause();
    void attachView(View view);
    void attachIncomingIntent(Intent intent);
}
