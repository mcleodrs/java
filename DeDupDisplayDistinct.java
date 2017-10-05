//deDupDisplayDistinct.java
//R.Scott McLeod
//Date 9/27/2017
//Takes in an array of integers, eliminates duplicate values and displays array and distinct value
import java.util.Scanner;
import java.util.Arrays;

public class DeDupDisplayDistinct{
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
      int count = 0;
      int[] temp = new int[numbers.length];
      StringBuilder theList = new StringBuilder();
      
      //for each element in the array compare to a temp array, if in NOT in temp array append to the list
      for(int i:numbers){
         if(i != temp[i]){
            temp[i] = i;
            theList.append(temp[i]);
            count++;
         }
      }//end for
      
      //converts the Stringbuiler theList array of numbers into a string called test
      String test = theList.toString();
      
      //takes the string 'test' and adds a space between each number
      String almost[] = test.split("");
      
      int[] result = new int[count];
      //converts the String array almost[] into an integer array called result[]
      for(int i=0;i<almost.length;i++){
         result[i] = Integer.parseInt(almost[i]);
      }
      return result;
   }//end eleminateDuplicates
}//end class