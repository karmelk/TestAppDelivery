package com.kmwork.data

import android.app.Application
import androidx.room.Room
import com.kmwork.data.datastore.MarkerMapRepository
import com.kmwork.data.datastore.StopsRepository
import com.kmwork.data.repository.MarkersMapRepositoryImpl
import com.kmwork.data.repository.StopsRepositoryImpl
import com.kmwork.data.sqlservice.AppDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val databaseModule = module {
    fun provideDatabase(application: Application): AppDatabase {
        return Room.databaseBuilder(application, AppDatabase::class.java, "deliveryDB")
            .allowMainThreadQueries()
            .build()
    }
    single { provideDatabase(androidApplication()) }
    single { get<AppDatabase>().stopDao() }
}

val repositoryModule = module {
    single<StopsRepository>{ StopsRepositoryImpl(get()) }
    single<MarkerMapRepository>{ MarkersMapRepositoryImpl(get()) }
}