package data

import domain.PokedexDataSource
import domain.Pokemon
import domain.PokedexRepository

class PokedexRepositoryImpl(
    private val dataSource: PokedexDataSource,
) : PokedexRepository {
    override suspend fun getPokemonList(): List<Pokemon> {
        return dataSource.getPokemonList()
    }
}