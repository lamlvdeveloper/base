package com.example.baseapp.ui.activity.main;

import android.os.Bundle;
import android.view.View;

import com.example.baseapp.R;
import com.example.baseapp.base.BaseActivity;
import com.example.baseapp.base.BaseRouter;
import com.example.baseapp.ui.activity.login.LoginActivity;
import com.example.baseapp.ui.activity.login.LoginRouter;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btnGoToLogin(View view) {
        BaseRouter router =  new LoginRouter(this);
        router.switchScreen(LoginActivity.class);
    }
}
