//
//  ImageUtil.swift
//  iosApp
//
//  Created by neyogiry on 1/12/24.
//  Copyright © 2024 orgName. All rights reserved.
//

final class ImageUtil {
    static func imageURL(from url: String) -> String {
        let baseImageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/%@.png"
        let array = url.components(separatedBy: "/")
        let id = array[array.count-2]
        return String(format: baseImageUrl, arguments: [id])
    }
}
