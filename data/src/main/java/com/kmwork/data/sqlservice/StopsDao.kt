package com.kmwork.data.sqlservice

import androidx.room.*
import com.kmwork.entities.responcemodel.StopsModelDB

@Dao
interface StopsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addRandomList(item: List<StopsModelDB>)

    @Query("SELECT * FROM stopsTable")
    fun getStopsList(): MutableList<StopsModelDB>?

    @Query("SELECT * FROM stopsTable where id=:stopId")
    fun getSingleStopsItem(stopId:Long): StopsModelDB?

    @Update
    fun updateItem(updateItem:StopsModelDB)
}