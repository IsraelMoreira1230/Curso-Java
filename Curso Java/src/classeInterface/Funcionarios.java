package classeInterface;

public class Funcionarios {

  public interface Funcionario {
    public double calcularSalario();
  }

  public abstract class FuncionarioBase implements Funcionario {
    protected String nome;
    protected double salario;

    public FuncionarioBase(String nome, double salario) {
      this.nome = nome;
      this.salario = salario;
    }

    public String getNome() {
      return nome;
    }

    public double getSalario() {
      return salario;
    }
  }

  public class Gerente extends FuncionarioBase {
    private double bonus;

    public Gerente(String nome, double salario, double bonus) {
      super(nome, salario);
      this.bonus = bonus;
    }

    public double getBonus() {
      return bonus;
    }

    public double calcularSalario() {
      return salario + bonus;
    }
  }

  public class Assistente extends FuncionarioBase {
    public Assistente(String nome, double salario) {
      super(nome, salario);
    }

    public double calcularSalario() {
      return salario;
    }
  }

  public class Vendedor extends FuncionarioBase {
    private double comissao;

    public Vendedor(String nome, double salario, double comissao) {
      super(nome, salario);
      this.comissao = comissao;
    }

    public double getComissao() {
      return comissao;
    }

    public double calcularSalario() {
      return salario + comissao;
    }
  }

}