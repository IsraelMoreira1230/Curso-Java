package tipoprimitivos;

import javax.swing.JOptionPane;

public class Exercicio12 {

  public static void main(String[] args) {

    double preco, precoPromocional;

    preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco do produto:"));

    precoPromocional = preco - (preco * 0.05);

    JOptionPane.showMessageDialog(null, "Preco promocional: " + precoPromocional);

  }

}