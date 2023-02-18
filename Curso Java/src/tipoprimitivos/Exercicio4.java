package tipoprimitivos;

import javax.swing.JOptionPane;

public class Exercicio4 {

  public static void main(String[] args) {
    int num1, num2, soma;
    num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
    num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
    soma = num1 + num2;
    JOptionPane.showMessageDialog(null, "A soma dos números é: " + soma);
  }

}