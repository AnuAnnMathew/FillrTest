package com.learnkotlin.fillrtest.model

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("/photos/12037949754@N01/")
    fun getData(): Call<List<Photos>>
}