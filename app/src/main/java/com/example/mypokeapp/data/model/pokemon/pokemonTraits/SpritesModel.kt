package com.example.mypokeapp.data.model.pokemon


import com.google.gson.annotations.SerializedName

data class SpritesModel(
    @SerializedName("back_default")
    val backDefault: String? = "",
    @SerializedName("back_female")
    val backFemale: Any? = Any(),
    @SerializedName("back_shiny")
    val backShiny: String? = "",
    @SerializedName("back_shiny_female")
    val backShinyFemale: Any? = Any(),
    @SerializedName("front_default")
    val frontDefault: String? = "",
    @SerializedName("front_female")
    val frontFemale: Any? = Any(),
    @SerializedName("front_shiny")
    val frontShiny: String? = "",
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any? = Any(),
    @SerializedName("other")
    val other: OtherModel? = OtherModel(),
)
data class OtherModel(
    @SerializedName("official-artwork")
    val officialArtwork: OfficialArtworkModel? = OfficialArtworkModel()
)
data class OfficialArtworkModel(
    @SerializedName("front_default")
    val frontDefault: String? = "",
    @SerializedName("front_shiny")
    val frontShiny: String? = ""
)