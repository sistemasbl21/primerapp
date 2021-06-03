package com.example.basedatos2.di

import com.example.inventario.consulta.viewmodel.SearchProductViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        SearchProductViewModel(get())
    }
}