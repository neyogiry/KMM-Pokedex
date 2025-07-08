package data.datasource

import data.api.ApiServices
import data.toDomain
import domain.PokedexDataSource
import domain.Pokemon
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class PokedexRemoteDataSource(
    private val apiService: ApiServices
) : PokedexDataSource {
    override fun getPokemonList(): Flow<List<Pokemon>> {
        return flow {
            val response = apiService.pokemonList()
            emit(response.toDomain())
        }
    }
}