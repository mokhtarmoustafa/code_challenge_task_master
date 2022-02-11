package com.cct.codechallengetask.model


import com.google.gson.annotations.SerializedName

data class Content(
//    @SerializedName("badges")
//    var badges: List<Any>,
    @SerializedName("brochureImage")
    var brochureImage: String="",
    @SerializedName("distance")
    var distance: Double=0.0,
    @SerializedName("hideValidityDate")
    var hideValidityDate: Boolean=false,
    @SerializedName("id")
    var id: Int=0,
    @SerializedName("isEcommerce")
    var isEcommerce: Boolean=false,
    @SerializedName("pageCount")
    var pageCount: Int=0,
    @SerializedName("publishedFrom")
    var publishedFrom: String="",
    @SerializedName("publishedUntil")
    var publishedUntil: String="",
    @SerializedName("publisher")
    var publisher: Publisher,
    @SerializedName("retailer")
    var retailer: Retailer,
    @SerializedName("title")
    var title: String="",
    @SerializedName("type")
    var type: String="",
    @SerializedName("validFrom")
    var validFrom: String="",
    @SerializedName("validUntil")
    var validUntil: String=""
)