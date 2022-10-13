package dk.jwillum.pokedex;

import dk.jwillum.pokedex.data.PokemonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PokedexApplication {

  public static void main(String[] args) {
    SpringApplication.run(PokedexApplication.class, args);
  }

}
