<h1 align="center">Pokedex</h1>

<p align="center">
  <a href="https://opensource.org/licenses/Apache-2.0"><img alt="License" src="https://img.shields.io/badge/License-Apache%202.0-blue.svg"/></a>
</p>

<p align="center">
This repository contains a Kotlin Multiplatform project to help you learn about multi-platform development.

> [!TIP]
> If you want to see the application for different platforms, check out the [iOS](https://github.com/neyogiry/iOS-Pokedex) | [Android](https://github.com/neyogiry/Android-Pokedex) | [Flutter](https://github.com/neyogiry/Flutter-Pokedex) repositories.

### Status: 🚧 In progress
Pokedex is still in under development, and some features are not yet implemented.

## Project structure
The Kotlin Multiplatform project includes three modules:
- ***shared*** is a Kotlin module that contains the logic common for both Android and iOS applications – the code I share between platforms. It uses Gradle as the build system to help automate the build process.
- ***composeApp*** is a Kotlin module that builds into an Android application. It uses Gradle as the build system. The composeApp module depends on and uses the shared module as a regular Android library.
- ***iosApp*** is an Xcode project that builds into an iOS application. It depends on and uses the shared module as an iOS framework. The shared module can be used as a regular framework or as a CocoaPods dependency.

## Requirements
Kotlin: 2.0.10 <br>
Android Gradle Plugin: 8.2.2 <br>

## API
<img src="https://user-images.githubusercontent.com/24237865/83422649-d1b1d980-a464-11ea-8c91-a24fdf89cd6b.png" align="right" width="21%"/>

These sample Pokedex apps use [PokeAPI](https://pokeapi.co/).<br>
This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.

## Find this repository useful? ♥️
Support it by joining __[neyogiry](https://github.com/neyogiry/KMM-Pokedex/stargazers)__ for this repository. 🌟 <br>
Also, __[follow me](https://github.com/neyogiry)__ on GitHub for more content! 👨‍💻

# License
```xml
Copyright 2024 Designed and developed by neyogiry

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements. See the NOTICE file distributed with this work for
additional information regarding copyright ownership. The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License. You may obtain a copy of
the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
License for the specific language governing permissions and limitations under
the License.
```
