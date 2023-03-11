package JavaOrientacaoObjeto;

public class Ex_Data2 {

  public static void main(String[] args) {
    Data data1 = new Data(10, 3, 2023);
    System.out.println(data1); // 10/3/2023
    data1.avancarDia();
    System.out.println(data1); // 11/3/2023

    Data data2 = new Data(0, 0, 0);
    System.out.println(data2); // data atual do sistema
  }
}