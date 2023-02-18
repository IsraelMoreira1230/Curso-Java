package tipoprimitivos;

import javax.swing.JOptionPane;

public class Exercicio7 {

  public class Exercicio {

    public static void main(String[] args) {

      double numero, dobro, tercaParte;

      numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real:"));

      dobro = numero * 2;
      tercaParte = numero / 3;

      JOptionPane.showMessageDialog(null, "O dobro do número digitado é " + dobro + " e a terça parte é " + tercaParte);

    }

  }

}