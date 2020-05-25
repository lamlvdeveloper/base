package com.example.baseapp.model.response;

import com.example.baseapp.model.entity.Account;

public class AccountResponse {
    private Account data;

    public Account getData() {
        return data;
    }

    public void setData(Account data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "AccountResponse{" +
                "data=" + data +
                '}';
    }
}
