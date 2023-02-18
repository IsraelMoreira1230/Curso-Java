package tipoprimitivos;

import javax.swing.JOptionPane;

public class Cond_Simple08 {

  public static void main(String[] args) {

    double distancia = Double
        .parseDouble(JOptionPane.showInputDialog("Informe a distância que deseja percorrer (Km): "));
    double preco;

    if (distancia <= 200) {
      preco = distancia * 0.50;
    } else {
      preco = distancia * 0.45;
    }

    JOptionPane.showMessageDialog(null, "O preço da passagem é: R$" + preco);
  }

}