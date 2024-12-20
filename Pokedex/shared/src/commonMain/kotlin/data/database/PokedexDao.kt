package data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import data.model.Pokemon
import kotlinx.coroutines.flow.Flow

@Dao
interface PokedexDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(pokemonList: List<Pokemon>)

    @Query("SELECT * FROM Pokemon")
    fun getPokemonList(): Flow<List<Pokemon>>

}