package tipoprimitivos;

import javax.swing.JOptionPane;

public class repeticao11 {

  public static void main(String[] args) {
    int numNumeros = 20;
    int contador = 0;

    for (int i = 1; i <= numNumeros; i++) {
      String numStr = JOptionPane.showInputDialog("Digite o número " + i + ":");
      int num = Integer.parseInt(numStr);

      if (num > 8) {
        contador++;
      }
    }

    JOptionPane.showMessageDialog(null, "Foram digitados " + contador + " números maiores do que 8.");
  }

}