import java.io.*;
import java.util.*;

public class Main {
  public static void main(String args[]) {
    // Teste 1
    Expression t1 = new ExprAritmetica("2*3+4/6");
    System.out.println(t1);
    System.out.println(t1.avaliar());
    System.out.println(t1.imprimirArvore());

    // Teste 2
    Expression t2 = new ExprLogica("2+5/10<12+16");
    System.out.println(t2);
    System.out.println(t2.avaliar());
    System.out.println(t2.imprimirArvore());

    // Teste 3
    Expression t3 = new ExprAritmetica("2*3+4/6/6*4");
    System.out.println(t3);
    System.out.println(t3.avaliar());
    System.out.println(t3.imprimirArvore());
  }
}
