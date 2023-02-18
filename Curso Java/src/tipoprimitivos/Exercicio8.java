package tipoprimitivos;

import javax.swing.JOptionPane;

public class Exercicio8 {

  public static void main(String[] args) {

    double metros, centimetros, milimetros, decimetros;

    metros = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em metros: "));

    centimetros = metros * 100;

    milimetros = metros * 1000;

    decimetros = metros * 10;

    JOptionPane.showMessageDialog(null, "Medida em metros: " + metros + "\n"
        + "Medida em centímetros: " + centimetros + "\n"
        + "Medida em milímetros: " + milimetros + "\n"
        + "Medida em decímetros: " + decimetros);

  }

}