package tipoprimitivos;

import javax.swing.JOptionPane;

public class Cond_Simples02 {

  public static void main(String[] args) {
    int anoNascimento;
    int idade;
    String voto;

    anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento:"));
    idade = 2022 - anoNascimento;

    if (idade >= 16) {
      voto = "Você pode votar!";
    } else {
      voto = "Você não pode votar!";
    }

    JOptionPane.showMessageDialog(null, "Você tem " + idade + " anos. " + voto);
  }

}
