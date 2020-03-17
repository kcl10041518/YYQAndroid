package com.example.myapplication.Base;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class BaseInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {

        Request original = chain.request();
        HttpUrl url = original.url().newBuilder()
                .addQueryParameter("device_id", "6C498A37-69B1-41C6-9E88-A83BA4D76457")
                .addQueryParameter("model", "iPhone%20XR")
                .addQueryParameter("systemVersion", "12.4.1")
                .addQueryParameter("target", "U17_3.0")
                .addQueryParameter("time", "1584412459")
                .addQueryParameter("version", "5.0.0")
                .build();
        Request request = original.newBuilder()
                .addHeader("User-Agent", "U17_3.0/5.0.0 (iPhone; iOS 12.4.1; Scale/2.00)")
                .addHeader("Connection", "keep-alive")
                .method(original.method(), original.body())
                .url(url)
                .build();

        return chain.proceed(request);
    }
}
