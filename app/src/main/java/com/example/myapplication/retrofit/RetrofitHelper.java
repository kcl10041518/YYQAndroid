package com.example.myapplication.retrofit;

import android.content.Context;

import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitHelper {

    private Context context;
    private static RetrofitHelper instance = null;
    private Retrofit retrofit = null;

    private RetrofitHelper(Context context) {
        this.context = context;

    }

    public static RetrofitHelper getInstance(Context context) {
        if (instance == null) instance = new RetrofitHelper(context);
        return instance;
    }

    private void initRetrofit() {

        retrofit = new Retrofit.Builder()
                .baseUrl("")
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().create()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    public RetrofitService getServer() {
        return retrofit.create(RetrofitService.class);
    }
}
