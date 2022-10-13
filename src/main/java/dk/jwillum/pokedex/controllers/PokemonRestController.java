package dk.jwillum.pokedex.controllers;


import dk.jwillum.pokedex.models.Pokemon;
import dk.jwillum.pokedex.services.PokemonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pokemons")
public class PokemonRestController {

  private final PokemonService pokemonService;

  public PokemonRestController(PokemonService pokemonService) {
    this.pokemonService = pokemonService;
  }

  @GetMapping
  public List<Pokemon> getAllPokemons() {
    return pokemonService.getAllPokemons();
  }
}
