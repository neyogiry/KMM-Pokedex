package data.database

import androidx.room.ConstructedBy
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.RoomDatabaseConstructor
import data.model.Pokemon

@Database(entities = [Pokemon::class], version = 1)
@ConstructedBy(AppDatabaseConstructor::class)
abstract class PokedexDatabase : RoomDatabase()

@Suppress("NO_ACTUAL_FOR_EXPECT")
expect object AppDatabaseConstructor : RoomDatabaseConstructor<PokedexDatabase> {
    override fun initialize(): PokedexDatabase
}