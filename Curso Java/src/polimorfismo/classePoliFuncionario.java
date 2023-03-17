package polimorfismo;

public class classePoliFuncionario {

  // Atributos da classe Pessoa
  private String nome;
  private int idade;

  // Construtor da classe Pessoa
  public void Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  // Métodos da classe Pessoa
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  // Método que exibe os dados da pessoa
  public void exibeDados() {
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
  }
}
