package com.neyogiry.kmm.sample.pokedex.util

object ImageUtil {

    fun pokemonImageUrl(url: String): String {
        val index = url.split("/".toRegex()).dropLast(1).last()
        return "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/$index.png"
    }

}