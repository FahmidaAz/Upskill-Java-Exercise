import java.util.*;

public class Main {
    public static void main(String[] args) {
      int num = 6;
      int result = factorial(num);
      System.out.println(result);
  }
  
  public static int  factorial(int num){
    int result=1;
     if(num == 0 || num==1){
       return 1;
     }
     for(int i=1; i<=num; i++){
       result *=i;
     }
     return result;
  }
}