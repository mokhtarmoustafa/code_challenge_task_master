package com.cct.codechallengetask.data.remote

import javax.inject.Inject

class BrochureDataSource @Inject constructor(private val brochuresService: BrochuresService) {
    suspend fun getBrochures() =brochuresService.getBrochures()
}