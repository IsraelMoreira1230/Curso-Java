package tipoprimitivos;

import javax.swing.JOptionPane;

public class Cond_Simples01 {

  public static void main(String args[]) {
    double velocidade = Double.parseDouble(JOptionPane.showInputDialog("Qual a velocidade do carro?"));
    if (velocidade > 80.0) {
      double multa = (velocidade - 80.0) * 5;
      JOptionPane.showMessageDialog(null,
          "Você foi multado por exceder a velocidade permitida. Valor da multa: R$" + multa);
    }
  }

}