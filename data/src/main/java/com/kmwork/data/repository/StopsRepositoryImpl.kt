package com.kmwork.data.repository

import com.kmwork.data.datastore.StopsRepository
import com.kmwork.data.sqlservice.StopsDao
import com.kmwork.entities.responcemodel.StopsModelDB

class StopsRepositoryImpl(private val stopDao: StopsDao) : StopsRepository {
    override suspend fun getStopsListDB(): MutableList<StopsModelDB>? =
        stopDao.getStopsList()

    override suspend fun getSingleStopDB(stopId: Long): StopsModelDB? =
        stopDao.getSingleStopsItem(stopId)

    override suspend fun setDefaultData(stopsList: MutableList<StopsModelDB>): MutableList<StopsModelDB>? {
        stopDao.addRandomList(stopsList)
        return stopDao.getStopsList()
    }

    override suspend fun updateStopItem(stopItem: StopsModelDB) {
        stopDao.updateItem(stopItem)
    }

}