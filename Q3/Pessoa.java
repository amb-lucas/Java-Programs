/*
Crie também os métodos (comportamentos) sendo eles, dormir, cagar, comer, estudar, viver, sobreviver e trabalhar.
Nesses últimos casos, basta colocar um system.out.println mantendo assim a coesão da classe.

Após isso, crie a classe principal (Main), crie 2 objetos do tipo pessoa,o primeiro instanciado por meio do construtor default
e o segundo com o outro construtor Fique à vontade para usar os métodos criados com as instâncias criadas, mas não precisa utilizar todos.
*/

import java.io.*;
import java.util.*;

public class Pessoa {
  protected String nome;
  protected int idade;
  protected String grauEscolaridade;
  protected String orientacaoSexual;
  protected String sexoBiologico;
  protected Genero genero;

  public Pessoa() {}
  public Pessoa(String nome, int idade, String grauEscolaridade, String orientacaoSexual, String sexoBiologico, Genero genero) {
    this.nome = nome;
    this.idade = idade;
    this.grauEscolaridade = grauEscolaridade;
    this.orientacaoSexual = orientacaoSexual;
    this.sexoBiologico = sexoBiologico;
    this.genero = genero;
  }

  public void setNome(String nome) { this.nome = nome; }
  public String getNome() { return this.nome; }

  public void setIdade(int idade) { this.idade = idade; }
  public int getIdade() { return this.idade; }

  public void setGrauEscolaridade(String grauEscolaridade) { this.grauEscolaridade = grauEscolaridade; }
  public String getGrauEscolaridade() { return this.grauEscolaridade; }

  public String getOrientacaoSexual() { return this.orientacaoSexual; }
  public String getSexoBiologico() { return this.sexoBiologico; }
  public Genero getGenero() { return this.genero; }

  public void dormir() { System.out.println("Zzzzz... *ronco*"); }
  public void cagar() { System.out.println("HMPH... *respiração profunda* ... oof"); }
  public void comer() { System.out.println("Nom nom nom nom nom"); }
  public void estudar() { System.out.println("Capítulo 12... Zzzzz... *ronco alto*"); }
  public void viver() { System.out.println("Oi mundo"); }
  public void sobreviver() { System.out.println("*mata zumbi* Oi mundo"); }
  public void trabalhar() { System.out.println("HUH HUH HUH HUH *coda coda coda*"); }
}
