package JavaOrientacaoObjeto;

class Administrador extends Empregado_1 {
  private double ajudaDeCusto;

  public Administrador(String nome, String codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
    super(nome, codigoSetor, salarioBase, imposto);
    this.ajudaDeCusto = ajudaDeCusto;
  }

  public double getAjudaDeCusto() {
    return ajudaDeCusto;
  }

  public void setAjudaDeCusto(double ajudaDeCusto) {
    this.ajudaDeCusto = ajudaDeCusto;
  }

  @Override
  public double calcularSalario() {
    return super.calcularSalario() + ajudaDeCusto;
  }
}

class TesteAdministrador {
  public static void main(String[] args) {
    Administrador admin = new Administrador("João", "001", 5000, 0.1, 2000);
    System.out.println("Nome do Administrador: " + admin.getNome());
    System.out.println("Código do Setor: " + admin.getCodigoSetor());
    System.out.println("Salário Base: " + admin.getSalarioBase());
    System.out.println("Imposto: " + admin.getImposto());
    System.out.println("Ajuda de Custo: " + admin.getAjudaDeCusto());
    System.out.println("Salário do Administrador: " + admin.calcularSalario());
  }
}