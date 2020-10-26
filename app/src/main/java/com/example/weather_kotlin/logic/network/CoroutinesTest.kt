package com.example.weather_kotlin.logic.network

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 *   author:dylan
 *   time:2020/10/26
 *   desc:协程
 */
fun main(){
    runBlocking {

     launch {
            println("launch 1")
         delay(1000)
            println("launch 1 finish")
        }
     launch {
         println("launch 2")
         delay(1000)
         println("launch 2 finish")
        }

    }


}