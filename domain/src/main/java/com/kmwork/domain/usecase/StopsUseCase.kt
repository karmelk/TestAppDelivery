package com.kmwork.domain.usecase

import com.kmwork.data.datastore.StopsRepository
import com.kmwork.domain.interactor.StopsInteractor
import com.kmwork.domain.utils.Constants.Companion.errorDataNull
import com.kmwork.domain.utils.generateRandomList
import com.kmwork.domain.utils.mapLocalStopModel
import com.kmwork.entities.DeliveryException
import com.kmwork.entities.Result
import com.kmwork.entities.localmodel.StopsModel
import com.kmwork.entities.responcemodel.StopsModelDB

class StopsUseCase(private val stepsRepository: StopsRepository) : StopsInteractor {
    private val stopModelList: MutableList<StopsModel> = mutableListOf()
    override suspend fun getStopsData(): Result<MutableList<StopsModel>> {
        val data = stepsRepository.getStopsListDB()
        if (data.isNullOrEmpty()) {
            return Result.Success(setStopDefaultList())
        } else {
            for (item in data) {
                stopModelList.add(item.mapLocalStopModel())
            }
            if (data.isNotEmpty()) {
                return Result.Success(stopModelList)
            }
        }
        return Result.Error(DeliveryException(errorDataNull))
    }

    private suspend fun setStopDefaultList(): MutableList<StopsModel> {
        val defaultData = generateRandomList()
        stepsRepository.setDefaultData(defaultData)
        for (item in defaultData) {
            stopModelList.add(item.mapLocalStopModel())
        }
        return stopModelList
    }
}