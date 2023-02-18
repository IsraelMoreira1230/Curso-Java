package tipoprimitivos;

import javax.swing.JOptionPane;

public class Cond_Simples04 {

  public static void main(String[] args) {

    int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));

    if (numero % 2 == 0) {
      JOptionPane.showMessageDialog(null, "O número é PAR!");
    } else {
      JOptionPane.showMessageDialog(null, "O número é ÍMPAR!");
    }
  }
}