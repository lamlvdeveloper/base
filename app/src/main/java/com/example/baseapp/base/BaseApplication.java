package com.example.baseapp.base;

import android.app.Application;

import com.example.baseapp.service.ApiClient;
import com.example.baseapp.service.ApiService;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

public class BaseApplication extends Application {
    private static BaseApplication ourInstance;
    private Scheduler scheduler;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static BaseApplication getInstance() {
        if (ourInstance == null) {
            ourInstance = new BaseApplication();
        }
        return ourInstance;
    }

    public ApiService getApiService() {
        ApiService apiService = ApiClient.createService(ApiService.class);
        return apiService;
    }

    public Scheduler subscribeScheduler() {
        if (scheduler == null) {
            scheduler = Schedulers.io();
        }

        return scheduler;
    }
}
