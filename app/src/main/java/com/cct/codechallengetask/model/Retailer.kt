package com.cct.codechallengetask.model


import com.google.gson.annotations.SerializedName

data class Retailer(
    @SerializedName("id")
    var id: String,
    @SerializedName("name")
    var name: String
)