package com.example.myapplication;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RxWeatherService {

    @GET("weather_mini")
    Observable<WeatherEntity> getMessage(@Query("city") String city);
}
