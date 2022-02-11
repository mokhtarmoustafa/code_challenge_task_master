package com.cct.codechallengetask.data

import com.cct.codechallengetask.data.remote.BrochureDataSource
import com.cct.codechallengetask.model.BaseApiResponse
import com.cct.codechallengetask.model.BrochuresResponse
import com.cct.codechallengetask.ui.model.BResponse
import com.cct.codechallengetask.util.NetworkResult
import dagger.hilt.android.scopes.ActivityRetainedScoped
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject


@ActivityRetainedScoped
class BrochureRepository @Inject constructor(
    private val remoteDataSource: BrochureDataSource
) : BaseApiResponse() {

    suspend fun getBrochures(): Flow<NetworkResult<BrochuresResponse>> {
        return flow<NetworkResult<BrochuresResponse>> {
            emit(safeApiCall { remoteDataSource.getBrochures() })
        }.flowOn(Dispatchers.IO)
    }

}

