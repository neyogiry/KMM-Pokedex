package domain

import kotlinx.coroutines.flow.Flow

interface Repository {
    fun getPokemonList(): Flow<List<Pokemon>>
}