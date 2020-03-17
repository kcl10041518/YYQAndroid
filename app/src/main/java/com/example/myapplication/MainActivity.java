package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.myapplication.Base.BaseInterceptor;
import com.example.myapplication.Base.KclU17BaseModel;
import com.example.myapplication.manager.KclU17DetectListModel;
import com.example.myapplication.manager.KclU17FavRecommendModel;
import com.example.myapplication.manager.KclU17HttpClient;

import java.util.concurrent.TimeUnit;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {

    private final static String TAG = "MainActivity";
//    private static Disposable mDisposable;

//    private AppVersionPresenter appVersionPresenter = new AppVersionPresenter(this);

    private final static HttpLoggingInterceptor HTTP_LOGGING_INTERCEPTOR =
            new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
                @Override
                public void log(String message) {
                    Log.d("Http:", message);
                }
            });



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        KclU17BaseModel baseModel = new KclU17BaseModel<KclU17TestModel>();
        Log.e(TAG, "onCreate");
//        appVersionPresenter.getAppVersion("6.0", "android");
//        appVersionPresenter.onCreate();
//        appVersionPresenter.attachView();

//        doRequestU17RxRetrofit();
//        doRequestByRetrofit();
//        doRequestByRxRetrofit();
        doRequestU17FavRecommendData();

    }

    private void doRequestU17FavRecommendData () {
        KclU17HttpClient.getInstance().create(KclU17Service.class)
                .getFavRecommendData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<KclU17BaseModel<KclU17FavRecommendModel>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(KclU17BaseModel<KclU17FavRecommendModel> value) {

                        KclU17FavRecommendModel listModel = (KclU17FavRecommendModel)value.getData().getReturnData();


                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e(TAG, "Throwable:"+ e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    private void doRequestU17DetectListData () {
        KclU17Service rxU17Service = KclU17HttpClient.getInstance().create(KclU17Service.class);
        rxU17Service.getDetectListData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<KclU17BaseModel<KclU17DetectListModel>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(KclU17BaseModel<KclU17DetectListModel> value) {


                        KclU17DetectListModel listModel = (KclU17DetectListModel)value.getData().getReturnData();

                        Log.i(TAG, listModel.getDefaultSearch());
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e(TAG, "Throwable:"+ e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    private void doRequestU17RxRetrofit() {

        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(5, TimeUnit.SECONDS)
                .addInterceptor(new BaseInterceptor())
                .addInterceptor(HTTP_LOGGING_INTERCEPTOR)
                .build();
        Retrofit retrofit= new Retrofit.Builder()
                .baseUrl("https://app.u17.com/")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())//设置 Json 转换器
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())//RxJava 适配器
                .build();

        KclU17Service rxU17Service = retrofit.create(KclU17Service.class);
        rxU17Service.getDetectListData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<KclU17BaseModel<KclU17DetectListModel>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.i(TAG, "onSubscribe");
                    }

                    @Override
                    public void onNext(KclU17BaseModel<KclU17DetectListModel> value) {
                        Log.i(TAG, value.toString());
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e(TAG, "Throwable:"+ e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }
    // Rxjava+Retrofit
    private void doRequestByRxRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://wthrcdn.etouch.cn/")
                .addConverterFactory(GsonConverterFactory.create())//设置 Json 转换器
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())//RxJava 适配器
                .build();

        RxWeatherService rxWeatherService = retrofit.create(RxWeatherService.class);
        rxWeatherService.getMessage("北京")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<WeatherEntity>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.i(TAG, "onSubscribe");
                    }

                    @Override
                    public void onNext(WeatherEntity value) {
                        Log.e(TAG, "response == " + value.getData().getGanmao());
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e(TAG, "Throwable:"+ e);
                    }

                    @Override
                    public void onComplete() {
                        Log.i(TAG, "onComplete");
                    }
                });

    }
    // Retrofit 网络请求
    //http://wthrcdn.etouch.cn/weather_mini?city=北京
    private void doRequestByRetrofit() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://wthrcdn.etouch.cn/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        WeatherService weatherService = retrofit.create(WeatherService.class);
        Call<WeatherEntity> call = weatherService.getMessage("北京");
        call.enqueue(new Callback<WeatherEntity>() {
            @Override
            public void onResponse(Call<WeatherEntity> call, Response<WeatherEntity> response) {
                WeatherEntity weatherEntity = response.body();
                Log.e(TAG, "response ==="+ weatherEntity.getData().getGanmao());
            }

            @Override
            public void onFailure(Call<WeatherEntity> call, Throwable t) {
                Log.e(TAG, "Throwable:"+t);
            }
        });

    }
}
