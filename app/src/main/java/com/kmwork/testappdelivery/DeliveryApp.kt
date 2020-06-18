package com.kmwork.testappdelivery

import android.app.Application
import com.kmwork.data.databaseModule
import com.kmwork.data.repositoryModule
import com.kmwork.domain.interactorModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class DeliveryApp:Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@DeliveryApp)
            modules(modules)
        }
    }
    val modules= listOf(
        databaseModule,
        viewModelModule,
        repositoryModule,
        interactorModule
    )
}