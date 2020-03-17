package com.example.myapplication.manager;

import android.util.Log;

import com.example.myapplication.Base.BaseInterceptor;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/*
*
*
* */
public class KclU17HttpClient {

    public static String Basurl = "https://app.u17.com/";
    public static String userToken = "";

    private static final int DEFAULT_TIME_OUT = 15;
    private static OkHttpClient okHttpClient;
    private Retrofit mRetrofit;
    private static KclU17HttpClient kclU17HttpClient;
    private static HttpLoggingInterceptor loggingInterceptor;

    static {
        Basurl = "https://app.u17.com/";
        initOKHttpClient();
    }
    private KclU17HttpClient() {
        mRetrofit = new Retrofit.Builder()
                .baseUrl(Basurl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .build();
    }

    public static synchronized KclU17HttpClient getInstance() {

        if (kclU17HttpClient == null) {
            synchronized (KclU17HttpClient.class) {
                if (kclU17HttpClient == null) {
                    kclU17HttpClient = new KclU17HttpClient();
                }
            }
        }
        return kclU17HttpClient;
    }


    private static OkHttpClient initOKHttpClient() {

        loggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                //打印retrofit日志
                Log.i("RetrofitLog", "retrofitBack = " + message);
            }
        });
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        if (okHttpClient == null) {
            synchronized (OkHttpClient.class) {
                if (okHttpClient == null) {
                    okHttpClient = new OkHttpClient.Builder()
//                            .sslSocketFactory(S)
                            .addNetworkInterceptor(loggingInterceptor)
                            .addInterceptor(new BaseInterceptor())
                            .connectTimeout(DEFAULT_TIME_OUT, TimeUnit.SECONDS)
                            .readTimeout(DEFAULT_TIME_OUT, TimeUnit.SECONDS)
                            .writeTimeout(DEFAULT_TIME_OUT, TimeUnit.SECONDS)
                            .build();
                }
            }
        }
        return okHttpClient;
    }

    public <T> T create(Class<T> reqServer) {
        return mRetrofit.create(reqServer);
    }

}
