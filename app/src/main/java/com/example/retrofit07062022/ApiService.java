package com.example.retrofit07062022;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by pphat on 8/23/2022.
 */
public interface ApiService {

    // End point
    @GET("KhoaPhamTraining/json/tien/demo1.json")
    Call<Demo1> callDemo1();
}
