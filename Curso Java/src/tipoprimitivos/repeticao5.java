package tipoprimitivos;

import java.util.Scanner;

public class repeticao5 {

  public static void main(String[] args) {

    try (Scanner leitor = new Scanner(System.in)) {
      int soma = 0; // Declarando a variável para soma

      // Lendo 10 números
      for (int i = 0; i < 10; i++) {
        System.out.println("Digite o " + (i + 1) + "º número:");
        soma += leitor.nextInt(); // Somando o número lido
      }

      // Imprimindo o resultado
      System.out.println("A soma dos números é: " + soma);
    }
  }
}