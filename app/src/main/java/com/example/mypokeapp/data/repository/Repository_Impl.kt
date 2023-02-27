package com.example.mypokeapp.data.repository

import com.example.mypokeapp.data.model.pokedex.PokedexModelList
import com.example.mypokeapp.data.model.pokemon.PokemonModelList
import com.example.mypokeapp.data.model.pokemonSpecies.Pokemon_SpeciesModelList
import com.example.mypokeapp.data.remote.ApiDetails
import com.example.mypokeapp.data.remote.ApiReference
import retrofit2.Response
import retrofit2.http.GET
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    val apiDetails: ApiDetails
) : Repository {

    override suspend fun getPokedexList(): Response<PokedexModelList> {
        return apiDetails.getPokedexList()
    }

    override suspend fun getPokemonList(): Response<PokemonModelList> {
        return apiDetails.getPokemonList()
    }

    override suspend fun getPokemon_SpeciesList(): Response<Pokemon_SpeciesModelList> {
        return apiDetails.getPokemon_SpeciesList()
    }

}