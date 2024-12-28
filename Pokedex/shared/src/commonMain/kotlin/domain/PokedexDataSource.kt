package domain

import kotlinx.coroutines.flow.Flow

interface PokedexDataSource {
    fun getPokemonList(): Flow<List<Pokemon>>
}