import java.util.Scanner;

public class AverageScore{
   public static void main(String[] args){
      //Create Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      //declare variables
      double test1, test2, test3, test4, average;
      
      //Get test1
      System.out.println("Enter test 1 score :");
      test1 = keyboard.nextDouble();
      
      System.out.println("Enter test 2 score :");
      test2 = keyboard.nextDouble();
      
      System.out.println("Enter test 3 score :");
      test3 = keyboard.nextDouble();
      
      System.out.println("Enter test 4 score :");
      test4 = keyboard.nextDouble();
      
      average = test1 + test2 + test3 + test4;
      
      if(average >= 95){
         System.out.println("Way to go! You have an A average!");
      }
   }

}