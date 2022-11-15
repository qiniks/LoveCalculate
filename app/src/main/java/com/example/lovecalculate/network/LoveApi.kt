package com.example.lovecalculate.network

import com.example.lovecalculate.network.model.LoveModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

import retrofit2.http.Query

interface LoveApi {
    @GET( "getPercentage")
    fun getPercentage(
        @Query("fname") firstName: String,
        @Query("sname") secondName: String,
        @Header("X-RapidAPI-Key") key:String="aff48319bamsh6715b2f71df932ep1e1452jsnbabe6e26ec12",
        @Header("X-RapidAPI-Host" ) host:String="love-calculator.p.rapidapi.com"
    ): Call<LoveModel>
}