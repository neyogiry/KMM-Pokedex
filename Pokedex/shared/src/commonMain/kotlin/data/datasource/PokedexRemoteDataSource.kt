package data.datasource

import data.api.ApiServices
import data.toDomain
import domain.PokedexDataSource
import domain.Pokemon

class PokedexRemoteDataSource(
    private val apiService: ApiServices
) : PokedexDataSource {
    override suspend fun getPokemonList(): List<Pokemon> {
        val response = apiService.pokemonList()
        return response.toDomain()
    }
}