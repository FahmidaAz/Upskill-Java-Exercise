import java.util.*;

public class Main {
    public static void main(String[] args) {
     int [] arr ={1,1,2,3,4,4,5};
     int [] result  = removeDuplicate(arr);
     System.out.println(Arrays.toString(result));
  }
  
  public static int [] removeDuplicate(int [] arr){
      if(arr.length == 0){
        return new int[0];
      }
      int k =1;
      for(int i=1; i<arr.length; i++){
        if(arr[i] !=arr[i-1]){
          arr[k] = arr[i];
          k++;
        }
      }
      return Arrays.copyOf(arr,k);
  }
}