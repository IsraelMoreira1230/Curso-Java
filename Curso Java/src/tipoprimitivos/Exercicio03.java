package tipoprimitivos;

import java.util.Scanner;

public class Exercicio03 {

  public class exercicio03 {
    public static void main(String[] args) {
      try (Scanner scan = new Scanner(System.in)) {
        System.out.println("digite o numero correspondente ao mes ");
        int mes = scan.nextInt();
        if (mes >= 1 && mes <= 12) {
          if (mes == 1) {
            System.out.println("janeiro");
          }
          if (mes == 2) {
            System.out.println("fevereiro");
          }
          if (mes == 3) {
            System.out.println("março");
          }
          if (mes == 4) {
            System.out.println("Abril");
          }
          if (mes == 5) {
            System.out.println("maio");
          }
          if (mes == 6) {
            System.out.println("junho");
          }
          if (mes == 7) {
            System.out.println("julho");
          }
          if (mes == 8) {
            System.out.println("agosto");
          }
          if (mes == 9) {
            System.out.println("setembro");
          }
          if (mes == 10) {
            System.out.println("outubro");
          }
          if (mes == 11) {
            System.out.println("novembro");
          }
          if (mes == 12) {
            System.out.println("dezembro");
          }
        }
        if (mes < 1 || mes > 12) {
          System.out.println("mes invalido");
        }
      }
    }
  }

}