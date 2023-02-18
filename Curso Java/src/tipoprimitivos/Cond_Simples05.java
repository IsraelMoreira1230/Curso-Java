package tipoprimitivos;

import javax.swing.JOptionPane;

public class Cond_Simples05 {

  public static void main(String[] args) {

    int ano;
    String msg;

    ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano: "));

    if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
      msg = "O ano de " + ano + " é BISSEXTO.";
    } else {
      msg = "O ano de " + ano + " não é BISSEXTO.";
    }

    JOptionPane.showMessageDialog(null, msg);
  }

}