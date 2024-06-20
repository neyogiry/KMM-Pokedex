package di

import org.koin.core.context.startKoin
import org.koin.dsl.module

val sharedModule = module {  }

fun initKoin() {
    startKoin {
        modules(sharedModule)
    }
}