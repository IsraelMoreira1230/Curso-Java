package tipoprimitivos;

import javax.swing.JOptionPane;

public class repeticao14 {

  public static void main(String[] args) {
    int numNumeros = 20;
    int contadorIntervalo1 = 0;
    int contadorIntervalo2 = 0;
    int contadorMaior200 = 0;

    for (int i = 1; i <= numNumeros; i++) {
      String numStr = JOptionPane.showInputDialog("Digite o número " + i + ":");
      int num = Integer.parseInt(numStr);

      if (num >= 0 && num <= 100) {
        contadorIntervalo1++;
      } else if (num >= 101 && num <= 200) {
        contadorIntervalo2++;
      } else if (num > 200) {
        contadorMaior200++;
      }
    }

    JOptionPane.showMessageDialog(null, "Entre 0 e 100: " + contadorIntervalo1 +
        "\nEntre 101 e 200: " + contadorIntervalo2 + "\nMaior que 200: " + contadorMaior200);
  }

}