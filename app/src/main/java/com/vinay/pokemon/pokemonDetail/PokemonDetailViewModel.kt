package com.vinay.pokemon.pokemonDetail

import androidx.lifecycle.ViewModel
import com.vinay.pokemon.data.remote.responses.Pokemon
import com.vinay.pokemon.repository.PokemonRepository
import com.vinay.pokemon.util.Resource

import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}