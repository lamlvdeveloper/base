package com.example.baseapp.base;


import java.util.Observable;

import io.reactivex.disposables.CompositeDisposable;

public class BaseViewModel extends Observable {
    public CompositeDisposable compositeDisposable= new CompositeDisposable();

//    public BaseViewModel() {
//    }

    public void requestSuccess(Object object) {
        setChanged();
        notifyObservers(object);
    }

    public void requestFailed(Throwable throwable) {

    }
}
