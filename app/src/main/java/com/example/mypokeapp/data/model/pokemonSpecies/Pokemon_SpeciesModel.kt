package com.example.mypokeapp.data.model.pokemonSpecies


import com.example.mypokeapp.data.model.pokemonSpecies.pokemonSpeciesTraits.EggGroupModel
import com.example.mypokeapp.data.model.pokemonSpecies.pokemonSpeciesTraits.EvolutionChainModel
import com.example.mypokeapp.data.model.pokemonSpecies.pokemonSpeciesTraits.NameModel
import com.google.gson.annotations.SerializedName

data class Pokemon_SpeciesModel(
    @SerializedName("base_happiness")
    val baseHappiness: Int? = 0,
    @SerializedName("capture_rate")
    val captureRate: Int? = 0,
    @SerializedName("egg_groups")
    val eggGroups: List<EggGroupModel>? = listOf(),
    @SerializedName("evolution_chain")
    val evolutionChain: EvolutionChainModel? = EvolutionChainModel(),
    @SerializedName("hatch_counter")
    val hatchCounter: Int? = 0,
    @SerializedName("id")
    val id: Int? = 0,
    @SerializedName("is_baby")
    val isBaby: Boolean? = false,
    @SerializedName("is_legendary")
    val isLegendary: Boolean? = false,
    @SerializedName("is_mythical")
    val isMythical: Boolean? = false,
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("names")
    val names: List<NameModel>? = listOf(),
    @SerializedName("order")
    val order: Int? = 0,
)