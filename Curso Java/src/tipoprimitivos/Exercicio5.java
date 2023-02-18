package tipoprimitivos;

import javax.swing.JOptionPane;

public class Exercicio5 {

  public static void main(String[] args) {

    double nota1, nota2, media;

    nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
    nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));

    media = (nota1 + nota2) / 2;

    JOptionPane.showMessageDialog(null, "A média do aluno é: " + media);
  }

}