package data

import domain.PokedexDataSource
import domain.Pokemon
import domain.PokedexRepository
import kotlinx.coroutines.flow.Flow

class PokedexRepositoryImpl(
    private val dataSource: PokedexDataSource,
) : PokedexRepository {
    override fun getPokemonList(): Flow<List<Pokemon>> {
        return dataSource.getPokemonList()
    }
}