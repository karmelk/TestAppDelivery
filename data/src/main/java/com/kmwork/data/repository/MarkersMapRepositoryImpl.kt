package com.kmwork.data.repository

import com.kmwork.data.datastore.MarkerMapRepository
import com.kmwork.data.sqlservice.StopsDao
import com.kmwork.entities.responcemodel.StopsModelDB

class MarkersMapRepositoryImpl(private val stopDao:StopsDao): MarkerMapRepository {
    override suspend fun getStopList(): MutableList<StopsModelDB>?= stopDao.getStopsList()
}