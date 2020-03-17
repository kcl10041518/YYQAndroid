package com.example.myapplication.Presenter;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.example.myapplication.manager.AppVersionModel;
import com.example.myapplication.manager.DataManager;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class AppVersionPresenter implements Presenter {

    private AppVersionModel appVersionModel;
    private Context context;
    private DataManager manager;
    private CompositeDisposable compositeDisposable;

    public AppVersionPresenter(Context context) {
        this.context = context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public void onCreate() {
        manager = new DataManager(context);
        compositeDisposable = new CompositeDisposable();
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onDestory() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
            compositeDisposable.clear();
            compositeDisposable = null;
        }
    }

    @Override
    public void pause() {

    }

    @Override
    public void attachView(View view) {

    }

    @Override
    public void attachIncomingIntent(Intent intent) {

    }

    public void getAppVersion(String currentVersion, String type) {

        Observable<AppVersionModel> observable = manager.getAppVersion(currentVersion, type);
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<AppVersionModel>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        compositeDisposable.add(d);
                    }

                    @Override
                    public void onNext(AppVersionModel value) {
                        appVersionModel = value;
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();

                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }
}
