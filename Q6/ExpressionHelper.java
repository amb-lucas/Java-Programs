import java.io.*;
import java.util.*;

public class ExpressionHelper {
  public String[] split(String str, char c){
    String[] ans = new String[2];

    for(int i=str.length()-1; i>=0; i--){
      if(str.charAt(i) == c){
        ans[0] = str.substring(0, i);
        ans[1] = str.substring(i+1, str.length());
        return ans;
      }
    }

    ans[0] = str;
    return ans;
  }

  public String booleanEval(boolean value){
    if(value) return "True";
    else return "False";
  }
}
