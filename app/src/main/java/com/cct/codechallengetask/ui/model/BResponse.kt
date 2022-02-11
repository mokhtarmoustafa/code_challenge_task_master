package com.cct.codechallengetask.ui.model


import com.google.gson.annotations.SerializedName

data class BResponse(
    @SerializedName("_embedded")
    var embedded: Embedded,
    @SerializedName("_links")
    var links: Links,
    @SerializedName("page")
    var page: Page
)