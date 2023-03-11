package JavaOrientacaoObjeto;

public class Ex_Empregado2 {

  public static void main(String[] args) {
    Empregado empregado1 = new Empregado("João", "Silva", 2000);
    Empregado empregado2 = new Empregado("Maria", "Santos", -1000);

    System.out.printf("%s %s tem salário anual de R$ %.2f%n", empregado1.getPrimeiroNome(),
        empregado1.getSobrenome(), empregado1.salarioAnual());
    System.out.printf("%s %s tem salário anual de R$ %.2f%n", empregado2.getPrimeiroNome(),
        empregado2.getSobrenome(), empregado2.salarioAnual());

    empregado1.aumentoSalario();
    empregado2.aumentoSalario();

    System.out.printf("%s %s tem salário anual de R$ %.2f%n", empregado1.getPrimeiroNome(),
        empregado1.getSobrenome(), empregado1.salarioAnual());
    System.out.printf("%s %s tem salário anual de R$ %.2f%n", empregado2.getPrimeiroNome(),
        empregado2.getSobrenome(), empregado2.salarioAnual());
  }
}
