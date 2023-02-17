package tipoprimitivos;

import java.util.Scanner;

public class ScannerEntradaDeDados {

  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.println("digite quantidade de pontos do líder do campeonato brasileiro de futebol  ");
      double pontosLider = scan.nextDouble();
      System.out.println("digite à quantidade de pontos do time lanterna ");
      double pontosLanterna = scan.nextDouble();
      double pontos;
      pontos = (pontosLider - pontosLanterna) / 3;

      System.out.println("Quantidade de vitoria necessaria é : " + pontos);
    }
  }
}