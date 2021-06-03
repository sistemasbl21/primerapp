package com.example.inventario.consulta.data

import com.example.inventario.consulta.mObject.Product
import com.example.inventario.network.ApiClient
import com.example.inventario.utils.ConnectionUtils
import com.example.inventario.utils.MResource

class ConsultaRepositoryImpl(
    private val apiClient: ApiClient, private val connection: ConnectionUtils
) : ConsultaRepository {
    override suspend fun searchProduct(id: String): MResource<List<Product>> {
        try {
            if (connection.isNetworkAvailable()){
                val response = apiClient.getProduct(id)
                response?.let {
                    return if (it.isSuccessful && it.body()!=null){
                        var data : List<Product> = mutableListOf()
                        it.body()?.let {
                            it.data?.let {
                                data = it
                            }
                        }
                        MResource.Success(data)
                    }else{
                        val message = it.message().toString()
                        MResource.Failure(Exception("Sin datos"))
                    }
                }
            }else{
                return MResource.Failure(Exception("Sin conexion a internet"))
            }
        }catch (e: Exception){
            return MResource.Failure(e)
        }
    }
}