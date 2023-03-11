package JavaOrientacaoObjeto;

public class Ex_Invoice {

  private int numeroItem;
  private String descricaoItem;
  private int quantidadeComprada;
  private double precoUnitario;

  public Ex_Invoice(int numeroItem, String descricaoItem, int quantidadeComprada, double precoUnitario) {
    this.numeroItem = numeroItem;
    this.descricaoItem = descricaoItem;
    this.quantidadeComprada = quantidadeComprada < 0 ? 0 : quantidadeComprada;
    this.precoUnitario = precoUnitario < 0 ? 0.0 : precoUnitario;
  }

  public int getNumeroItem() {
    return numeroItem;
  }

  public void setNumeroItem(int numeroItem) {
    this.numeroItem = numeroItem;
  }

  public String getDescricaoItem() {
    return descricaoItem;
  }

  public void setDescricaoItem(String descricaoItem) {
    this.descricaoItem = descricaoItem;
  }

  public int getQuantidadeComprada() {
    return quantidadeComprada;
  }

  public void setQuantidadeComprada(int quantidadeComprada) {
    this.quantidadeComprada = quantidadeComprada < 0 ? 0 : quantidadeComprada;
  }

  public double getPrecoUnitario() {
    return precoUnitario;
  }

  public void setPrecoUnitario(double precoUnitario) {
    this.precoUnitario = precoUnitario < 0 ? 0.0 : precoUnitario;
  }

  public double getInvoiceAmount() {
    return quantidadeComprada * precoUnitario;
  }
}