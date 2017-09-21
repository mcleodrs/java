/*

*/

import java.util.*;

public class NumberAnalysisProgram{
   public final static int ROWS = 20;
   private static Scanner input = new Scanner(System.in);
   public static void main(String[] args){
    int[] number = new int[ROWS]; //instantiate the array
      int sum = 0;
      int lowest = 0;
      int highest = 0;
      int average = 0;
      int i;
      
      for(i=0; i<ROWS; i++){
      //fill the array
         System.out.println("Enter the number");
         number[i] = input.nextInt();
      //number[i] = System.out.println("Enter the number: ");
      }//end for
      sum = find_sum(number);//invoke the method
      System.out.println("The sum is " +sum+".");
      lowest = find_low(number);
      System.out.println("The lowest number is " +lowest+".");
      highest = find_high(number);
      System.out.println("The highest number is " +highest+".");
      average = find_average(number);
      System.out.println("The average of the integers is " +average+".");
      
   }//end main
   public static int find_sum(int[] value){//method definition to find the sum
      int i, total = 0;
      for(i=0;i<ROWS;i++){
         total = total+value[i];
      }
      return total;
   }//end find_sum 
   
   public static int find_low(int[] low){//method definition to find the lowest integer
      int i, lowest = 1;
      for(i=1;i<ROWS-1;i++){
         if(low[i] < lowest){
         lowest = low[i];
         }
      }
      return lowest;
   }//end find_low
   
   public static int find_high(int[] high){//method definition to find the lowest integer
      int i,highest = 0;
      for(i=0;i<ROWS;i++){
         if(high[i] > highest){
         highest = high[i];
         }
      }
      return highest;
   }//end find_high
      
   public static int find_average(int[] value){//method definition to find the average of the integers
      int i, total = 0, average = 0;
      for(i=0;i<ROWS;i++){
         total = total+value[i];
      }
         average = total/ROWS;
      return average;      
   }
}//end class