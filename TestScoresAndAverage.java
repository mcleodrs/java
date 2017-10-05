//TestScoresAndAverage.java
//R.Scott McLeod
//Date 9/26/2017
//Takes in up to 10 test scores and displays the number tests enetered, how many scores above the average and how many below the average.
import java.util.Scanner;

public class TestScoresAndAverage{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      double[] testScores = new double[10];//intilize testScores array up to 10 values
      int count = 0;//test scores counter
      int i=0;//used in while loop to increment to next array index
      int exit = 0;//used to exit while loop
       
      System.out.println("Enter up to 10 scores, enter -1 when complete");
       
      while(exit != -1){
        //user enters scores up to 10
        System.out.print("Enter a number: ");
        testScores[i] = input.nextDouble();
         //if tests the value entered, if = -1 exit while loop decrement count
         if(testScores[i] == -1){
          exit = -1;
          count--;
          }
           i++;
           count++;
         //if cont = 10 exit while loop
         if(count == 10){
         exit = -1;
         }//end if
       }//end while loop

      System.out.println("count is " + count);

      double average = testAverage(testScores, count);//sends array and count to method, returns average
      System.out.println("Average is " + average);
      
      double atOrAbove = aboveAverage(testScores, average, count);//sends array and average to method, returns # of above average scores
      System.out.println("Number of scores above or equal to the average: " + atOrAbove);
      
      double belowTheAverage = belowAverage(testScores, average, count);//sends array and average to method, returns # of below average scores
      System.out.println("Number of scores below the average: " + belowTheAverage);
      
   }//end main
   
   public static double testAverage(double[] arry, int theCount){
      double average = 0;
      double sum = 0;
      int i=0;
   
       for(;i<arry.length;i++){
         if(arry[i] != -1){
               sum += arry[i];
         }//end if
       }//end for
      
      average = sum / theCount;//calculates average
      return average;
   }//end testAverage
   
   public static double aboveAverage(double[] arry, double theAverage, int theCount){
      int aboveAverage = 0;
      for(int i=0;i<theCount;i++){
         if(arry[i] != -1 && arry[i] > theAverage){
            aboveAverage++;
         }//end if
      }//end for
      return aboveAverage;
   }//end atOrAbove
   
   public static double belowAverage(double[] arry, double theAverage, int theCount){
      int belowAverage = 0;
      for(int i=0;i<theCount;i++){
         if(arry[i] != -1 && arry[i] < theAverage){
            belowAverage++;
         }//end if
      }//end for
      return belowAverage;
   }//end atOrAbove
   
}//end class

/*
Enter a number: 90
Enter a number: 80
Enter a number: 70
Enter a number: 60
Enter a number: 50
Enter a number: 40
Enter a number: 30
Enter a number: 20
Enter a number: 10
Enter a number: 0
count is 10
The sum: 450.0 is divided by the count: 10
Average is 45.0
Number of scores above or equal to the average: 5.0
Number os scores below the average: 5.0
*/

/*
LESS THAN 10 VALUES ENTERED

Enter up to 10 scores, enter -1 when complete
Enter a number: 1
Enter a number: 2
Enter a number: 3
Enter a number: -1
count is 3
Average is 2.0
Number of scores above or equal to the average: 1.0
Number of scores below the average: 1.0
*/