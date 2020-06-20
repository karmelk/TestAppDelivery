package com.kmwork.testappdelivery.fragment.marksmap.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kmwork.domain.interactor.MarkerMapInteractor
import com.kmwork.domain.utils.Constants
import com.kmwork.entities.Result
import com.kmwork.entities.localmodel.MarkerMapModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MarkerMapViewModel(private val markerMapInteractor: MarkerMapInteractor) : ViewModel() {
    private val _getMarkerMapDataLD by lazy { MutableLiveData<MutableList<MarkerMapModel>>() }
    val getMarkerMapDataLD: LiveData<MutableList<MarkerMapModel>> get() = _getMarkerMapDataLD
    private val _getErrorMapDataLD by lazy { MutableLiveData<String>() }
    val getErrorMapDataLD: LiveData<String> get() = _getErrorMapDataLD

    init {
        getMarkerMapList()
    }

    private fun getMarkerMapList() {
        viewModelScope.launch(Dispatchers.IO) {
            when (val userData = markerMapInteractor.getMarkerMapData()) {
                is Result.Success -> withContext(Dispatchers.Main) {
                    _getMarkerMapDataLD.value = userData.data
                }
                is Result.Error -> withContext(Dispatchers.Main) {
                    if (userData.errors.errorCode == Constants.errorDataNull) {
                        _getErrorMapDataLD.value = userData.errors.errorMessage
                    }
                }
            }
        }
    }
}