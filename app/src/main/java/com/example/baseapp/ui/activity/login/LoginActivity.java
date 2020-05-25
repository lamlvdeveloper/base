package com.example.baseapp.ui.activity.login;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.example.baseapp.R;
import com.example.baseapp.base.BaseActivity;
import com.example.baseapp.databinding.ActivityLoginBinding;
import com.example.baseapp.model.response.AccountResponse;
import com.jakewharton.rxbinding2.widget.RxTextView;

import java.util.Observable;
import java.util.Observer;

import io.reactivex.observers.DisposableObserver;

public class LoginActivity extends BaseActivity implements Observer {

    private ActivityLoginBinding binding;
    private LoginViewModel loginViewModel;

    io.reactivex.Observable<Boolean> observable;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        loginViewModel = new LoginViewModel();
        loginViewModel.addObserver(this);

        io.reactivex.Observable<String> nameObservable = RxTextView.textChanges(binding.edtUsername).skip(1).map(CharSequence::toString);
        io.reactivex.Observable<String> passwordObservable = RxTextView.textChanges(binding.edtPassword).skip(1).map(CharSequence::toString);

        observable = io.reactivex.Observable.combineLatest(nameObservable, passwordObservable, this::isValidForm);

        observable.subscribe(new DisposableObserver<Boolean>() {
            @Override
            public void onNext(Boolean aBoolean) {
                updateButton(aBoolean);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });

    }

    public void btnLogin(View view) {
        String username = binding.edtUsername.getText().toString();
        String password = binding.edtPassword.getText().toString();

        loginViewModel.postLogin(username, password);
    }


    public void updateButton(boolean valid) {
        if (valid){
            binding.btnLogin.setEnabled(true);
            binding.btnLogin.setBackgroundColor(getResources().getColor(R.color.blue));
        } else {
            binding.btnLogin.setEnabled(false);
            binding.btnLogin.setBackgroundColor(getResources().getColor(R.color.gray));
        }
    }



    public boolean isValidForm(String name, String password) {
        boolean validName = !name.isEmpty() && name.length() >= 6;

        if (!validName) {
            binding.edtUsername.setError("Please enter valid name");
        }

        boolean validPass = !password.isEmpty() && password.length() >= 6;
        if (!validPass) {
            binding.edtPassword.setError("Incorrect password");
        }
        return validName && validPass;
    }


    @Override
    public void update(Observable observable, Object o) {
        if (null != observable && null != o) {
            if (o instanceof AccountResponse) {
//                AccountResponse accountResponse = (AccountResponse) o;
//                switchActivity(LoginActivity.this, SettingActivity.class);
            }
        }
    }

}
