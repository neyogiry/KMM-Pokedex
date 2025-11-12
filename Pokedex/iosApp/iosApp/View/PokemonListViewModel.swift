//
//  PokemonListViewModel.swift
//  iosApp
//
//  Created by neyogiry on 20/11/24.
//  Copyright © 2024 orgName. All rights reserved.
//

import Foundation
import Shared

@Observable
final class PokemonListViewModel {
    private let pokedexRepository: PokedexRepository
    
    var pokedex: [Pokemon] = []
    
    init(pokedexRepository: PokedexRepository = KoinDependencies().pokedexRepository) {
        self.pokedexRepository = pokedexRepository
        Task { await getPokemonList() }
    }

    private func getPokemonList() async {
        if let pokemonList = try? await pokedexRepository.getPokemonList() {
            self.pokedex = pokemonList
        }
    }
    
}
