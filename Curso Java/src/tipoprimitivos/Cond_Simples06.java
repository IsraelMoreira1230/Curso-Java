package tipoprimitivos;

import javax.swing.JOptionPane;

public class Cond_Simples06 {

  public static void main(String[] args) {
    int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o ano de seu nascimento?"));

    int anoAtual = 2022;
    int idade = anoAtual - anoNascimento;

    if (idade < 18) {
      int anosFaltando = 18 - idade;
      JOptionPane.showMessageDialog(null,
          "Você tem apenas " + idade + " anos. Faltam " + anosFaltando + " anos para o alistamento militar.");
    } else {
      int anosPassados = idade - 18;
      JOptionPane.showMessageDialog(null,
          "Você tem " + idade + " anos. Já se passaram " + anosPassados + " anos do alistamento militar.");
    }
  }

}