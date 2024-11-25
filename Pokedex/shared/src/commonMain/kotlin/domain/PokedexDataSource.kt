package domain

import kotlinx.coroutines.flow.Flow

interface PokedexDataSource {
    val pokedex: Flow<List<Pokemon>>
}