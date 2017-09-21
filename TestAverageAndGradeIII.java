/*
R Scott McLeod - ITECH, Intro Java 9/8/2017
Project: Test Average and Grade
TestAverageAndGradeII.java
*/

import java.util.*;
import java.lang.Math;
import java.util.Scanner;

public class TestAverageAndGradeIII {
    private static Scanner input = new Scanner(System.in);
    private static final int TIME = 5;
    public static void main(String[] args) {
        // Page 271 Exercise 7 Test Average and Grade
        //initialize variables
        int[] testScore = new int[5];
        String letterGrade= " ";
        int count=0;
        
        //while count less than time, user prompted to enter score        
        while (count < TIME){
               System.out.println("Enter the test score: ");
               testScore[count] = input.nextInt();//test scores added to an array
               int numGrade = testScore[count];//test score converted to int to get letter grade
               
               //validation check
               if(testScore[count] < 0 || testScore[count] > 100){
                  System.out.println("Invalid score, please try again");
                  }else
               if(testScore[count] >= 0 || testScore[count] <= 100){
               
               letterGrade = determineGrade(numGrade);//determines letter grade
               System.out.println(numGrade + " - " + letterGrade);//displays test score and letter grade
               }       
            count++;
        }//end while
      int averageScore = calcAverage(testScore);//call to calculate average score
      System.out.println("Your average score is :" + averageScore);//display average score
    }//end main
     
    //accepts array of 5 test scores and returns the average
    private static int calcAverage(int[] value){
        int averageGrade=0;
        int total=0;
        int i;
        //iterate throuhg array of scores to find total
         for(i =0; i<TIME;i++){
            total = total + value[i];
            }
            averageGrade = total/TIME;//calculate average
        
        return averageGrade;
    }//end calcAverage

    private static String determineGrade(int numGrade) {
        String letterGrade;
        int testValue = numGrade / 10;//determines interger value between 1 and 10
        
            //cases define letter grade and assign value to letterGrade variable
            switch (testValue){
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
100 - A+
Enter the test score
90
90 - A
Enter the test score
80
80 - B
Enter the test score
70
70 - C
Enter the test score
60
60 - D
Your average score is 80

 ----jGRASP: operation complete
*/