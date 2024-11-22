package data

import domain.PokedexDataSource
import domain.Pokemon
import domain.Repository
import kotlinx.coroutines.flow.Flow

class PokedexRepository(
    private val dataSource: PokedexDataSource
) : Repository {
    override fun getPokemonList(): Flow<List<Pokemon>> {
        return dataSource.pokedex
    }
}