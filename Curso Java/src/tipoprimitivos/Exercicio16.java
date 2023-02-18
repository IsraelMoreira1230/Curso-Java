package tipoprimitivos;

import javax.swing.JOptionPane;

public class Exercicio16 {

  public static void main(String[] args) {

    String input = JOptionPane.showInputDialog("Quantos cigarros você fuma por dia?");
    int cigarrosPorDia = Integer.parseInt(input);

    input = JOptionPane.showInputDialog("Quantos anos você fuma?");
    int anosFumados = Integer.parseInt(input);

    int totalCigarrosFumados = cigarrosPorDia * 365 * anosFumados;

    int reducaoDeVidaDias = totalCigarrosFumados * 10;

    JOptionPane.showMessageDialog(null, "A redução esperada da sua vida é de " + reducaoDeVidaDias + " dias.");
  }

}