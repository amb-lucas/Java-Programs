import java.io.*;
import java.util.*;

public class LivroBiblioteca extends Livro {
  boolean emprestado;
  
  public void emprestarLivro(){
    if(this.emprestado){
      System.out.println("Erro: O livro já foi emprestado.");
    }
    else {
      this.emprestado = true;
      System.out.println("Livro emprestado com sucesso.");
    }
  }
}
