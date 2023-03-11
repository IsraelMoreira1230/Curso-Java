package JavaOrientacaoObjeto;

public class OrientacaoObjeto {

  String modelo;
  String fabricante;
  String cor;
  int qtdPortas;
  int potenciaCavalos;
  int qtdMarchas;
  boolean temArCondicionado;
  boolean estaligado;

  public void liga(boolean estaligado) {

    if (estaligado == false) {
      this.estaligado = true;
    }
  }

}