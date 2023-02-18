package tipoprimitivos;

import javax.swing.JOptionPane;

public class Exercicio13 {

  public static void main(String[] args) {

    double salario, novoSalario;

    salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário:"));

    novoSalario = salario + (salario * 0.15);

    JOptionPane.showMessageDialog(null, "O salário do funcionário com 15% de aumento é de: R$ " + novoSalario);
  }

}