package com.neyogiry.kmm.sample.pokedex.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import domain.PokedexRepository
import domain.Pokemon
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class PokemonListViewModel(
    private val repository: PokedexRepository
) : ViewModel() {

    private val _state = MutableStateFlow(PokemonListViewState())
    val state: StateFlow<PokemonListViewState>
        get() = _state

    fun load() {
        viewModelScope.launch(Dispatchers.IO) {
            _state.update { PokemonListViewState(isLoading = true) }
            repository.pokedex
                .collect { pokemonList ->
                    _state.update {
                        PokemonListViewState(pokemonList = pokemonList)
                    }
                }
        }
    }

}

data class PokemonListViewState(
    val pokemonList: List<Pokemon> = emptyList(),
    val showError: Boolean = false,
    val isLoading: Boolean = false,
)