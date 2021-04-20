import java.io.*;
import java.util.*;

public class Conta {
  protected int numeroIdentificacao;
  protected String agencia;
  protected Senha senha;

  public Conta(int numeroIdentificacao, String agencia, Senha senha) {
    this.numeroIdentificacao = numeroIdentificacao;
    this.agencia = agencia;
    this.senha = senha;
  }

  public int getNumeroIdentificacao() { return this.numeroIdentificacao; }
  public void setNumeroIdentificacao(int numeroIdentificacao) { this.numeroIdentificacao = numeroIdentificacao; }

  public String getAgencia() { return this.agencia; }
  public void setAgencia(String agencia) { this.agencia = agencia; }

  public Senha getSenha() { return this.senha; }
  public void setSenha(Senha senha) { this.senha = senha; }
  public void setSenha(int numerica) { this.senha.setNumerica(numerica); }
  public void setSenha(String alfanumerica) { this.senha.setAlfanumerica(alfanumerica); }
}
