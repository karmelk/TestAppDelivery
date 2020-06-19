package com.kmwork.data.repository

import com.kmwork.data.datastore.StopsRepository
import com.kmwork.data.sqlservice.StopsDao
import com.kmwork.entities.responcemodel.StopsModelDB

class StopsRepositoryImpl(private  val stopDao:StopsDao) : StopsRepository {
    override suspend fun getStopsListDB(): MutableList<StopsModelDB>? =
        stopDao.getStopsList()
    override suspend fun setDefaultData(stopsList: MutableList<StopsModelDB>) =
        stopDao.addRandomList(stopsList)

}