package di

import data.database.PokedexDatabase
import data.database.getDatabaseBuilder
import data.database.getRoomDatabase
import org.koin.dsl.module

actual fun databaseModule() = module {
    single<PokedexDatabase> { getRoomDatabase(getDatabaseBuilder(get())) }
}