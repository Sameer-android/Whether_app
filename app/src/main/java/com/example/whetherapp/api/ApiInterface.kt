package com.example.whetherapp.api

import com.example.whetherapp.apiData.WhetherApp
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
@GET("weather")
    fun getWhetherData(
        @Query("q") city:String,
        @Query("appid") appid:String,
        @Query("units") units:String,
    ):Call<WhetherApp>
}