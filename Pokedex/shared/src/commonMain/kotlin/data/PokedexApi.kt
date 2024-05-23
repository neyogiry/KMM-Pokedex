package data

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class PokedexApi(
    private val client: HttpClient
) : ApiServices {

    override suspend fun pokemonList(): PokedexResponse {
        return try {
            client.get("$PATH/pokemon").body()
        } catch (e: Exception) {
            e.printStackTrace()
            throw e
        }
    }

    companion object {
        private const val PATH = "https://pokeapi.co/api/v2/"
    }

}

interface ApiServices {
    suspend fun pokemonList(): PokedexResponse
}