package com.example.basedatos2.di

import com.example.inventario.consulta.data.ConsultaRepository
import com.example.inventario.consulta.data.ConsultaRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {
    single<ConsultaRepository> { ConsultaRepositoryImpl(get(), get()) }
}