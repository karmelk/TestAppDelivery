package com.kmwork.domain.usecase

import com.kmwork.data.datastore.MarkerMapRepository
import com.kmwork.domain.interactor.MarkerMapInteractor
import com.kmwork.domain.utils.Constants
import com.kmwork.domain.utils.mapLocalMarkerMapModel
import com.kmwork.entities.DeliveryException
import com.kmwork.entities.Result
import com.kmwork.entities.localmodel.MarkerMapModel

class MarkerMapUseCase(private val markerMapRepository: MarkerMapRepository): MarkerMapInteractor {
    private val stopMapList: MutableList<MarkerMapModel> = mutableListOf()
    override suspend fun getMarkerMapData(): Result<MutableList<MarkerMapModel>> {
        val mapListData = markerMapRepository.getStopList()
        mapListData?.apply {
            for (item in mapListData) {
                stopMapList.add(item.mapLocalMarkerMapModel())
            }
            return Result.Success(stopMapList)
        }
        return Result.Error(DeliveryException(Constants.errorDataNull,null,"No data"))
    }
}