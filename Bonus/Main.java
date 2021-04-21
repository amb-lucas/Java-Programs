import java.io.*;
import java.util.*;

public class Main {
  public static void main(String args[]) {
    // Teste 1
    Expression t1 = new ExprTernaria("2*3+4/6!=3/4?96+45*3:26*7*6/4+3");
    System.out.println(t1);
    System.out.println(t1.avaliar());
    System.out.println(t1.imprimirArvore());

    // Teste 2
    Expression t2 = new ExprTernaria("2*3+4/6!=3/4?3<5+6:26*7*6/4+3");
    System.out.println(t2);
    System.out.println(t2.avaliar());
    System.out.println(t2.imprimirArvore());
  }
}
