package JavaOrientacaoObjeto;

import java.util.Calendar;
import java.util.Date;

public class Ex_Data {

  private int dia;
  private int mes;
  private int ano;

  public Ex_Data(int dia, int mes, int ano) {
    if (verificaData(dia, mes, ano)) {
      this.dia = dia;
      this.mes = mes;
      this.ano = ano;
    } else {
      throw new IllegalArgumentException("Data inválida.");
    }
  }

  public Ex_Data() {
    Date dataAtual = new Date();
    Calendar calendario = Calendar.getInstance();
    calendario.setTime(dataAtual);
    this.dia = calendario.get(Calendar.DAY_OF_MONTH);
    this.mes = calendario.get(Calendar.MONTH) + 1;
    this.ano = calendario.get(Calendar.YEAR);
  }

  public int getDia() {
    return dia;
  }

  public void setDia(int dia) {
    if (verificaData(dia, mes, ano)) {
      this.dia = dia;
    } else {
      throw new IllegalArgumentException("Data inválida.");
    }
  }

  public int getMes() {
    return mes;
  }

  public void setMes(int mes) {
    if (verificaData(dia, mes, ano)) {
      this.mes = mes;
    } else {
      throw new IllegalArgumentException("Data inválida.");
    }
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    if (verificaData(dia, mes, ano)) {
      this.ano = ano;
    } else {
      throw new IllegalArgumentException("Data inválida.");
    }
  }

  private boolean verificaData(int dia, int mes, int ano) {
    if (ano < 0 || mes < 1 || mes > 12 || dia < 1 || dia > diasNoMes(mes, ano)) {
      return false;
    } else {
      return true;
    }
  }

  private int diasNoMes(int mes, int ano) {
    switch (mes) {
      case 2:
        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
          return 29;
        } else {
          return 28;
        }
      case 4:
      case 6:
      case 9:
      case 11:
        return 30;
      default:
        return 31;
    }
  }

  @Override
  public String toString() {
    return String.format("%d/%d/%d", dia, mes, ano);
  }

  public void avancarDia() {
    if (dia == diasNoMes(mes, ano)) {
      dia = 1;
      if (mes == 12) {
        mes = 1;
        ano++;
      } else {
        mes++;
      }
    } else {
      dia++;
    }
  }
}