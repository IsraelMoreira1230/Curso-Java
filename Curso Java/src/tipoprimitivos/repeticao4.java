package tipoprimitivos;

import javax.swing.JOptionPane;

public class repeticao4 {
  public static void main(String[] args) {

    String nome = JOptionPane.showInputDialog("Digite seu nome: ");
    int N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

    for (int i = 0; i < N; i++) {
      System.out.println(nome);
    }
  }
}