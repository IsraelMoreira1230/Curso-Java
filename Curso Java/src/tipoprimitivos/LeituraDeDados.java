package tipoprimitivos;

import java.util.Scanner;

public class LeituraDeDados {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.println("Digite a sua Idade");
      int idade = scan.nextInt();

      System.out.println(" Você digitou: " + idade);

      System.out.println("Digite o tamanho da largura do seu terreno");
      double largura = scan.nextDouble();

      System.out.println(" Você digitou: " + largura);
    }
  }
}