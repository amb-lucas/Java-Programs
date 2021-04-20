import java.io.*;
import java.util.*;

public abstract class Livro {
  private String titulo;
  private String ISBN;
  private String autor;
  private int ano;
  private String editora;

  public String getTitulo() { return this.titulo; }
  public void setTitulo(String titulo) { this.titulo = titulo; }
  
  public String getISBN() { return this.ISBN; }
  public void setISBN(String ISBN) { this.ISBN = ISBN; }
  
  public String getAutor() { return this.autor; }
  public void setAutor(String autor) { this.autor = autor; }
  
  public int getAno() { return this.ano; }
  public void setAno(int ano) { this.ano = ano; }

  public String getEditora() { return this.editora; }
  public void setEditora(String editora) { this.editora = editora; }
}
