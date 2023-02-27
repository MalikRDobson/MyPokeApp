package com.example.mypokeapp.data.model.pokemon


import com.google.gson.annotations.SerializedName

data class MoveModel(
    @SerializedName("move")
    val move: MoveModelX? = MoveModelX(),
)
data class MoveModelX(
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("url")
    val url: String? = ""
)