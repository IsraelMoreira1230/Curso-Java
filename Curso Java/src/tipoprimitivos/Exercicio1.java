package tipoprimitivos;

import java.util.Scanner;

public class Exercicio1 {
  public class Desconto {
    public static void main(String[] args) {
      try (Scanner scan = new Scanner(System.in)) {
        System.out.println("digite o valor do produto  ");
        double produto = scan.nextDouble();
        System.out.println("digite a porcentagem ");
        int porcentagem = scan.nextInt();
        double desconto;
        desconto = produto * porcentagem / 100;

        System.out.println("o valor do desconto " + desconto);
      }
    }
  }
}