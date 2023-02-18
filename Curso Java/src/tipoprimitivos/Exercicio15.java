package tipoprimitivos;

import javax.swing.JOptionPane;

public class Exercicio15 {

  public static void main(String[] args) {

    String dias = JOptionPane.showInputDialog("Quantos dias o funcionário trabalhou no mês?");
    int diasTrabalhados = Integer.parseInt(dias);

    double salario = diasTrabalhados * 8 * 25;

    JOptionPane.showMessageDialog(null, "O salário do funcionário é de R$" + salario);

  }

}