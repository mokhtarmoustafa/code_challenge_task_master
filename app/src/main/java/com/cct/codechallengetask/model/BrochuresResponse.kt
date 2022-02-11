package com.cct.codechallengetask.model


import com.google.gson.annotations.SerializedName

data class BrochuresResponse(
    @SerializedName("_embedded")
    var embedded: Embedded,
//    @SerializedName("_links")
//    var links: Links,
//    @SerializedName("page")
//    var page: Page
)