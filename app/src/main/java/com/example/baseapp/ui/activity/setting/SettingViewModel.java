package com.example.baseapp.ui.activity.setting;

import com.example.baseapp.base.BaseApplication;
import com.example.baseapp.base.BaseViewModel;
import com.example.baseapp.service.ApiService;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

public class SettingViewModel extends BaseViewModel {



    public void getListMenu() {
        BaseApplication application = BaseApplication.getInstance();
        ApiService apiService = application.getApiService();

        Disposable disposable = apiService.getSetting()
                .subscribeOn(application.subscribeScheduler())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        this::requestSuccess,
                        this::requestFailed
                );

        compositeDisposable.add(disposable);
    }
}
