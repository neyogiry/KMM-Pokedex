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
    let pokemon: Pokemon
    
    var body: some View {
        ZStack(alignment: .topLeading) {
            VStack(spacing: 0) {
                AsyncImage(url: URL(string: ImageUtil.imageURL(from: pokemon.url))) { phase in
                    if let image = phase.image {
                        image
                            .resizable()
                            .scaledToFit()
                            .frame(maxWidth: .infinity, maxHeight: 120)
                            .padding(.top, 10)
                            .padding(.bottom, 0)
                    } else if phase.error != nil {
                        Image(systemName: "xmark.octagon.fill")
                            .resizable().scaledToFit().frame(width: 80, height: 80).foregroundColor(.red)
                            .padding(.vertical, 30)
                    } else {
                        ProgressView()
                            .frame(maxWidth: .infinity, maxHeight: 120)
                            .padding(.vertical, 30)
                    }
                }
                .frame(maxWidth: .infinity)
                
                VStack(alignment: .center, spacing: 4) {
                    Text(pokemon.name)
                        .font(.title3.weight(.bold))
                        .foregroundColor(.primary)
                        .lineLimit(1)
                }
                .padding(.horizontal, 10)
                .padding(.vertical, 8)
                .frame(maxWidth: .infinity, alignment: .center)
                
                .clipShape(RoundedRectangle(cornerRadius: 15, style: .continuous))
                .padding(.horizontal, 10)
                .padding(.bottom, 10)
            }
            
            Text(String(format: "#%03d", pokemon.id))
                .font(.caption.weight(.heavy))
                .foregroundColor(.secondary)
                .padding(.vertical, 4)
                .padding(.horizontal, 8)
                .background(.ultraThinMaterial)
                .clipShape(Capsule())
                .padding([.top, .leading], 10)
        }
        .frame(minHeight: 210)
        .background(.ultraThinMaterial)
        .clipShape(RoundedRectangle(cornerRadius: 25, style: .continuous))
        .overlay(
            RoundedRectangle(cornerRadius: 25, style: .continuous)
                .stroke(Color.gray.opacity(0.3), lineWidth: 1)
        )
        .shadow(color: Color.black.opacity(0.15), radius: 6, x: 0, y: 3)
    }
    
}


#Preview {
    PokemonItemView(pokemon: Pokemon(id: 1, name: "Bulbasaur", url: "https://pokeapi.co/api/v2/pokemon/1/"))
}
