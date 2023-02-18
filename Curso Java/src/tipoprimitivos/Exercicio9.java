package tipoprimitivos;

import javax.swing.JOptionPane;

public class Exercicio9 {
  public static void main(String[] args) {
    double cotacao, dinheiro, dolar;
    String aux;

    aux = JOptionPane.showInputDialog("Digite a cotação do dólar:");
    cotacao = Double.parseDouble(aux);

    aux = JOptionPane.showInputDialog("Quanto dinheiro você tem na carteira (em reais)?");
    dinheiro = Double.parseDouble(aux);

    dolar = dinheiro / cotacao;

    JOptionPane.showMessageDialog(null, "Você pode comprar " + dolar + " dólares");
  }
}