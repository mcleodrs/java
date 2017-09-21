import java.util.*;
import java.lang.Math;
import java.util.Scanner;

public class ForLooped{
    private static Scanner input;
    public static void main(String[] args){
      int counter = 0;
      int testNum = 0;
      int testScore = input.nextInt();
      double averageScore=0;
      double someNum = theCounter(counter, testNum);
      
      System.out.println("Average Score: " + testNum);
    }//end main
    
    private static double theCounter(int counter, int testNum){
         for(int i=0;i<5;i++){
         counter++;
         
         System.out.println("Test"+counter);
      }//end for loop
      if(counter == 5){
      testNum = counter / 2;
      }
      return(testNum);
      }//end theCounter
}//end close
