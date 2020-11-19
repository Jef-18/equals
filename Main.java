class Main {

  public static void main(String[] args) {

    Pessoa pessoa_1 = new Pessoa("Paulo Lemos", "0000");
    Pessoa pessoa_2 = new Pessoa("Paulo Lemos", "0000");

    System.out.println("\n São iguais? " + (pessoa_1.equals(pessoa_2)));
    System.out.println(" Pessoa_1: " + pessoa_1);
    System.out.println(" Pessoa_2: " + pessoa_2);

  }
}
