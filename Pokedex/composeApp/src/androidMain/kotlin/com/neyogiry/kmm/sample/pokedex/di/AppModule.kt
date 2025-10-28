package com.neyogiry.kmm.sample.pokedex.di

import com.neyogiry.kmm.sample.pokedex.view.list.PokemonListViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {
    viewModelOf(::PokemonListViewModel)
}