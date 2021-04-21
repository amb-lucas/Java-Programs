import java.io.*;
import java.util.*;

public class ExprTernaria implements Expression {
  private String expression;

  public ExprTernaria(String expr) {
    this.expression = expr;
  }

  public void setExpression(String expr) { this.expression = expr; }
  public String getExpression() { return this.expression; }

  public String toString(){
    return this.getExpression();
  }

  public String avaliar(){
    String[] args = {"", "", ""};
    args[0] = this.expression.split("\\?")[0];
    args[1] = this.expression.split("\\?")[1].split(":")[0];
    args[2] = this.expression.split("\\?")[1].split(":")[1];

    Expression decisionExp = new ExprLogica(args[0]);
    Expression exp = new ExprLogica(decisionExp.avaliar() == "True" ? args[1] : args[2]); 
    return exp.avaliar();
  }

  public String imprimirArvore(){
    String[] args = {"", "", ""};
    args[0] = this.expression.split("\\?")[0];
    args[1] = this.expression.split("\\?")[1].split(":")[0];
    args[2] = this.expression.split("\\?")[1].split(":")[1];

    Expression decisionExp = new ExprLogica(args[0]);
    Expression exp1 = new ExprLogica(args[1]);
    Expression exp2 = new ExprLogica(args[2]);

    return "(" + decisionExp.imprimirArvore() + "?" + exp1.imprimirArvore() + ":" + exp2.imprimirArvore() + ")";
  }
}
