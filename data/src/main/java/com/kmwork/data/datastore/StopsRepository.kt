package com.kmwork.data.datastore

import com.kmwork.entities.responcemodel.StopsModelDB

interface StopsRepository {
    suspend fun getStopsListDB():MutableList<StopsModelDB>?
    suspend fun setDefaultData(stopsList:MutableList<StopsModelDB>)
}