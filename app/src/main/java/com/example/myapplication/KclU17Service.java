package com.example.myapplication;
//1\
//https://app.u17.com/v3/appV3_3/ios/phone/comic/getDetectListV4_5?
// device_id=6C498A37-69B1-41C6-9E88-A83BA4D76457&model=iPhone%20XR&
// systemVersion=12.4.1&target=U17_3.0&time=1584412459&version=5.0.0
//2\
//https://app.u17.com/v3/appV3_3/ios/phone/comic/favRecommend?
// device_id=6C498A37-69B1-41C6-9E88-A83BA4D76457&model=iPhone%20XR&
// systemVersion=12.4.1&target=U17_3.0&time=1584413121&version=5.0.0
import com.example.myapplication.Base.KclU17BaseModel;
import com.example.myapplication.manager.KclU17DetectListModel;
import com.example.myapplication.manager.KclU17FavRecommendModel;


import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;


public interface KclU17Service {

    @Headers("Accept: application/json")
    @GET("v3/appV3_3/ios/phone/comic/getDetectListV4_5")
    Observable<KclU17BaseModel<KclU17DetectListModel>> getDetectListData();

    @Headers("Accept: application/json")
    @GET("v3/appV3_3/ios/phone/comic/favRecommend")
    Observable<KclU17BaseModel<KclU17FavRecommendModel>> getFavRecommendData();
}
