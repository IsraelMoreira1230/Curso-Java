package JavaOrientacaoObjeto;

import java.util.ArrayList;

public class Pais {
  private String codigoISO;
  private String nome;
  private int populacao;
  private double dimensao;
  private ArrayList<Pais> fronteiras;

  public Pais(String codigoISO, String nome, int populacao, double dimensao) {
    this.codigoISO = codigoISO;
    this.nome = nome;
    this.populacao = populacao;
    this.dimensao = dimensao;
    this.fronteiras = new ArrayList<>();
  }

  public String getCodigoISO() {
    return codigoISO;
  }

  public void setCodigoISO(String codigoISO) {
    this.codigoISO = codigoISO;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getPopulacao() {
    return populacao;
  }

  public void setPopulacao(int populacao) {
    this.populacao = populacao;
  }

  public double getDimensao() {
    return dimensao;
  }

  public void setDimensao(double dimensao) {
    this.dimensao = dimensao;
  }

  public ArrayList<Pais> getFronteiras() {
    return fronteiras;
  }

  public void setFronteiras(ArrayList<Pais> fronteiras) {
    this.fronteiras = fronteiras;
  }

  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof Pais)) {
      return false;
    }
    Pais outro = (Pais) obj;
    return this.codigoISO.equals(outro.getCodigoISO());
  }

  public boolean ehLimitrofe(Pais outro) {
    return this.fronteiras.contains(outro);
  }

  public double getDensidadePopulacional() {
    return this.populacao / this.dimensao;
  }

  public ArrayList<Pais> vizinhosComuns(Pais outro) {
    ArrayList<Pais> comuns = new ArrayList<>(this.fronteiras);
    comuns.retainAll(outro.getFronteiras());
    return comuns;
  }
}

class TestePais {
  public static void main(String[] args) {
    // Criando alguns países
    Pais brasil = new Pais("BRA", "Brasil", 211000000, 8515767.049);
    Pais argentina = new Pais("ARG", "Argentina", 45000000, 2780400);
    Pais uruguai = new Pais("URY", "Uruguai", 3400000, 176215);

    // Adicionando fronteiras
    brasil.getFronteiras().add(argentina);
    brasil.getFronteiras().add(uruguai);
    argentina.getFronteiras().add(brasil);
    uruguai.getFronteiras().add(brasil);

    // Testando métodos
    System.out.println(brasil.equals(argentina)); // false
    System.out.println(brasil.equals(new Pais("BRA", "Outro país", 1000000, 1000000))); // true
    System.out.println(brasil.ehLimitrofe(uruguai));

  }

}