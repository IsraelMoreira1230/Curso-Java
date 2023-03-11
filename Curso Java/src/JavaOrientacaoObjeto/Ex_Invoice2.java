package JavaOrientacaoObjeto;

public class Ex_Invoice2 {
  public static void main(String[] args) {
    Invoice fatura = new Invoice(1234, "Teclado", 2, 50.0);

    System.out.println("Número do item: " + fatura.getNumeroItem());
    System.out.println("Descrição do item: " + fatura.getDescricaoItem());
    System.out.println("Quantidade comprada: " + fatura.getQuantidadeComprada());
    System.out.println("Preço unitário: " + fatura.getPrecoUnitario());
    System.out.println("Valor da fatura: " + fatura.getInvoiceAmount());

    fatura.setQuantidadeComprada(3);
    fatura.setPrecoUnitario(60.0);

    System.out.println("Quantidade comprada: " + fatura.getQuantidadeComprada());
    System.out.println("Preço unitário: " + fatura.getPrecoUnitario());
    System.out.println("Valor da fatura: " + fatura.getInvoiceAmount());
  }

}
