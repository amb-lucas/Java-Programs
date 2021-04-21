import java.io.*;
import java.util.*;

public class ColecaoVetor implements Colecao {
  private Pessoa[] dados = new Pessoa[5];
  private int usados = 0;

  @Override
  public void inserir(Pessoa pessoa) {
    if(usados < 5) {
      dados[usados] = pessoa;
      usados++;

      int vagasDisponiveis = this.tamanhoColecaoNaoNull();
      if(vagasDisponiveis == 1) System.out.println("Mais 1 vaga disponível.");
      else System.out.println("Mais " + vagasDisponiveis + " vagas disponíveis.");
    }
    else {
      System.out.println("Erro: Tamanho da coleção já alcançou o limite.");
    }
  }

  @Override
  public int tamanhoColecaoNaoNull() {
    return 5 - usados;
  }

  public String[] getNomes(){
    String ans[] = new String[this.usados];

    for(int i=0; i<this.usados; i++){
      ans[i] = dados[i].getNome();
    }
    
    return ans;
  }
}
