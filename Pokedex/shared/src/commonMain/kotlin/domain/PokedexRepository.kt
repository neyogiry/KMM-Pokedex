package domain

import kotlinx.coroutines.flow.Flow

interface PokedexRepository {
    fun getPokemonList(): Flow<List<Pokemon>>
}