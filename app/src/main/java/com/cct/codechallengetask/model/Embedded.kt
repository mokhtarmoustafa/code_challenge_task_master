package com.cct.codechallengetask.model


import com.google.gson.annotations.SerializedName

data class Embedded(
    @SerializedName("contents")
    var contents: List<Contents>
)