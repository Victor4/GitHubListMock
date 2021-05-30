package com.vb.home.modules

import com.vb.home.ui.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val homeViewModelModule = module {

    viewModel { HomeViewModel(get()) }

}