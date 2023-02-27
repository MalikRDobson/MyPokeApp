package com.example.mypokeapp.data.model.pokemon


import com.google.gson.annotations.SerializedName

data class AbilityModel(
    @SerializedName("ability")
    val ability: AbilityModelX? = AbilityModelX(),
    @SerializedName("is_hidden")
    val isHidden: Boolean? = false,
    @SerializedName("slot")
    val slot: Int? = 0
)
data class AbilityModelX(
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("url")
    val url: String? = ""
)