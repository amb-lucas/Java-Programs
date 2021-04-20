import java.io.*;
import java.util.*;

public class Test {
  public static void main(String args[]) {

    LivroLivraria apostila = new LivroLivraria();
    apostila.venderLivro();
    apostila.venderLivro();

    LivroBiblioteca biblia = new LivroBiblioteca();
    biblia.emprestarLivro();
    biblia.emprestarLivro();
  }
}
