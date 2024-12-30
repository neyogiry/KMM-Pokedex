package data

import data.api.ApiServices
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
            val pokemonList = response.results
                ?.map { dto ->
                    Pokemon(
                        name = dto.name ?: "",
                        url = dto.url ?: ""
                    )
                } ?: emptyList()
            emit(pokemonList)
        }
    }
}