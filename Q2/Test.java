import java.io.*;
import java.util.*;

public class Test {
  public static void main(String args[]) {
    Texto musica = new Texto("OPA... OPA!,OPAAAA   OPAAAA OPAAA OPAAAAAAA");
    System.out.println(musica.countWords());
    System.out.println(musica.countSubstring("OPA"));
    musica.replace("OPA", "EPA");
    System.out.println(musica);
  }
}
