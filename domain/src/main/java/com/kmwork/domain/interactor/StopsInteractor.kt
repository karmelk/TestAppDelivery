package com.kmwork.domain.interactor

import com.kmwork.entities.Result
import com.kmwork.entities.localmodel.StopsModel

interface StopsInteractor {
    suspend fun getStopsData(): Result<MutableList<StopsModel>>
    suspend fun updateStop(stopId: Long):Result<MutableList<StopsModel>>
}