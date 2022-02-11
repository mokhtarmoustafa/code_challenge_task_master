package com.cct.codechallengetask.model

import android.util.Log
import com.cct.codechallengetask.util.NetworkResult
import retrofit2.Response

abstract class BaseApiResponse {

    suspend fun <T> safeApiCall(apiCall: suspend () -> Response<T>): NetworkResult<T> {
        try {
            val response = apiCall()
            Log.d(TAG, "response ${response.body()}")
            if (response.isSuccessful) {
                Log.d(TAG, "safeApiCall:Success ${response.body()}")
                val body = response.body()
                body?.let {
                    return NetworkResult.Success(body)
                }
            }
            return error("${response.code()} ${response.message()}")
        } catch (e: Exception) {
            Log.d(TAG, "safeApiCall:Exception ${e.message}")
            return error(e.message ?: e.toString())
        }
    }

    private fun <T> error(errorMessage: String): NetworkResult<T> =
        NetworkResult.Error("Api call failed $errorMessage")

    companion object{
        private const val TAG = "BaseApiResponse"
    }
}