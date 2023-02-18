package tipoprimitivos;

import javax.swing.JOptionPane;

public class Cond_Simples07 {

  public static void main(String[] args) {

    // Declaração de variáveis
    String nome, sexo;
    double valor, desconto, total;

    // Entrada de dados
    nome = JOptionPane.showInputDialog("Digite seu nome: ");
    sexo = JOptionPane.showInputDialog("Digite seu sexo (M ou F): ");
    valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor das compras: "));

    // Processamento
    if (sexo.equalsIgnoreCase("F")) {
      desconto = valor * 0.13;
      total = valor - desconto;
      JOptionPane.showMessageDialog(null,
          "Olá, " + nome + "! \nVocê ganhou 13% de desconto. \nValor final: R$ " + total);
    } else if (sexo.equalsIgnoreCase("M")) {
      desconto = valor * 0.05;
      total = valor - desconto;
      JOptionPane.showMessageDialog(null,
          "Olá, " + nome + "! \nVocê ganhou 5% de desconto. \nValor final: R$ " + total);
    }

  }

}