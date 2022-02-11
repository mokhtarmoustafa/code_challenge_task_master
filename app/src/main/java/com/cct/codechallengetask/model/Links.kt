package com.cct.codechallengetask.model


import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("self")
    var self: Self
)