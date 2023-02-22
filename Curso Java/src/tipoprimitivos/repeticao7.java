package tipoprimitivos;

import javax.swing.JOptionPane;

public class repeticao7 {

  public static void main(String[] args) {
    int numPessoas = 20;
    int idade;
    int somaIdades = 0;

    for (int i = 1; i <= numPessoas; i++) {
      String idadeStr = JOptionPane.showInputDialog("Digite a idade da pessoa " + i + ":");
      idade = Integer.parseInt(idadeStr);
      somaIdades += idade;
    }

    double mediaIdades = (double) somaIdades / numPessoas;

    JOptionPane.showMessageDialog(null, "A média das idades é: " + mediaIdades);
  }

}