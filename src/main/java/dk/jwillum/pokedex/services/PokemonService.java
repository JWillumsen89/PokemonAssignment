package dk.jwillum.pokedex.services;

import dk.jwillum.pokedex.data.PokemonJPARepository;
import dk.jwillum.pokedex.data.PokemonRepository;
import dk.jwillum.pokedex.models.Pokemon;
import dk.jwillum.pokedex.models.PrimaryType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PokemonService {
  private static final List<Pokemon> pokemons = new ArrayList<>();

  private final PokemonRepository pokemonRepository;
  private final PokemonJPARepository pokemonJPARepository;

  public PokemonService(PokemonRepository pokemonRepository, PokemonJPARepository pokemonJPARepository) {
    this.pokemonRepository = pokemonRepository;
    this.pokemonJPARepository = pokemonJPARepository;
  }

  public List<Pokemon> getAllPokemons() {
    return pokemonJPARepository.findAll();
  }

  public Pokemon getById(long id) {
    return pokemonJPARepository.findById(id).get();
  }

  public List<PrimaryType> getPrimaryTypes() {
    return pokemonRepository.primaryType2();
  }

  public void createPokemon(Pokemon pokemon) {
    pokemonRepository.createPokemon(pokemon);
  }

  public void savePokemon(Pokemon pokemon) {
    pokemonJPARepository.save(pokemon);
  }
  public void deletePokemon(int id) {
    pokemonJPARepository.deleteById((long) id);
  }
}
