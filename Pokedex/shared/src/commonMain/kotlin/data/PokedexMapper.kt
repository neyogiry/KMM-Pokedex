package data

import domain.Pokemon

fun PokedexResponse.toDomain(): List<Pokemon> {
    return this.results
        ?.map { dto ->
            dto.toDomain()
        } ?: emptyList()
}

fun PokemonResponse.toDomain(): Pokemon {
    return Pokemon(
        name = this.name ?: "",
        url = this.url ?: ""
    )
}