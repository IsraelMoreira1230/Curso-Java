package JavaOrientacaoObjeto;

class Ingresso {
  private double valor;

  public Ingresso(double valor) {
    this.valor = valor;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public String toString() {
    return "Ingresso com valor de R$ " + valor;
  }
}

class IngressoVIP extends Ingresso {
  private double valorAdicional;

  public IngressoVIP(double valor, double valorAdicional) {
    super(valor);
    this.valorAdicional = valorAdicional;
  }

  public double getValorAdicional() {
    return valorAdicional;
  }

  public void setValorAdicional(double valorAdicional) {
    this.valorAdicional = valorAdicional;
  }

  public String toString() {
    return "Ingresso VIP com valor de R$ " + (super.getValor() + valorAdicional);
  }
}

class TesteIngresso {
  public static void main(String[] args) {
    Ingresso i1 = new Ingresso(50);
    IngressoVIP iv1 = new IngressoVIP(50, 20);

    System.out.println(i1);
    System.out.println(iv1);
  }
}