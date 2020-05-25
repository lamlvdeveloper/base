package com.example.baseapp.ui.activity.setting;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.example.baseapp.R;
import com.example.baseapp.adapter.SettingAdapter;
import com.example.baseapp.base.BaseActivity;
import com.example.baseapp.databinding.ActivitySettingBinding;
import com.example.baseapp.model.entity.Menu;
import com.example.baseapp.model.response.MenuResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class SettingActivity extends BaseActivity implements Observer {

    private List<Menu.MenuLeft.ItemMenu> menuList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.example.baseapp.databinding.ActivitySettingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_setting);

        SettingViewModel settingViewModel = new SettingViewModel();
        settingViewModel.addObserver(this);
        SettingAdapter settingAdapter = new SettingAdapter(menuList, this);


        binding.recyclerSetting.setAdapter(settingAdapter);

        settingViewModel.getListMenu();
    }

    @Override
    public void update(Observable observable, Object o) {
        if (null != observable && null != o){
            if (o instanceof MenuResponse){
                MenuResponse menuResponse = (MenuResponse) o;
            }
        }
    }
}
