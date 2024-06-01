package domain

import kotlinx.coroutines.flow.Flow

class PokedexRepository(
    private val dataSource: PokedexDataSource
) {
    val pokedex: Flow<List<Pokemon>> = dataSource.pokedex
}