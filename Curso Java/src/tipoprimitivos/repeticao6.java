package tipoprimitivos;

import javax.swing.JOptionPane;

public class repeticao6 {

  public static void main(String[] args) {

    int idade, somaIdades = 0;

    for (int i = 1; i <= 20; i++) {

      idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da " + i + "ª pessoa:"));
      somaIdades += idade;
    }

    JOptionPane.showMessageDialog(null, "A soma das idades é: " + somaIdades);

  }

}
