package com.example.inventario.consulta.data

import com.example.inventario.consulta.mObject.Product
import com.example.inventario.utils.MResource

interface ConsultaRepository {
    suspend fun searchProduct(id: String) : MResource<List<Product>>
}