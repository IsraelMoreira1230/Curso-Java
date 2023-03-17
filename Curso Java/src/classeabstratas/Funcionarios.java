package classeabstratas;

public abstract class Funcionarios {

  public static void main(String[] args) {

  }

  public Funcionarios(String nome, String matricula, double salario_base) {
  }

  public abstract double calculaSalario();

  public class Gerente extends Funcionarios {
    public Gerente(String nome, String matricula, double salario_base) {
      super(nome, matricula, salario_base);
    }

    @Override
    public double calculaSalario() {
      return getSalario_base() * 2;
    }
  }

  public class Assistente extends Funcionarios {
    public Assistente(String nome, String matricula, double salario_base) {
      super(nome, matricula, salario_base);
    }

    @Override
    public double calculaSalario() {
      return getSalario_base();
    }
  }

  public int getSalario_base() {
    return 0;
  }

}
