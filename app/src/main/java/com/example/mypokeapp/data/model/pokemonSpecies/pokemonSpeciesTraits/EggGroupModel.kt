package com.example.mypokeapp.data.model.pokemonSpecies.pokemonSpeciesTraits


import com.google.gson.annotations.SerializedName

data class EggGroupModel(
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("url")
    val url: String? = ""
)