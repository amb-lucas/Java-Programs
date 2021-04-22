import java.io.*;
import java.util.*;

public class Professor extends Pessoa {
  protected String formacao;
  protected String area;

  public Professor(String nome, String cpf, String formacao, String area){
    super(nome, cpf);
    this.formacao = formacao;
    this.area = area;
  }

  @Override
  public void setNome(String nome) { this.nome = nome; }

  @Override
  public void setCpf(String cpf) { this.cpf = cpf; }

  public String getFormacao() { return this.formacao; }
  public void setFormacao(String formacao) { this.formacao = formacao; }

  public String getArea() { return this.area; }
  public void setArea(String area) { this.area = area; }
}
