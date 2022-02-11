package com.cct.codechallengetask.ui.model


import com.google.gson.annotations.SerializedName

data class Page(
    @SerializedName("number")
    var number: Int,
    @SerializedName("size")
    var size: Int,
    @SerializedName("totalElements")
    var totalElements: Int,
    @SerializedName("totalPages")
    var totalPages: Int
)