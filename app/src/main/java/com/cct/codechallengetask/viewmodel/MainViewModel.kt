package com.cct.codechallengetask.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.*
import com.cct.codechallengetask.data.BrochureRepository
import com.cct.codechallengetask.model.BrochuresResponse
import com.cct.codechallengetask.ui.model.BResponse
import com.cct.codechallengetask.ui.model.Content
import com.cct.codechallengetask.util.Constants
import com.cct.codechallengetask.util.NetworkResult

import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: BrochureRepository,
    application: Application
) : AndroidViewModel(application) {

    private val _response: MutableLiveData<NetworkResult<BrochuresResponse>> = MutableLiveData()
    val response: LiveData<NetworkResult<BrochuresResponse>> = _response

    fun fetchBrochuresResponse() = viewModelScope.launch {
        repository.getBrochures()
            .collect { values ->
                _response.value = values
            }
    }

    companion object {
        private const val TAG = "MainViewModel"
    }
}