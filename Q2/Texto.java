import java.io.*;
import java.util.*;

public class Texto {
  private String text;

  public Texto(String text) { this.text = text; }

  public String toString() {
    return this.text;
  }

  public int countWords() {
    int wordCount = 0;
    int curLenght = 0;

    for(char c: this.text.toCharArray()){
      if(('0' <= c && c <= '9') || ('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')){
        curLenght += 1;
      }
      else {
        if(curLenght > 0) wordCount++;
        curLenght = 0;
      }
    }

    if(curLenght > 0) wordCount++;
    return wordCount;
  }

  public int countSubstring(String substr){
    int frequencyCount = 0;

    int substrLength = substr.length();
    int textLength = this.text.length();
    for(int i=0; i+substrLength < textLength; i++){
      if(this.text.substring(i, i+substrLength).equals(substr)) frequencyCount++;
    }

    return frequencyCount;
  }

  public void replace(String fromStr, String toStr){
    String newText = "";

    int substrLength = fromStr.length();
    int textLength = this.text.length();
    for(int i=0; i+substrLength < textLength; i++){
      if(this.text.substring(i, i+substrLength).equals(fromStr)){
        newText += toStr;
        i += substrLength-1;
      }
      else newText += this.text.charAt(i);
    }

    this.text = newText;
  }
}
