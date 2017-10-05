//deDupDisplayDistinct_v2.java
//R.Scott McLeod
//Date 9/27/2017
//Takes in an array of integers, eliminates duplicate values and displays array and distinct value
import java.util.Scanner;
import java.util.Arrays;

public class DeDupDisplayDistinct_v2{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int[] numArray = new int[10];      
      int count = 0;
      
      //user enters up to 10 values
      System.out.print("Enter ten integers: ");
      for(int i=0; i<numArray.length; i++){
         numArray[i] = input.nextInt();        
      }
      
      //return and display sorted array   
      int[] distinctList = eliminateDuplicates(numArray);
      
      System.out.println("The number of distinct integers is " + distinctList.length);
      
      System.out.print("The distinct integers are ");
      for(int k=0;k<distinctList.length;k++){
         System.out.print(distinctList[k] + " ");
      }
   }//end main
   
   public static int[] eliminateDuplicates(int[] numbers){
      boolean contains = false;//initialize boolean value to determine if array contains element
      int count = 0;
      int[] temp = new int[numbers.length];
      int num = 0;
      
      //outer loop to interate through the array
      for(int i=0;i<numbers.length;i++){
         contains = false;//reset to false once 2nd for loop executes
         //inner loop with if to test if temp array contains numbers array element
         for(int k=0;k<numbers.length;k++){
            if(temp[k] == numbers[i]){
               contains = true;  
            }   
         }
         if(!contains){
            temp[num++] = numbers[i];
         }
      }
      int[]results = new int[num];
      //iterate through elements in temp array to add to results array
      for(int i=0;i<num;i++){
         results[i] = temp[i];   
      }
      return results;//returns deduped array to main
   }//end eleminateDuplicates
}//end class