package polimorfismo;

public class classePoliPessoaFisica {

  private String nome;
  private String cpf;

  public void PessoaFisica(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }

  public void imprimirDados() {
    System.out.println("Nome: " + nome);
    System.out.println("CPF: " + cpf);
  }

}