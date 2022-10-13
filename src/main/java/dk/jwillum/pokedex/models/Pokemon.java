package dk.jwillum.pokedex.models;

import javax.persistence.*;

@Entity
@Table(name="POKEMON")
public class Pokemon {

  @Id
  @Column(name="POKEDEX_NUMBER")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "NAME")
  private String name;

  @Column(name = "SPEED")
  private int speed;

  @Column(name = "SPECIAL_DEFENCE")
  private int specialDefence;

  @Column(name = "SPECIAL_ATTACK")
  private int specialAttack;

  @Column(name = "DEFENCE")
  private int defence;

  @Column(name = "ATTACK")
  private int attack;

  @Column(name = "HP")
  private int hp;

  @Column(name = "PRIMARY_TYPE")
  private String primaryType;

  @Column(name = "SECONDARY_TYPE")
  private String secondaryType;


  public Pokemon() {
  }

  public Pokemon(long id, String name, int speed, int specialDefence, int specialAttack,
                 int defence, int attack, int hp, String primaryType, String secondaryType) {
    this.id = id;
    this.name = name;
    this.speed = speed;
    this.specialDefence = specialDefence;
    this.specialAttack = specialAttack;
    this.defence = defence;
    this.attack = attack;
    this.hp = hp;
    this.primaryType = primaryType;
    this.secondaryType = secondaryType;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public int getSpecialDefence() {
    return specialDefence;
  }

  public void setSpecialDefence(int specialDefence) {
    this.specialDefence = specialDefence;
  }

  public int getSpecialAttack() {
    return specialAttack;
  }

  public void setSpecialAttack(int specialAttack) {
    this.specialAttack = specialAttack;
  }

  public int getDefence() {
    return defence;
  }

  public void setDefence(int defence) {
    this.defence = defence;
  }

  public int getAttack() {
    return attack;
  }

  public void setAttack(int attack) {
    this.attack = attack;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public String getPrimaryType() {
    return primaryType;
  }

  public void setPrimaryType(String primaryType) {
    this.primaryType = primaryType;
  }

  public String getSecondaryType() {
    return secondaryType;
  }

  public void setSecondaryType(String secondaryType) {
    this.secondaryType = secondaryType;
  }

}
