package tipoprimitivos;

import javax.swing.JOptionPane;

public class repeticao9 {

  public static void main(String[] args) {
    int numPessoas = 10;
    String nome;
    int idade;
    String nomeMaisNovo = "";
    int idadeMaisNova = Integer.MAX_VALUE;

    for (int i = 1; i <= numPessoas; i++) {
      nome = JOptionPane.showInputDialog("Digite o nome da pessoa " + i + ":");
      String idadeStr = JOptionPane.showInputDialog("Digite a idade da pessoa " + i + ":");
      idade = Integer.parseInt(idadeStr);

      if (idade < idadeMaisNova) {
        idadeMaisNova = idade;
        nomeMaisNovo = nome;
      }
    }

    JOptionPane.showMessageDialog(null, "A pessoa mais nova é: " + nomeMaisNovo);
  }

}