package JavaOrientacaoObjeto;

public class Empregado_1 extends Pessoa {
  private int codigoSetor;
  private double salarioBase;
  private double imposto;

  // Construtor padrão
  public Empregado_1() {
    super();
  }

  // Construtor com todos os atributos
  public Empregado_1(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,
      double imposto) {
    super(nome, endereco, telefone);
    this.codigoSetor = codigoSetor;
    this.salarioBase = salarioBase;
    this.imposto = imposto;
  }

  public Empregado_1(String nome, String codigoSetor2, double salarioBase2, double imposto2) {
  }

  // Método getter para codigoSetor
  public int getCodigoSetor() {
    return codigoSetor;
  }

  // Método setter para codigoSetor
  public void setCodigoSetor(int codigoSetor) {
    this.codigoSetor = codigoSetor;
  }

  // Método getter para salarioBase
  public double getSalarioBase() {
    return salarioBase;
  }

  // Método setter para salarioBase
  public void setSalarioBase(double salarioBase) {
    this.salarioBase = salarioBase;
  }

  // Método getter para imposto
  public double getImposto() {
    return imposto;
  }

  // Método setter para imposto
  public void setImposto(double imposto) {
    this.imposto = imposto;
  }

  // Método calcularSalario
  public double calcularSalario() {
    return salarioBase * (1 - imposto);
  }
}

class TesteEmpregado {
  public static void main(String[] args) {
    Empregado_1 empregado = new Empregado_1("João Silva", "Rua Exemplo, 456", "(11) 9876-5432", 1, 5000, 0.1);

    System.out.println("Nome: " + empregado.getNome());
    System.out.println("Endereço: " + empregado.getEndereco());
    System.out.println("Telefone: " + empregado.getTelefone());
    System.out.println("Código do Setor: " + empregado.getCodigoSetor());
    System.out.println("Salário Base: " + empregado.getSalarioBase());
    System.out.println("Imposto: " + empregado.getImposto());
    System.out.println("Salário Líquido: " + empregado.calcularSalario());
  }
}