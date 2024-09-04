//
//  PokemonListView.swift
//  iosApp
//
//  Created by neyogiry on 3/09/24.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI

struct PokemonListView: View {
    var body: some View {
        Text(/*@START_MENU_TOKEN@*/"Hello, World!"/*@END_MENU_TOKEN@*/)
        List {
            Text("Bulbasaur")
            Text("Ivysaur")
            Text("Venusaur")
            Text("Charmander")
            Text("Charmeleon")
            Text("Charizard")
            Text("Squirtle")
            Text("Wartortle")
            Text("Blastoise")
        }
    }
}

#Preview {
    PokemonListView()
}
