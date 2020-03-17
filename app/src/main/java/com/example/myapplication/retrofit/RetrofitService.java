package com.example.myapplication.retrofit;

import com.example.myapplication.manager.AppVersionModel;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RetrofitService {

    @FormUrlEncoded
    @POST("appversion-getAppVersion")
    Observable<AppVersionModel> getAppVersion(@Field("currentVersion") String currentVersion,
                                              @Field("type") String type);
}
