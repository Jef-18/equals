public class Pessoa {

  public Pessoa(String nome, String rg) {
    this.nome = nome;
    this.rg = rg;

  }

  private String nome;
  private String rg;

  // getters
  public String getNome() {
    return nome;
  }

  public String getRg() {
    return nome;
  }

  // setters
  public String setNome() {
    return rg;
  }

  public String setRg() {
    return rg;
  }

  @Override 
  public String toString() {
    return " [ " + this.nome + " - " + this.rg + " ] ";
  }

}
