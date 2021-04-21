import java.io.*;
import java.util.*;

public class Principal {
  public static void main(String args[]) {
    ColecaoVetor colecao = new ColecaoVetor();

    Aluno aluno1 = new Aluno("Allan", "123.456.789-00", "all", "engenharia da computação");
    Aluno aluno2 = new Aluno("Lucas", "987.654.321-00", "lam", "engenharia da preguiça");
    Professor professor = new Professor("Castor", "999.999.999-99", "castor", "ciência da computação");

    colecao.inserir(aluno1);
    colecao.inserir(aluno2);
    colecao.inserir(professor);

    String nomes[] = colecao.getNomes();
    for(String nome: nomes) {
      System.out.println(nome);
    }
  }
}
