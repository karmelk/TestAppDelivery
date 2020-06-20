package com.kmwork.entities.localmodel

data class MarkerMapModel(
    private val _id: Long,
    private val _addressName: String,
    private val _addressLat: Double,
    private val _addressLon: Double,
    private val _isDatePenalty: Boolean,
    private val _isFinishedStops: Boolean
) {
    val id: Long
        get() = _id
    val addressName: String
        get() = _addressName
    val addressLat: Double
        get() = _addressLat
    val addressLon: Double
        get() = _addressLon
    val isDatePenalty: Boolean
        get() = _isDatePenalty
    val isFinishedStops: Boolean
        get() = _isFinishedStops
}