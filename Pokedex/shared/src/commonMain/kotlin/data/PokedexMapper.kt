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
        id = getId(this.url) ?: -1,
        name = this.name ?: "",
        url = this.url ?: ""
    )
}

private fun getId(url: String?): Int? {
    return url?.let {
        val regex = "/pokemon/(\\d+)/?".toRegex()
        val matchResult = regex.find(url)
        val numberString = matchResult?.groups?.get(1)?.value
        numberString?.toIntOrNull()
    }
}