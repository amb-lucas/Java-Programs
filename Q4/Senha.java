import java.io.*;
import java.util.*;

public class Senha {
  protected String alfanumerica;
  protected int numerica;

  public Senha(String alfanumerica, int numerica) {
    this.alfanumerica = alfanumerica;
    this.numerica = numerica;
  }

  public void setAlfanumerica(String alfanumerica) { this.alfanumerica = alfanumerica; }
  public String getAlfanumerica() { return this.alfanumerica; }

  public void setNumerica(int numerica) { this.numerica = numerica; }
  public int getNumerica() { return this.numerica; }
}
