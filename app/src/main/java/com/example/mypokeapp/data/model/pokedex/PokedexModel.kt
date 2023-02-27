package com.example.mypokeapp.data.model.pokedex


import com.google.gson.annotations.SerializedName

data class PokedexModel(
    @SerializedName("id")
    val id: Int? = 0,
    @SerializedName("pokemon_entries")
    val pokemonEntries: List<PokemonEntryModel>? = listOf(),
)
data class PokemonEntryModel(
    @SerializedName("entry_number")
    val entryNumber: Int? = 0,
    @SerializedName("pokemon_species")
    val pokemonSpecies: PokemonSpeciesModel? = PokemonSpeciesModel()
)
data class PokemonSpeciesModel(
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("url")
    val url: String? = ""
)