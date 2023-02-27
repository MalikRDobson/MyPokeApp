package com.example.mypokeapp.data.model.pokemonSpecies.pokemonSpeciesTraits


import com.google.gson.annotations.SerializedName

data class PokemonModel(
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("url")
    val url: String? = ""
)