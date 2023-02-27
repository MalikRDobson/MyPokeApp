package com.example.mypokeapp.data.model.pokemon


import com.example.mypokeapp.data.model.pokemon.pokemonTraits.SpeciesModel
import com.google.gson.annotations.SerializedName

data class PokemonModel(
    @SerializedName("abilities")
    val abilities: List<AbilityModel>? = listOf(),
    @SerializedName("base_experience")
    val baseExperience: Int? = 0,
    @SerializedName("height")
    val height: Int? = 0,
    @SerializedName("id")
    val id: Int? = 0,
    @SerializedName("is_default")
    val isDefault: Boolean? = false,
    @SerializedName("moves")
    val moves: List<MoveModel>? = listOf(),
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("order")
    val order: Int? = 0,
    @SerializedName("species")
    val species: SpeciesModel? = SpeciesModel(),
    @SerializedName("sprites")
    val sprites: SpritesModel? = SpritesModel(),
    @SerializedName("stats")
    val stats: List<StatModel>? = listOf(),
    @SerializedName("types")
    val types: List<TypeModel>? = listOf(),
    @SerializedName("weight")
    val weight: Int? = 0
)