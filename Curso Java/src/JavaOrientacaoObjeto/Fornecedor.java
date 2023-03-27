package JavaOrientacaoObjeto;

public class Fornecedor extends Pessoa {
  private double valorCredito;
  private double valorDivida;

  // Construtor padrão
  public Fornecedor() {
    super();
  }

  // Construtor com todos os atributos
  public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
    super(nome, endereco, telefone);
    this.valorCredito = valorCredito;
    this.valorDivida = valorDivida;
  }

  // Método getter para valorCredito
  public double getValorCredito() {
    return valorCredito;
  }

  // Método setter para valorCredito
  public void setValorCredito(double valorCredito) {
    this.valorCredito = valorCredito;
  }

  // Método getter para valorDivida
  public double getValorDivida() {
    return valorDivida;
  }

  // Método setter para valorDivida
  public void setValorDivida(double valorDivida) {
    this.valorDivida = valorDivida;
  }

  // Método obterSaldo
  public double obterSaldo() {
    return valorCredito - valorDivida;
  }
}

class TesteFornecedor {
  public static void main(String[] args) {
    Fornecedor fornecedor = new Fornecedor("Nome da Empresa", "Rua Exemplo, 123", "(11) 1234-5678", 10000, 2000);

    System.out.println("Nome: " + fornecedor.getNome());
    System.out.println("Endereço: " + fornecedor.getEndereco());
    System.out.println("Telefone: " + fornecedor.getTelefone());
    System.out.println("Valor Crédito: " + fornecedor.getValorCredito());
    System.out.println("Valor Dívida: " + fornecedor.getValorDivida());
    System.out.println("Saldo: " + fornecedor.obterSaldo());
  }
}