package classeabstratas;

public class Gps2 {

  public static void main(String[] args) {
    Gps gps1 = new Gps(null);
    Gps gps2 = new Gps("Rua A, nº 123");

    gps1.setIdioma("Inglês");
    gps1.setRota("Avenida B, nº 456");

    gps1.mostrar();
    System.out.println();
    gps2.mostrar();
  }

}