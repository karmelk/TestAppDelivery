package com.kmwork.entities.localmodel


data class StopsModel(
    private val _randomName: String,
    private val _finishAddress: String,
    private val _addressLat: String,
    private val _addressLon: String,
    private val _expectantDate: String,
    private val _finishedDate: String,
    private var _isDatePenalty: Boolean,
    private var _isFinishedStops: Boolean,
    private var _isSelected:Boolean
) {
    val randomName: String
        get() = _randomName
    val finishAddress: String
        get() = _finishAddress
    val addressLat: String
        get() = _addressLat
    val addressLon: String
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
    var isSelected: Boolean
        get() = _isSelected
        set(value) {
            _isSelected = value
        }
}