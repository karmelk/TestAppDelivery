package com.kmwork.domain.usecase

import com.kmwork.data.datastore.StopsRepository
import com.kmwork.domain.interactor.StopsInteractor
import com.kmwork.domain.utils.Constants.Companion.errorDataNull
import com.kmwork.entities.DeliveryException
import com.kmwork.entities.Result
import com.kmwork.entities.StopsModelDB

class StopsUseCase(private val stepsRepository: StopsRepository): StopsInteractor {
    override suspend fun getStopsData(): Result<MutableList<StopsModelDB>> {
       val data = stepsRepository.getStopsListDB()
        data?.let {
            return Result.Success(it)
        }
        return Result.Error(DeliveryException(errorDataNull))
    }
}