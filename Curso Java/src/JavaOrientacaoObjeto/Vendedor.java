package JavaOrientacaoObjeto;

class Vendedor extends Empregado_1 {
  private double valorVendas;
  private double comissao;

  public Vendedor(String nome, String codigoSetor, double salarioBase, double imposto, double valorVendas,
      double comissao) {
    super(nome, codigoSetor, salarioBase, imposto);
    this.valorVendas = valorVendas;
    this.comissao = comissao;
  }

  public double getValorVendas() {
    return valorVendas;
  }

  public void setValorVendas(double valorVendas) {
    this.valorVendas = valorVendas;
  }

  public double getComissao() {
    return comissao;
  }

  public void setComissao(double comissao) {
    this.comissao = comissao;
  }

  @Override
  public double calcularSalario() {
    return super.calcularSalario() + (valorVendas * comissao);
  }
}

class TesteVendedor {
  public static void main(String[] args) {
    Vendedor vendedor = new Vendedor("João", "001", 2000, 0.1, 5000, 0.05);
    System.out.println("Nome do Vendedor: " + vendedor.getNome());
    System.out.println("Código do Setor: " + vendedor.getCodigoSetor());
    System.out.println("Salário Base: " + vendedor.getSalarioBase());
    System.out.println("Imposto: " + vendedor.getImposto());
    System.out.println("Valor de Vendas: " + vendedor.getValorVendas());
    System.out.println("Comissão: " + vendedor.getComissao());
    System.out.println("Salário do Vendedor: " + vendedor.calcularSalario());
  }
}