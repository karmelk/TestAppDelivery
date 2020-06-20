package com.kmwork.domain.interactor

import com.kmwork.entities.Result
import com.kmwork.entities.localmodel.MarkerMapModel

interface MarkerMapInteractor {
    suspend fun getMarkerMapData():Result<MutableList<MarkerMapModel>>
}