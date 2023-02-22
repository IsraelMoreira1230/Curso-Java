package tipoprimitivos;

import javax.swing.JOptionPane;

public class repeticao15 {

  public static void main(String[] args) {
    int soma = 0;
    String numStr = JOptionPane.showInputDialog("Digite um número:");

    while (numStr != null && !numStr.isEmpty()) {
      int num = Integer.parseInt(numStr);
      if (num < 0) {
        break;
      }
      soma += num;
      numStr = JOptionPane.showInputDialog("Digite outro número (ou um número negativo para encerrar):");
    }

    JOptionPane.showMessageDialog(null, "A soma dos números digitados é: " + soma);
  }

}