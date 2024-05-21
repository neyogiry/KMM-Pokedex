package data

data class PokedexResponse(
    val count: Int?,
    val next: String?,
    val results: List<PokemonResponse>?,
)

data class PokemonResponse(
    val name: String?,
    val url: String?,
)