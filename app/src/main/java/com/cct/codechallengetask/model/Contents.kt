package com.cct.codechallengetask.model


import com.google.gson.annotations.SerializedName

data class Contents(
//    @SerializedName("adFormat")
//    var adFormat: String?,
    @SerializedName("content")
    var content: Content,
//    @SerializedName("contentFormatSource")
//    var contentFormatSource: String,
//    @SerializedName("contentType")
//    var contentType: String,
//    @SerializedName("externalTracking")
//    var externalTracking: ExternalTracking,
//    @SerializedName("placement")
//    var placement: String
)