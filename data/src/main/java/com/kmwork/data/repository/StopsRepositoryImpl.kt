package com.kmwork.data.repository

import com.kmwork.data.datastore.StopsRepository
import com.kmwork.data.sqlservice.StopsDao
import com.kmwork.entities.StopsModelDB

class StopsRepositoryImpl(private  val stopDao:StopsDao) : StopsRepository {
    override suspend fun getStopsListDB(): MutableList<StopsModelDB>? =stopDao.getStopsList()
}