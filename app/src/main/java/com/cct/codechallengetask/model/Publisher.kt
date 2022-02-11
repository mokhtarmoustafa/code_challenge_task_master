package com.cct.codechallengetask.model


import com.google.gson.annotations.SerializedName

data class Publisher(
    @SerializedName("id")
    var id: String,
    @SerializedName("name")
    var name: String,
    @SerializedName("type")
    var type: String
)