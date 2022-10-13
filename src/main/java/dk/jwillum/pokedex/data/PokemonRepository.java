package dk.jwillum.pokedex.data;

import dk.jwillum.pokedex.models.Pokemon;
import dk.jwillum.pokedex.models.PrimaryType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

@Repository
public class PokemonRepository {

  @Autowired
  JdbcTemplate template;

  public List<Pokemon> primaryTypes() {
    String sql = "SELECT primary_type,count(*) as IdCount FROM pokemon group by primary_type";
    RowMapper<Pokemon> rowMapper = new BeanPropertyRowMapper<>(Pokemon.class);
    return template.query(sql,rowMapper);
  }

  public List<PrimaryType> primaryType2() {
    List<PrimaryType> primaryList = new LinkedList<>();
    try{
      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pokedex",
          "root",
          "Bowie2018");
      PreparedStatement psts = conn.prepareStatement("SELECT primary_type,count(*) as IdCount FROM pokemon group by primary_type");
      ResultSet resultSet = psts.executeQuery();

      while (resultSet.next()) {
        String primaryType = resultSet.getString(1);
        int count = resultSet.getInt(2);
        primaryList.add(new PrimaryType(primaryType,count));

      }
    } catch (SQLException e) {
      System.out.println("Can't connect to database");
      e.printStackTrace();
    }
    return primaryList;
  }

  public void createPokemon(Pokemon p) {
    String sql = "INSERT INTO pokemon(name, speed,special_defence,special_attack,defence,attack,hp,primary_type,secondary_type) VALUES (?,?,?,?,?,?,?,?,?)";
    template.update(sql,p.getName(),p.getSpeed(), p.getSpecialDefence(),p.getSpecialAttack(),p.getDefence(),p.getAttack(),p.getHp(), p.getPrimaryType(), p.getSecondaryType());
  }


}
