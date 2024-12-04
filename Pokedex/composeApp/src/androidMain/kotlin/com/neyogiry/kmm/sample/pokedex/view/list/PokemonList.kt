package com.neyogiry.kmm.sample.pokedex.view.list

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import domain.Pokemon
import org.koin.androidx.compose.koinViewModel

@Composable
fun PokemonListScreen(
    viewModel: PokemonListViewModel = koinViewModel<PokemonListViewModel>()
) {
    val viewState by viewModel.state.collectAsState()
    PokemonListContent(
        list = viewState.pokemonList
    )
}

@Composable
fun PokemonListContent(
    list: List<Pokemon> = emptyList()
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(10.dp)
    ) {
        items(list) { pokemon ->
            PokemonItem(pokemon)
        }
    }
}

@Composable
private fun PokemonItem(pokemon: Pokemon) {
    val shape = RoundedCornerShape(10.dp)
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(1f)
            .padding(4.dp)
            .border(width = 1.dp, color = Color.Gray, shape = shape)
            .background(color = Color.Transparent, shape = shape)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = pokemon.name,
            fontSize = 16.sp,
        )
    }
}