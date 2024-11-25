package data

import domain.PokedexDataSource
import domain.Pokemon
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class PokedexRemoteDataSource(
    private val apiService: ApiServices
) : PokedexDataSource {

    override val pokedex: Flow<List<Pokemon>>
        get() = flow {
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