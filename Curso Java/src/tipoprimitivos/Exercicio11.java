package tipoprimitivos;

import javax.swing.JOptionPane;

public class Exercicio11 {

  public static void main(String[] args) {

    double a, b, c, delta;

    a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A:"));
    b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B:"));
    c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C:"));

    delta = (b * b) - (4 * a * c);

    JOptionPane.showMessageDialog(null, "O valor de Delta é: " + delta);
  }

}