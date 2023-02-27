package com.example.mypokeapp.data.model.pokemon


import com.google.gson.annotations.SerializedName

data class StatModel(
    @SerializedName("base_stat")
    val baseStat: Int? = 0,
    @SerializedName("effort")
    val effort: Int? = 0,
    @SerializedName("stat")
    val stat: StatModelX? = StatModelX()
)
data class StatModelX(
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("url")
    val url: String? = ""
)