package di

import data.ApiServices
import data.PokedexApi
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.core.context.startKoin
import org.koin.dsl.module

val sharedModule = module {
    single< HttpClient> { httpClient() }
    single<ApiServices> { PokedexApi(get()) }
}

fun initKoin() {
    startKoin {
        modules(sharedModule)
    }
}

private fun httpClient() = HttpClient {
    install(ContentNegotiation) {
        json(Json {
            ignoreUnknownKeys = true
        })
    }
}