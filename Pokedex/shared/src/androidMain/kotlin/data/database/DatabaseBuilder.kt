package data.database

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

fun getDatabaseBuilder(context: Context): RoomDatabase.Builder<PokedexDatabase> {
    val appContext = context.applicationContext
    val dbFile = appContext.getDatabasePath(dbFileName)
    return Room.databaseBuilder<PokedexDatabase>(
        context = appContext,
        name = dbFile.absolutePath
    )
}