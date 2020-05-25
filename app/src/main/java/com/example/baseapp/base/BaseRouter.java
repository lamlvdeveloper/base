package com.example.baseapp.base;

import android.content.Context;
import android.content.Intent;

public class BaseRouter {
    private Context context;

    public BaseRouter(Context context) {
        this.context = context;
    }

    public void switchScreen(Class aClass) {
        context.startActivity(new Intent(context, aClass));
    }

}
