package data

import kotlinx.serialization.Serializable

@Serializable
data class PokedexResponse(
    val count: Int?,
    val next: String?,
    val results: List<PokemonResponse>?,
)

@Serializable
data class PokemonResponse(
    val name: String?,
    val url: String?,
)