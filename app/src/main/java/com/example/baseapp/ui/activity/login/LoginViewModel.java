package com.example.baseapp.ui.activity.login;

import com.example.baseapp.base.BaseApplication;
import com.example.baseapp.base.BaseViewModel;
import com.example.baseapp.model.response.AccountResponse;
import com.example.baseapp.service.ApiService;
import com.example.baseapp.service.Param;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import okhttp3.RequestBody;

public class LoginViewModel extends BaseViewModel {
    private CompositeDisposable compositeDisposable = new CompositeDisposable();


    public void postLogin(String username, String password) {
        RequestBody jsonBodyObject = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"), Param.getParams(Param.login(username, password)).toString());
        BaseApplication application = BaseApplication.getInstance();
        ApiService apiService = application.getApiService();
        Disposable disposable = apiService.postLogin(jsonBodyObject)
                .subscribeOn(application.subscribeScheduler())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        this::requestSuccess,
                        this::requestFailed
                );

        compositeDisposable.add(disposable);
    }

    public void postLogin2(String username, String password) {
        RequestBody jsonBodyObject = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"), Param.getParams(Param.login(username, password)).toString());
        BaseApplication application = BaseApplication.getInstance();
        ApiService apiService = application.getApiService();

        apiService.postLogin(jsonBodyObject)
                .subscribeOn(application.subscribeScheduler())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        new Observer<AccountResponse>() {
                            @Override
                            public void onSubscribe(Disposable d) {
                            }

                            @Override
                            public void onNext(AccountResponse accountResponse) {
                            }

                            @Override
                            public void onError(Throwable e) {

                            }

                            @Override
                            public void onComplete() {

                            }
                        }
                );

    }
}
