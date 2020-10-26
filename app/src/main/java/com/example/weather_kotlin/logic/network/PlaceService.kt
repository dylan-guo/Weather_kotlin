package com.example.weather_kotlin.logic.network

import com.example.weather_kotlin.WeatherApplication
import com.example.weather_kotlin.logic.model.PlaceRespoonse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 *   author:dylan
 *   time:2020/10/23
 *   desc:
 */
interface PlaceService {
    @GET("v2/place?token=${WeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceRespoonse>
}