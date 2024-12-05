//
//  PokemonListView.swift
//  iosApp
//
//  Created by neyogiry on 3/09/24.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI

struct PokemonListView: View {
    @State private var viewModel = PokemonListViewModel()
    
    private let columns = [GridItem(), GridItem()]
    
    var body: some View {
        NavigationStack {
            ScrollView {
                LazyVGrid(columns: columns) {
                    ForEach(viewModel.pokedex, id: \.name) { pokemon in
                        PokemonItemView(pokemon: pokemon)
                    }
                }
                .padding(10)
            }
        }
        .navigationTitle("Pokedex")
    }
}

#Preview {
    PokemonListView()
}
