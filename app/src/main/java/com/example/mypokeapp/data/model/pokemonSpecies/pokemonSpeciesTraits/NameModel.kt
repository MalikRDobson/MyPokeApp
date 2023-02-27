package com.example.mypokeapp.data.model.pokemonSpecies.pokemonSpeciesTraits


import com.example.mypokeapp.data.model.pokemonSpecies.pokemonSpeciesTraits.LanguageModel
import com.google.gson.annotations.SerializedName

data class NameModel(
    @SerializedName("language")
    val language: LanguageModel? = LanguageModel(),
    @SerializedName("name")
    val name: String? = ""
)