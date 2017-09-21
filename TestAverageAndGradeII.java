/*
R Scott McLeod - ITECH, Intro Java 9/8/2017
Project: Test Average and Grade
TestAverageAndGradeII.java
*/

import java.util.*;
import java.lang.Math;
import java.util.Scanner;

public class TestAverageAndGradeII {
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Page 271 Exercise 7 Test Average and Grade
        //initialize variables
        int testScore;
        String letterGrade= " ";
        int count=0;
        double totalScore=0;
        
        //for loop with 5 iterations for user to enter a test score
        for (count = 1 ; count <= 5 ; count++) {
            System.out.println("Enter the test score");
            testScore = input.nextInt();
               //validation check to ensure the test score is within 0 to 100
               if(testScore < 0 || testScore > 100){
                  System.out.println("You have entered an invalid score, please try again");
                  count = 0;
                  totalScore = 0;
                  testScore =0;
                  letterGrade= " ";
                  }else
                      letterGrade = determineGrade(testScore);
                      System.out.println(letterGrade);
                      totalScore = totalScore + testScore;
        }//end loop
        double averageScore = calcAverage(totalScore);
        System.out.println("Your average score is " + averageScore);
    }//end main
      
    //accepts the sum of 5 test scores and returns the average
    private static double calcAverage(double totalScore) {
        double averageGrade = 0;
        averageGrade = totalScore / 5;
        return averageGrade;
    }//end calcAverage

    private static String determineGrade(int testScore) {
        int intGrade = 10;
        String letterGrade;
        int tempGrade = testScore / intGrade;//determines interger value between 1 and 10
            
            //cases define letter grade and assign value to letterGrade variable
            switch (tempGrade){
              case 10:letterGrade = "A+";break;
              case 9: letterGrade = "A"; break;
              case 8: letterGrade = "B"; break;
              case 7: letterGrade = "C"; break;
              case 6: letterGrade = "D"; break;
              default:letterGrade = "F"; break;
            }
        return letterGrade;
    }//end determineGrade
}//end class
/*
 ----jGRASP exec: java TestAverageAndGradeII
Enter the test score
110
You have entered an invalid score, please try again
 
Enter the test score
-1
You have entered an invalid score, please try again
 
Enter the test score
100
A+
Enter the test score
90
A
Enter the test score
80
B
Enter the test score
70
C
Enter the test score
60
D
Your average score is 80.0

 ----jGRASP: operation complete
*/