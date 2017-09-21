import java.util.*;
import java.io.*;


public class FindSum{
   private static Scanner input = new Scanner(System.in);
   public static void main(String[] args){
      int[] number = new int[20]; //instantiate the array
      int sum = 0;
      int lowest = 0;
      int highest = 0;
      int average = 0;
      int i;
      
      for(i=0; i<20; i++){
      //fill the array
         System.out.println("Enter the number");
         number[i] = i;
      //number[i] = System.out.println("Enter the number: ");
      }//end for
      sum = find_sum(number);//invoke the method
      System.out.println("The sum is " +sum+".");
   }//end main
   
   public static int find_sum(int[] value){//method definition to find the sum
      int i, total = 0;
      for(i=0;i<20;i++){
         total = total+value[i];
      }
      return total;
   }//end find_sum   
}//end class