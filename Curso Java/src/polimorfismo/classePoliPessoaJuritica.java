package polimorfismo;

public class classePoliPessoaJuritica {

  private String cnpj;

  public classePoliPessoaJuritica(String nome, String cnpj) {
    super();
    this.cnpj = cnpj;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public String toString() {
    return "Nome: " + getNome() + ", CNPJ: " + getCnpj();
  }

  private String getNome() {
    return null;
  }

}