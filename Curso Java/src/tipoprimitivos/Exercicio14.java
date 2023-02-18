package tipoprimitivos;

import javax.swing.JOptionPane;

public class Exercicio14 {

  public static void main(String[] args) {

    double kmPercorridos, diasAlugados, precoTotal;

    kmPercorridos = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de Km percorridos:"));
    diasAlugados = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de dias alugados:"));

    precoTotal = (diasAlugados * 90) + (kmPercorridos * 0.20);

    JOptionPane.showMessageDialog(null, "O valor total a ser pago é de R$" + precoTotal);
  }

}