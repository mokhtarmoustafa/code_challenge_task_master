package com.cct.codechallengetask.ui.model


import com.cct.codechallengetask.model.Publisher
import com.cct.codechallengetask.model.Retailer
import com.google.gson.annotations.SerializedName

data class Content(
//    @SerializedName("badges")
//    var badges: List<Any>,
    @SerializedName("brochureImage")
    var brochureImage: String,
    @SerializedName("distance")
    var distance: Double,
    @SerializedName("hideValidityDate")
    var hideValidityDate: Boolean,
    @SerializedName("id")
    var id: Int,
    @SerializedName("isEcommerce")
    var isEcommerce: Boolean,
    @SerializedName("pageCount")
    var pageCount: Int,
    @SerializedName("publishedFrom")
    var publishedFrom: String,
    @SerializedName("publishedUntil")
    var publishedUntil: String,
    @SerializedName("publisher")
    var publisher: Publisher,
    @SerializedName("retailer")
    var retailer: Retailer,
    @SerializedName("title")
    var title: String,
    @SerializedName("type")
    var type: String,
    @SerializedName("validFrom")
    var validFrom: String,
    @SerializedName("validUntil")
    var validUntil: String
)