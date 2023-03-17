package classeabstratas;

public class Gps {

  private String idioma;
  private String rota;

  public Gps(String string) {
  }

  public void GPS() {
    this.idioma = "";
    this.rota = "";
  }

  public void GPS(String rota) {
    this.idioma = "português";
    this.rota = rota;
  }

  public void definirIdioma(String idioma) {
    this.idioma = idioma;
  }

  public void definirRota(String rota) {
    this.rota = rota;
  }

  public void mostrar() {
    System.out.println("Idioma: " + this.idioma);
    System.out.println("Rota: " + this.rota);
  }

  public void setRota(String string) {
  }

  public void setIdioma(String string) {
  }

}