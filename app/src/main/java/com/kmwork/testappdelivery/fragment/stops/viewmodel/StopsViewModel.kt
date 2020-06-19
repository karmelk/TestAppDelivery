package com.kmwork.testappdelivery.fragment.stops.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kmwork.domain.interactor.StopsInteractor
import com.kmwork.entities.Result
import com.kmwork.entities.localmodel.StopsModel
import com.kmwork.entities.responcemodel.StopsModelDB
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class StopsViewModel(private val stopInteractor: StopsInteractor) : ViewModel() {
    private val _getStopsDataLD by lazy { MutableLiveData<MutableList<StopsModel>>() }
    val getStopsDataLD: LiveData<MutableList<StopsModel>> get() = _getStopsDataLD

    init {
        getStopData()
    }

    private fun getStopData() {
        viewModelScope.launch(Dispatchers.IO) {
            when (val userData = stopInteractor.getStopsData()) {
                is Result.Success -> withContext(Dispatchers.Main) {
                    _getStopsDataLD.value = userData.data
                }
            }
        }
    }
}