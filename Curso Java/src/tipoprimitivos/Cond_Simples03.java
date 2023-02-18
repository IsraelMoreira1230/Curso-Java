package tipoprimitivos;

import javax.swing.JOptionPane;

public class Cond_Simples03 {

  public static void main(String[] args) {

    String nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");

    float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota do aluno: "));
    float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota do aluno: "));

    float media = (nota1 + nota2) / 2;

    JOptionPane.showMessageDialog(null, "O aluno " + nome + " teve uma média de " + media);

    if (media >= 7) {
      JOptionPane.showMessageDialog(null, "O aluno " + nome + " teve um bom aproveitamento!");
    } else {
      JOptionPane.showMessageDialog(null, "O aluno " + nome + " teve um aproveitamento abaixo da média!");
    }

  }

}