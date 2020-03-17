package com.example.myapplication.manager;

import android.content.Context;
import android.provider.ContactsContract;

import com.example.myapplication.retrofit.RetrofitHelper;
import com.example.myapplication.retrofit.RetrofitService;

import java.util.concurrent.CopyOnWriteArrayList;

import io.reactivex.Observable;

public class DataManager {

    private RetrofitService retrofitService;
    public DataManager(Context context) {
        this.retrofitService = RetrofitHelper.getInstance(context).getServer();
    }

    public Observable<AppVersionModel> getAppVersion(String currentVersion, String type) {
        return retrofitService.getAppVersion(currentVersion, type);
    }

}
