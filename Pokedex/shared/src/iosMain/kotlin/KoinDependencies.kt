import domain.PokedexRepository
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class KoinDependencies : KoinComponent {
    val pokedexRepository: PokedexRepository by inject()
}