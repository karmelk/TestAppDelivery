package com.kmwork.data.sqlservice

import androidx.room.Database
import androidx.room.RoomDatabase
import com.kmwork.entities.StopsModelDB

@Database(
    entities = [StopsModelDB::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase: RoomDatabase() {
    abstract fun stopDao():StopsDao
}