package tipoprimitivos;

import javax.swing.JOptionPane;

public class AulaExcecoes {

  public static void main(String[] args) {

    double resultado = 0.00;

    try {

      int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
      int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
      Double.parseDouble(null);
      resultado = valor1 / valor2;

    } catch (ArithmeticException e) {
      JOptionPane.showMessageDialog(null, "Erro" + e.getMessage());
    } catch (NumberFormatException e) {
      JOptionPane.showMessageDialog(null, "Erro! Você não digitou um valor válido");
    } finally {
      Scan.close();
    }
    System.out.println("Resultado:" + resultado);

  }

}