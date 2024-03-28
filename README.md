# AND101 Project 5 - Choose Your Own API

Submitted by: Dinesha Shair

Time spent: 6 hours spent in total

## Summary

PokemonAPIfetching is an Android app designed to retrieve data from the PokeAPI using dynamic URLs like https://pokeapi.co/api/v2/pokemon/<pokemon_number>/, where <pokemon_number> can be any valid Pokemon number. 
The app fetches a JsonObject from this URL and extracts essential information such as the Pokemon's name, weight, type(s), and sprite for visual representation. 
Utilizing Glide, the app loads the image URL into the designated pokemonImageView. 
The core functionality lies in the "next" button, which increments the Pokemon number, triggering a data fetch operation each time to display information for the next Pokemon in line. 
This seamless process allows users to navigate through different Pokemon entries efficiently.

If I had to describe this project in three (3) emojis, they would be: **⚡️🤩📱**

## Application Features

<!-- (This is a comment) Please be sure to change the [ ] to [x] for any features you completed.  If a feature is not checked [x], you might miss the points for that item! -->

The following REQUIRED features are completed:

- [x] Make an API call to an API of your choice using AsyncHTTPClient
- [x] Display at least three (3) pieces of data for each API entry retrieved
- [x] A working Button requests a new API entry and updates the data displayed

The following STRETCH features are implemented:

- [ ] Add a query to the API request
  - The query I added is **FILL IN HERE**
- [ ] Build a UI to allow users to add that query

The following EXTRA features are implemented:

- [x] List anything else that you added to improve the app!
  - I have added a third textView 
## API Choice

My chosen API for this project is **enter here**.

## Video Demo

Here's a video / GIF that demos all of the app's implemented features:
<https://www.loom.com/share/ed79cba4e8784d188e20cef1bb7b74d6?sid=9cc285aa-0832-4e83-8523-d95928646e03/>




<img src='https://i.imgur.com/W5eD4l4.gif' title='Video Demo' width='' alt='Video Demo' />

GIF created with **loom**


## Notes


Through building this application, I've acquired the ability to interact with external APIs and handle JSON responses effectively. 
Utilizing Kotlin's JsonObject, I learned how to extract specific data fields using methods like getJsonObject() and getString(). 
This allowed me to retrieve essential information such as Pokémon names, types, and images from the PokeAPI. 
Additionally, I gained practical experience in populating UI components dynamically based on the fetched data, enhancing my understanding of Android app development. 
While encountering challenges such as network connectivity issues and unknown host error 
Overall, this project has significantly enhanced my proficiency in Kotlin programming and equipped me with valuable skills in mobile app development.

## License
Image at the beginning pokemonimg.webp was taken from an open source site.

Copyright Dinesha Shair

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
