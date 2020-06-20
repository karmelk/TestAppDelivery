package com.kmwork.entities.responcemodel

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "stopsTable")
data class StopsModelDB(

    @ColumnInfo(name = "randomName")
    private val _randomName: String,
    @ColumnInfo(name = "finishAddress")
    private val _finishAddress: String,
    @ColumnInfo(name="addressLat")
    private val _addressLat:Double,
    @ColumnInfo(name="addressLon")
    private val _addressLon:Double,
    @ColumnInfo(name = "expectantDate")
    private val _expectantDate: String,
    @ColumnInfo(name = "finishedDate")
    private val _finishedDate: String,
    @ColumnInfo(name = "isDatePenalty")
    private var _isDatePenalty: Boolean,
    @ColumnInfo(name = "isFinishedStops")
    private var _isFinishedStops: Boolean,
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private val _id: Long = 0
) {
    val id: Long
        get() = _id
    val randomName: String
        get() = _randomName
    val finishAddress: String
        get() = _finishAddress
    val addressLat: Double
        get() = _addressLat
    val addressLon: Double
        get() = _addressLon
    val expectantDate: String
        get() = _expectantDate
    val finishedDate: String
        get() = _finishedDate
    var isDatePenalty: Boolean
        get() = _isDatePenalty
        set(value) {
            _isDatePenalty = value
        }
    var isFinishedStops: Boolean
        get() = _isFinishedStops
        set(value) {
            _isFinishedStops = value
        }
}