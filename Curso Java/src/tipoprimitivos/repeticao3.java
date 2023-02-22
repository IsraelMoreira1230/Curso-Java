package tipoprimitivos;

import java.util.Scanner;

public class repeticao3 {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Digite seu nome: ");
      String nome = scanner.nextLine();

      for (int i = 0; i < 10; i++) {
        System.out.println(nome);
      }
    }
  }

}