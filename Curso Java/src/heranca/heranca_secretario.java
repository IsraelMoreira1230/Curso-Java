package heranca;

public class heranca_secretario {

  protected String nome;
  protected String cpf;
  protected double salario;

  public heranca_secretario(String nome, String cpf, double salario) {
    this.nome = nome;
    this.cpf = cpf;
    this.salario = salario;
  }

  public String getNome() {
    return nome;
  }

  public String getCpf() {
    return cpf;
  }

  public double getSalario() {
    return salario;
  }
}