import java.io.*;
import java.util.*;

public class ExprAritmetica implements Expression {
  private static final String OPERATION_PRIORITY = "/*-+";
  private String expression;

  public ExprAritmetica(String expr) {
    this.expression = expr;
  }

  public void setExpression(String expr) { this.expression = expr; }
  public String getExpression() { return this.expression; }

  @Override
  public String toString(){
    return "ExprAritmetica " + this.hashCode() + ": " + this.getExpression();
  }

  public String avaliar(){
    for(int i=3; i>=0; i--){
      if(this.expression.contains(String.valueOf(OPERATION_PRIORITY.charAt(i)))){
        ExpressionHelper helper = new ExpressionHelper();
        String[] args = helper.split(this.expression, OPERATION_PRIORITY.charAt(i));

        Expression e1 = new ExprAritmetica(args[0]);
        double v1 = Double.parseDouble(e1.avaliar());

        Expression e2 = new ExprAritmetica(args[1]);
        double v2 = Double.parseDouble(e2.avaliar());

        if(i == 0) return "" + (v1/v2);
        else if(i == 1) return "" + (v1*v2);
        else if(i == 2) return "" + (v1-v2);
        else return "" + (v1+v2);
      }
    }

    return this.expression;
  }

  public String imprimirArvore(){
    for(int i=3; i>=0; i--){
      if(this.expression.contains(String.valueOf(OPERATION_PRIORITY.charAt(i)))){
        ExpressionHelper helper = new ExpressionHelper();
        String[] args = helper.split(this.expression, OPERATION_PRIORITY.charAt(i));

        Expression e1 = new ExprAritmetica(args[0]);
        String exp1 = e1.imprimirArvore();

        Expression e2 = new ExprAritmetica(args[1]);
        String exp2 = e2.imprimirArvore();

        return "(" + exp1 + OPERATION_PRIORITY.charAt(i) + exp2 + ")";
      }
    }

    return "(" + this.expression + ")";
  }
}
