package com.example.mypokeapp.data.repository

import com.example.mypokeapp.data.model.pokedex.PokedexModelList
import com.example.mypokeapp.data.model.pokemon.PokemonModelList
import com.example.mypokeapp.data.model.pokemonSpecies.Pokemon_SpeciesModelList
import com.example.mypokeapp.data.remote.ApiReference
import retrofit2.Response
import retrofit2.http.GET

interface Repository {

    suspend fun getPokedexList(): Response<PokedexModelList>

    suspend fun getPokemonList(): Response<PokemonModelList>

    suspend fun getPokemon_SpeciesList(): Response<Pokemon_SpeciesModelList>

}