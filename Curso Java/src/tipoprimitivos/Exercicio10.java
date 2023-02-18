package tipoprimitivos;

import javax.swing.JOptionPane;

public class Exercicio10 {

  public static void main(String[] args) {

    double largura = Double.parseDouble(JOptionPane.showInputDialog("Informe a largura da parede: "));
    double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura da parede: "));
    double areaParede = largura * altura;
    double litrosTinta = areaParede / 2;

    JOptionPane.showMessageDialog(null, "A área a ser pintada é de " + areaParede
        + "m² e a quantidade de tinta necessária é de " + litrosTinta + " litros.");

  }

}