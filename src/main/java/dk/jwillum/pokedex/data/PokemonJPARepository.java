package dk.jwillum.pokedex.data;

import dk.jwillum.pokedex.models.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonJPARepository extends JpaRepository<Pokemon, Long> {
}
