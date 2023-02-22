package tipoprimitivos;

import javax.swing.JOptionPane;

public class repeticao10 {

  public static void main(String[] args) {
    String numStr = JOptionPane.showInputDialog("Digite um número para a tabuada:");
    int num = Integer.parseInt(numStr);

    String tabuada = "";
    for (int i = 1; i <= 10; i++) {
      int resultado = num * i;
      tabuada += num + " x " + i + " = " + resultado + "\n";
    }

    JOptionPane.showMessageDialog(null, "A tabuada de " + num + " é:\n" + tabuada);
  }

}