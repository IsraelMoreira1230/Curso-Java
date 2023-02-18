package tipoprimitivos;

import javax.swing.JOptionPane;

public class Cond_Simples_Desafio {

  public static void main(String[] args) {
    double lado1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho do lado 1: "));
    double lado2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho do lado 2: "));
    double lado3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho do lado 3: "));

    if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
      JOptionPane.showMessageDialog(null, "É possível formar um triângulo com essas retas!");
    } else {
      JOptionPane.showMessageDialog(null, "Não é possível formar um triângulo com essas retas!");
    }
  }

}