import java.io.*;
import java.util.*;

public class Aluno extends Pessoa {
  protected String matricula;
  protected String curso;

  public Aluno(String nome, String cpf, String matricula, String curso){
    super(nome, cpf);
    this.matricula = matricula;
    this.curso = curso;
  }

  public String getMatricula() { return this.matricula; }
  public void setMatricula(String matricula) { this.matricula = matricula; }

  public String getCurso() { return this.curso; }
  public void setCurso(String curso) { this.curso = curso; }
}
