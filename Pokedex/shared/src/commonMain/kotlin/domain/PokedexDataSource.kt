package domain

import domain.Pokemon
import kotlinx.coroutines.flow.Flow

interface PokedexDataSource {
    val pokedex: Flow<List<Pokemon>>
}