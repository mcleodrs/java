/*
R Scott McLeod - ITECH, Intro Java, 9/7/17
Programming Assignment 9 - Exercise 3, page 399
NumberGeneratorCounter.java

*/
import java.util.*;//for Scanner and Random


public class NumberGeneratorCounter{
      public static void main(String[] args){
      Random generator = new Random();
      int evenCounter = 0;
      int oddCounter = 0;
      int randNum;

      
      for(int i = 0; i < 100; i++){
          randNum = generator.nextInt(100);//get the random #
          //try a conditional expression modulus
         //int x = (randNum % 2 == 0) ? evenCounter++ : oddCounter++;
         if (randNum % 2 == 0){
            evenCounter++;
            }else
            oddCounter++;
            
         System.out.print(randNum + "\t");
         if ((i + 1)% 10 == 0)  
            System.out.println();
      }//end for loop
            System.out.print("\nThere are " + evenCounter + " even numbers, and " + oddCounter + " odd numbers");
      
      }//end main
}//end class

