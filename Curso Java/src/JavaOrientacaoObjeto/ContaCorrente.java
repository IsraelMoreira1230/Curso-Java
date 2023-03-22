package JavaOrientacaoObjeto;

public class ContaCorrente {

  protected double saldo;

  public ContaCorrente(double saldo) {
    this.saldo = saldo;
  }

  public void depositar(double valor) {
    this.saldo += valor;
  }

  public boolean sacar(double valor) {
    if (this.saldo >= valor) {
      this.saldo -= valor;
      return true;
    } else {
      return false;
    }
  }
}

class ContaEspecial extends ContaCorrente {
  private double limite;

  public ContaEspecial(double saldo, double limite) {
    super(saldo);
    this.limite = limite;
  }

  @Override
  public boolean sacar(double valor) {
    if (this.saldo + this.limite >= valor) {
      this.saldo -= valor;
      return true;
    } else {
      return false;
    }
  }

}