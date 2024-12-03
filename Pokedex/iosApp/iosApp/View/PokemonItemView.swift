//
//  PokemonItemView.swift
//  iosApp
//
//  Created by neyogiry on 1/12/24.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI
import Shared

struct PokemonItemView: View {
    private let pokemon: Pokemon
    
    init(pokemon: Pokemon) {
        self.pokemon = pokemon
    }
    
    var body: some View {
        VStack {
            AsyncImage(url: URL(string: ImageUtil.imageURL(from: pokemon.url)))
            Text(pokemon.name)
        }
        .padding(.all, 16)
        .cornerRadius(40)
        .overlay(
            RoundedRectangle(cornerRadius: 40)
                .stroke(.gray, lineWidth: 1)
        )
        
    }
}

#Preview {
    PokemonItemView(pokemon: Pokemon(name: "Bulbasaur", url: "https://pokeapi.co/api/v2/pokemon/1/"))
}
