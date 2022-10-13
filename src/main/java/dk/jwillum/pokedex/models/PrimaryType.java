package dk.jwillum.pokedex.models;

public class PrimaryType {
  private String primaryType;
  private int count;

  public PrimaryType(String primaryType, int count) {
    this.primaryType = primaryType;
    this.count = count;
  }

  public PrimaryType() {
  }

  public String getPrimaryType() {
    return primaryType;
  }

  public void setPrimaryType(String primaryType) {
    this.primaryType = primaryType;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  @Override
  public String toString() {
    return "PrimaryType{" +
        "primaryType='" + primaryType + '\'' +
        ", count=" + count +
        '}';
  }
}
