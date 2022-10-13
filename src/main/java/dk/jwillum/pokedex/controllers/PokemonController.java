package dk.jwillum.pokedex.controllers;

import dk.jwillum.pokedex.models.Pokemon;
import dk.jwillum.pokedex.services.PokemonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class PokemonController {

  private final PokemonService pokemonService;

  public PokemonController(PokemonService pokemonService) {
    this.pokemonService = pokemonService;
  }

  @GetMapping
  public String getAllPokemons(Model model) {
    model.addAttribute("pokemons", pokemonService.getAllPokemons());
    return "pokemons";
  }

  @GetMapping("/primarytypes")
  public String getPrimaryTypes(Model model) {
    model.addAttribute("primarytypes", pokemonService.getPrimaryTypes());
    return "primarytypes";
  }

  @GetMapping("/create")
  public String showCreatePage() {
    return "create";
  }

  @PostMapping("/create")
  public String create(@ModelAttribute Pokemon pokemon) {
    pokemonService.createPokemon(pokemon);
    return "redirect:/";
  }

  @GetMapping("/update/{id}")
  public String update(@PathVariable("id")int id, Model model) {
    model.addAttribute("pokemon", pokemonService.getById(id));
    return "update";
  }

  @PostMapping("/update")
  public String updateNow(@ModelAttribute Pokemon pokemon) {
    pokemonService.savePokemon(pokemon);
    return"redirect:/";
  }

  @GetMapping("/delete/{id}")
  public String delete(@PathVariable("id")int id) {
    pokemonService.deletePokemon(id);
    return "redirect:/";
  }



}
