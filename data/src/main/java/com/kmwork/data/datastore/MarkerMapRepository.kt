package com.kmwork.data.datastore

import com.kmwork.entities.responcemodel.StopsModelDB

interface MarkerMapRepository {
    suspend fun getStopList():MutableList<StopsModelDB>?
}