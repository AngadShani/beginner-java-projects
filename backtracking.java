import java.util.*;

 // Compiler version JDK 11.0.2

public class Backtracking {
  public static void printPermutation(String str, String perm, int idx) {
    if(str.length() == 0){
      System.out.println(perm);
    }
    for(int i=0; i<str.length(); i++) {
      char currChar = str.charAt(i);
      String newStr = str.substring(0, i) + str.substring(i+1);
      printPermutation(newStr, perm + currChar, idx+1);
    }
  }
  
  public static void main(String[] args) {
    String str = "ABC";
    printPermutation(str, "", 0);
  }
}