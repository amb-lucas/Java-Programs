import java.io.*;
import java.util.*;

public class Test {
  public static void main(String args[]) {
    Pessoa allan = new Pessoa();
    Pessoa ambrosio = new Pessoa("Lucas", 24, "Superior Incompleto", "Se depender de Chris Hemsworth, bi", "Masculino", Genero.CIS);

    allan.dormir();
    allan.cagar();
    allan.comer();
    allan.estudar();
    allan.viver();
    allan.sobreviver();
    allan.trabalhar();
  }
}
