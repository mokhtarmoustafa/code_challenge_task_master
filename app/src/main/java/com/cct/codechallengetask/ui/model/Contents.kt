package com.cct.codechallengetask.ui.model


import com.google.gson.annotations.SerializedName

data class Contents(
    @SerializedName("adFormat")
    var adFormat: Any?,
    @SerializedName("content")
    var content: Any?,
    @SerializedName("contentFormatSource")
    var contentFormatSource: String,
    @SerializedName("contentType")
    var contentType: String,
    @SerializedName("externalTracking")
    var externalTracking: ExternalTracking,
    @SerializedName("placement")
    var placement: String
)