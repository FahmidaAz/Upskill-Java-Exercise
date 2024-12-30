import java.util.*;

public class Main {
    public static void main(String[] args) {
      String original = "Hello World";
      String result = reverseString(original);
      System.out.println(result);
  }
  public static String reverseString(String s){
      char [] charString = s.toCharArray();
      String reverse ="";
      for(int  i =charString.length-1; i>=0; i--){
          reverse+=charString[i];
      }
      return reverse;
  }
  
}