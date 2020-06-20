package com.kmwork.testappdelivery

import com.kmwork.testappdelivery.fragment.marksmap.viewmodel.MarkerMapViewModel
import com.kmwork.testappdelivery.fragment.stops.viewmodel.StopsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule= module {
    viewModel{StopsViewModel(get())}
    viewModel{ MarkerMapViewModel(get()) }
}