package com.example.mypokeapp.data.remote

import com.example.mypokeapp.data.model.pokedex.PokedexModelList
import com.example.mypokeapp.data.model.pokemon.PokemonModelList
import com.example.mypokeapp.data.model.pokemonSpecies.Pokemon_SpeciesModelList
import retrofit2.Response
import retrofit2.http.GET

interface ApiDetails {

    @GET(ApiReference.POKEDEX)
    suspend fun getPokedexList(): Response<PokedexModelList>

    @GET(ApiReference.POKEMON)
    suspend fun getPokemonList(): Response<PokemonModelList>

    @GET(ApiReference.POKEMON_SPECIES)
    suspend fun getPokemon_SpeciesList(): Response<Pokemon_SpeciesModelList>

}