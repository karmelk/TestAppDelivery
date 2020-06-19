package com.kmwork.data.sqlservice

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.kmwork.entities.responcemodel.StopsModelDB

@Dao
interface StopsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addRandomList(item: List<StopsModelDB>)

    @Query("SELECT * FROM stopsTable")
    fun getStopsList(): MutableList<StopsModelDB>?
}