package com.example.inventario.consulta.mObject


import com.google.gson.annotations.SerializedName

data class ConsultaProductMainResponse(
    @SerializedName("success")
    val success: Boolean?,
    @SerializedName("message")
    val message: String?,
    @SerializedName("data")
    val data: List<Product>?
)