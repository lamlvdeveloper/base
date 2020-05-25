package com.example.baseapp.model.response;

import com.example.baseapp.base.BaseResponse;
import com.example.baseapp.model.entity.Menu;

public class MenuResponse extends BaseResponse {
    private Menu data;

    public Menu getData() {
        return data;
    }

    public void setData(Menu data) {
        this.data = data;
    }
}
