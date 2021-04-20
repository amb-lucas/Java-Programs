import java.io.*;
import java.util.*;

public class LivroLivraria extends Livro {
  boolean vendido;

  public void venderLivro(){
    if(this.vendido) {
      System.out.println("Erro: O livro já foi vendido.");
    }
    else {
      this.vendido = true;
      System.out.println("Livro vendido com sucesso.");
    }
  }
}
