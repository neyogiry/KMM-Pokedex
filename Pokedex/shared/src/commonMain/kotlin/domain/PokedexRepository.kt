package domain

interface PokedexRepository {
    suspend fun getPokemonList(): List<Pokemon>
}