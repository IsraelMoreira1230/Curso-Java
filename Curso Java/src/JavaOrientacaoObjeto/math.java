package JavaOrientacaoObjeto;

public class math {

  public static double mymath(double pi, double x) {
    return pi * x;
  }

  public static void main(String[] args) {
    double pi = 3.14;
    double x = 2.0;
    double result = mymath(pi, x);
    System.out.println(result);
  }

}