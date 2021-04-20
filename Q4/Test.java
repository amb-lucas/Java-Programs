import java.io.*;
import java.util.*;

public class Test {
  public static void main(String args[]) {
    Conta conta = new Conta(1234, "abc", new Senha("A1B2C3", 123456));

    System.out.println(conta.getSenha().getAlfanumerica());
    System.out.println(conta.getNumeroIdentificacao());

    conta.setSenha("Nova Senha de Letras");
    System.out.println(conta.getSenha().getAlfanumerica());
  }
}
