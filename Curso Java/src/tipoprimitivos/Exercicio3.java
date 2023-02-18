package tipoprimitivos;

import javax.swing.JOptionPane;

public class Exercicio3 {

  public static void main(String[] args) {
    String nome = JOptionPane.showInputDialog("Digite o nome do funcionário:");
    String salario = JOptionPane.showInputDialog("Digite o salário do funcionário:");

    JOptionPane.showMessageDialog(null, "O funcionário " + nome + " recebe o salário de R$" + salario + ".");
  }

}