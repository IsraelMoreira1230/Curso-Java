package JavaOrientacaoObjeto;

public class FonedeOuvido {

  int volume;
  int conecta;

  public void aumentaVolume() {
    volume++;
  }

  public void diminuiVolume() {
    volume--;
  }

  public void semfio(int c) {
    conecta = c;
  }

  public void mostraInfo() {
    System.out.println("Volume: " + volume + "Conecta: " + conecta);
  }

}