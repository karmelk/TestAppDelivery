package com.kmwork.domain.interactor

import com.kmwork.entities.Result
import com.kmwork.entities.StopsModelDB

interface StopsInteractor {
    suspend fun getStopsData(): Result<MutableList<StopsModelDB>>
}