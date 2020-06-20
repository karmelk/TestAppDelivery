package com.kmwork.domain.utils

import com.kmwork.entities.localmodel.MarkerMapModel
import com.kmwork.entities.localmodel.StopsModel
import com.kmwork.entities.responcemodel.StopsModelDB

fun StopsModelDB.mapLocalStopModel() = StopsModel(
    _id = id,
    _randomName = randomName,
    _expectantDate = expectantDate,
    _finishAddress = finishAddress,
    _finishedDate = finishedDate,
    _addressLat = addressLat,
    _addressLon = addressLon,
    _isDatePenalty = isDatePenalty,
    _isFinishedStops = isFinishedStops,
    _isSelected = false
)

fun StopsModelDB.mapLocalMarkerMapModel() = MarkerMapModel(
    _id = id,
    _addressName = randomName,
    _addressLat = addressLat,
    _addressLon = addressLon,
    _isDatePenalty = isDatePenalty,
    _isFinishedStops = isFinishedStops
)