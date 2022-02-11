package com.cct.codechallengetask.ui.model


import com.google.gson.annotations.SerializedName

data class ExternalTracking(
    @SerializedName("click")
    var click: List<String>,
    @SerializedName("impression")
    var impression: List<Any>
)