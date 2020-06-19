package com.kmwork.domain.interactor

import com.kmwork.entities.Result
import com.kmwork.entities.localmodel.StopsModel
import com.kmwork.entities.responcemodel.StopsModelDB

interface StopsInteractor {
    suspend fun getStopsData(): Result<MutableList<StopsModel>>
}