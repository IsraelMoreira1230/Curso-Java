package classeabstratas;

public class Funcionario {

  public class Vendedor extends Funcionarios {
    private double comissao;

    public Vendedor(String nome, String matricula, double salario_base, double comissao) {
      super(nome, matricula, salario_base);
      this.comissao = comissao;
    }

    @Override
    public double calculaSalario() {
      return getSalario_base() + comissao;
    }
  }

  public int getSalario_base() {
    return 0;
  }

}
