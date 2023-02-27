package com.example.mypokeapp.data.model.pokemon


import com.google.gson.annotations.SerializedName

data class TypeModel(
    @SerializedName("slot")
    val slot: Int? = 0,
    @SerializedName("type")
    val type: TypeModelX? = TypeModelX()
)
data class TypeModelX(
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("url")
    val url: String? = ""
)