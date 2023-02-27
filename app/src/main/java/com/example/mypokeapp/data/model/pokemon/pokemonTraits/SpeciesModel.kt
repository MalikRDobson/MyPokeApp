package com.example.mypokeapp.data.model.pokemon.pokemonTraits


import com.google.gson.annotations.SerializedName

data class SpeciesModel(
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("url")
    val url: String? = ""
)