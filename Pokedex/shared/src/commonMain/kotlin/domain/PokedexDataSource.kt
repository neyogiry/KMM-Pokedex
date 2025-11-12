package domain

interface PokedexDataSource {
    suspend fun getPokemonList(): List<Pokemon>
}