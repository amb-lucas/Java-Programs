import java.io.*;
import java.util.*;

public abstract class Pessoa {
  protected String nome;
  protected String cpf;

  public Pessoa(String nome, String cpf){
    this.nome = nome;
    this.cpf = cpf;
  }

  public String getNome() { return this.nome; }
  abstract public void setNome(String nome);

  public String getCpf() { return this.cpf; }
  abstract public void setCpf(String cpf);
}
