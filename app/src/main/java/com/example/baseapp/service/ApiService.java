package com.example.baseapp.service;


import com.example.baseapp.model.response.AccountResponse;
import com.example.baseapp.model.response.MenuResponse;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {

    @POST(WSConfig.Api.LOGIN)
    Observable<AccountResponse> postLogin(@Body RequestBody body);

    @GET(WSConfig.Api.SETTING)
    Observable<MenuResponse> getSetting();

}
