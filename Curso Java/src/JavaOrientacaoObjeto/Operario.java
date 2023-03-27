package JavaOrientacaoObjeto;

class Operario extends Empregado_1 {
  private double valorProducao;
  private double comissao;

  public Operario(String nome, String codigoSetor, double salarioBase, double imposto, double valorProducao,
      double comissao) {
    super(nome, codigoSetor, salarioBase, imposto);
    this.valorProducao = valorProducao;
    this.comissao = comissao;
  }

  public double getValorProducao() {
    return valorProducao;
  }

  public void setValorProducao(double valorProducao) {
    this.valorProducao = valorProducao;
  }

  public double getComissao() {
    return comissao;
  }

  public void setComissao(double comissao) {
    this.comissao = comissao;
  }

  @Override
  public double calcularSalario() {
    return super.calcularSalario() + (valorProducao * comissao);
  }
}

class TesteOperario {
  public static void main(String[] args) {
    Operario operario = new Operario("Maria", "002", 3000, 0.1, 10000, 0.05);
    System.out.println("Nome do Operario: " + operario.getNome());
    System.out.println("Código do Setor: " + operario.getCodigoSetor());
    System.out.println("Salário Base: " + operario.getSalarioBase());
    System.out.println("Imposto: " + operario.getImposto());
    System.out.println("Valor de Produção: " + operario.getValorProducao());
    System.out.println("Comissão: " + operario.getComissao());
    System.out.println("Salário do Operario: " + operario.calcularSalario());
  }
}