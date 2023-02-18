package tipoprimitivos;

import java.util.Scanner;

public class Exercicios2 {
  public static void main(String[] args) {
    try (Scanner keyboard = new Scanner(System.in)) {
      System.out.print("Digite seu nome: ");
      String nome = keyboard.next();

      System.out.println("\nSeja bem-vindo(a), " + nome + "!");
    }
  }
}