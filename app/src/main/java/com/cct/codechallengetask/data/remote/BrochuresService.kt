package com.cct.codechallengetask.data.remote

import com.cct.codechallengetask.model.BrochuresResponse
import com.cct.codechallengetask.ui.model.BResponse

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

interface BrochuresService {
//    @Headers("Content-Type: application/json")
    @GET("stories-test/shelf.json")
    suspend fun getBrochures():Response<BrochuresResponse>
}