package com.example.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {

    @GET("weather_mini")
    Call<WeatherEntity> getMessage(@Query("city") String city);
}
