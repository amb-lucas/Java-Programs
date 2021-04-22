import java.io.*;
import java.util.*;

public class ExprLogica implements Expression {
  private static final String[] OPERATIONS = {">", "<", "<=", ">=", "==", "!="};
  private String expression;

  public ExprLogica(String expr) {
    this.expression = expr;
  }

  public void setExpression(String expr) { this.expression = expr; }
  public String getExpression() { return this.expression; }

  @Override
  public String toString(){
    return "ExprLogica " + this.hashCode() + ": " + this.getExpression();
  }

  public String avaliar(){
    String[] args = {"", ""};

    for(int i=0; i<6; i++){
      if(this.expression.contains(OPERATIONS[i])){
        args = this.expression.split(OPERATIONS[i]);
      }
    }

    Expression arit1 = new ExprAritmetica(args[0]);
    double v1 = Double.parseDouble(arit1.avaliar());

    Expression arit2 = new ExprAritmetica(args[1]);
    double v2 = Double.parseDouble(arit2.avaliar());

    ExpressionHelper helper = new ExpressionHelper();
    if(this.expression.contains(">")) return helper.booleanEval(v1 > v2);
    else if(this.expression.contains("<")) return helper.booleanEval(v1 < v2);
    else if(this.expression.contains(">=")) return helper.booleanEval(v1 >= v2);
    else if(this.expression.contains("<=")) return helper.booleanEval(v1 <= v2);
    else if(this.expression.contains("==")) return helper.booleanEval(v1 == v2);
    else return helper.booleanEval(v1 != v2);
  }

  public String imprimirArvore(){
    for(int i=0; i<6; i++){
      if(this.expression.contains(OPERATIONS[i])){
        String[] args = this.expression.split(OPERATIONS[i]);
        Expression arit1 = new ExprAritmetica(args[0]);
        Expression arit2 = new ExprAritmetica(args[1]);

        return "(" + arit1.imprimirArvore() + OPERATIONS[i] + arit2.imprimirArvore() + ")";
      }
    }

    Expression arit = new ExprAritmetica(this.expression);
    return arit.imprimirArvore();
  }
}
