package com.example.weather_kotlin

import android.app.Application
import android.content.Context

/**
 *   author:dylan
 *   time:2020/07/24
 *   desc:Application
 */
class WeatherApplication : Application() {

    companion object{
       //令牌
        const val TOKEN="ZqHdl12Rt1Tll4XT"
        //全局context
        lateinit var context: Context;
    }

    override fun onCreate() {
        super.onCreate()
        context=applicationContext;
    }
}