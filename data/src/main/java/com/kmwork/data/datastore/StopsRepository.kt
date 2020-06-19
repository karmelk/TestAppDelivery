package com.kmwork.data.datastore

import com.kmwork.entities.StopsModelDB

interface StopsRepository {
    suspend fun getStopsListDB():MutableList<StopsModelDB>?
}