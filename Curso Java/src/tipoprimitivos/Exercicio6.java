package tipoprimitivos;

import javax.swing.JOptionPane;

public class Exercicio6 {

  public static void main(String[] args) {

    int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));

    int antecessor = numero - 1;
    int sucessor = numero + 1;

    JOptionPane.showMessageDialog(null,
        "O antecessor de " + numero + " é: " + antecessor + "\nO sucessor de " + numero + " é: " + sucessor);
  }
}