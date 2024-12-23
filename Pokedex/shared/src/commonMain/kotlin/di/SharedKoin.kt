package di

import data.ApiServices
import data.PokedexApi
import data.PokedexRemoteDataSource
import data.PokedexRepositoryImpl
import domain.PokedexDataSource
import domain.PokedexRepository
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.module

expect fun databaseModule(): Module

val sharedModule = module {
    single< HttpClient> { httpClient() }
    single<ApiServices> { PokedexApi(get()) }
    single<PokedexDataSource> { PokedexRemoteDataSource(get()) }
    single<PokedexRepository> { PokedexRepositoryImpl(get()) }
}

private fun httpClient() = HttpClient {
    install(ContentNegotiation) {
        json(Json {
            ignoreUnknownKeys = true
        })
    }
}

/**
 * Koin initializer for androidApp module
 */
fun initKoin(vararg modules: Module) {
    startKoin {
        modules(
            sharedModule,
            databaseModule(),
            *modules,
        )
    }
}

/**
 * Koin initializer for iosApp module
 */
fun initKoin() {
    startKoin {
        modules(
            sharedModule,
            databaseModule()
        )
    }
}