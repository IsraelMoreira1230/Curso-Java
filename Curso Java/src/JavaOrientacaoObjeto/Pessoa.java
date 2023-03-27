package JavaOrientacaoObjeto;

public class Pessoa {

  private String nome;
  private String endereco;
  private String telefone;

  // Construtor padrão
  public Pessoa() {
  }

  // Construtor com nome
  public Pessoa(String nome) {
    this.nome = nome;
  }

  // Construtor com nome, endereço e telefone
  public Pessoa(String nome, String endereco, String telefone) {
    this.nome = nome;
    this.endereco = endereco;
    this.telefone = telefone;
  }

  // Método getter para nome
  public String getNome() {
    return nome;
  }

  // Método setter para nome
  public void setNome(String nome) {
    this.nome = nome;
  }

  // Método getter para endereço
  public String getEndereco() {
    return endereco;
  }

  // Método setter para endereço
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  // Método getter para telefone
  public String getTelefone() {
    return telefone;
  }

  // Método setter para telefone
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public static Pessoa[] values() {
    return null;
  }

  public String getIdade() {
    return null;
  }

  public String getCasa() {
    return null;
  }

  public String getEmail() {
    return null;
  }

  public String getCidade() {
    return null;
  }

  public void setSobreNome(String string) {
  }

  public void setIdade(int i) {
  }

  public void setRg(String string) {
  }

  public void setCpf(String string) {
  }

}