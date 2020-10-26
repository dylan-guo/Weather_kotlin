package com.example.weather_kotlin.logic.model

import com.google.gson.annotations.SerializedName

/**
 *   author:dylan
 *   time:2020/10/23
 *   desc:实体类
 */
data class PlaceRespoonse(val status:String,val places:List<Place>)

data class Place(val name:String,val location:Location,@SerializedName("formtted_address") val address:String)

data class Location(val lng:String,val lat:String)