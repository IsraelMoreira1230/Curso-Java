package tipoprimitivos;

import javax.swing.JOptionPane;

public class repeticao8 {

  public static void main(String[] args) {
    int numPessoas = 20;
    int idade;
    int maioresDeIdade = 0;

    for (int i = 1; i <= numPessoas; i++) {
      String idadeStr = JOptionPane.showInputDialog("Digite a idade da pessoa " + i + ":");
      idade = Integer.parseInt(idadeStr);

      if (idade >= 18) {
        maioresDeIdade++;
      }
    }

    JOptionPane.showMessageDialog(null, "O número de pessoas maiores de idade é: " + maioresDeIdade);
  }

}