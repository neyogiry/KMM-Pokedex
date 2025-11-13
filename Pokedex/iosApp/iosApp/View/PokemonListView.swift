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
    
    private let gridLayout = [
        GridItem(.flexible(minimum: 150)),
        GridItem(.flexible(minimum: 150))
    ]
    
    var body: some View {
        NavigationStack {
            ScrollView {
                LazyVGrid(columns: gridLayout, spacing: 16) {
                    ForEach(viewModel.pokedex, id: \.name) { pokemon in
                        Button {
                            print("Tapped on \(pokemon.name)")
                        } label: {
                            PokemonItemView(pokemon: pokemon)
                                .foregroundColor(.primary)
                        }
                        .buttonStyle(.plain)
                    }
                }
                .padding(.horizontal)
            }
            .navigationTitle("Pokedex")
        }
    }
}

#Preview {
    PokemonListView()
}
