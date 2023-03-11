
public class App {
    public static void main(String[] args) throws Exception {
        // Metodo Subtring
        String telefone = " Telefone (21) 9 9999-9999";

        int indice = telefone.indexOf("(");
        String telefoneFormatado = telefone.substring(indice);
        System.out.println("telefone" + telefoneFormatado);

        // B | o | l | a | | d | e | | f | u | t | e | b | o | l |
        // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14
    }
}