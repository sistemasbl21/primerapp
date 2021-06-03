package com.example.inventario.network

import com.example.inventario.consulta.mObject.ConsultaProductMainResponse
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiClient {


    @FormUrlEncoded
    @POST("consultap.php")
    suspend fun getProduct(
        @Field("id") id : String
    ) : Response<ConsultaProductMainResponse>


}