package tipoprimitivos;

public class MetodoReplace {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // Metodo Replace
    String frase = "O cachorro faz auau, o gato miau e a galinha cocorico";

    System.out.println("Digite o valor procurado:");
    String procurado = scan.next();

    System.out.println("Digite o valor a ser substituido:");
    String asubstituido = scan.next();

    String fraseComSubstituicao = frase.replace(procurado, asubstituido);

    System.out.println("frase: " + frase);
    System.out.println("Frase com troca: " + fraseComSubstituicao);
  }

}