import java.util.*;
import java.lang.Math;
import java.util.Scanner;

public class TestAverageAndGrade {
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Page 271 Exercise 7 Test Average and Grade
        int testScore;
        double averageScore = calcAverage(totalScore);
        String letterGrade;
        int numScores = 0;
        int count = 0;
        double totalScore = 0;
        
        while (count < 5) {
            System.out.println("Enter the test score");
            testScore = input.nextInt();
            
            if(testScore < 0 || testScore > 100){
             System.out.println("You did not enter a valid test score");
             count = 0;
             totalScore = 0;
             //System.out.println(count); 
            }else
            
            //System.out.println(count);          
            letterGrade = determineGrade(testScore);
            totalScore = totalScore + testScore;
            count++;
        }
        averageScore = totalScore / count;
        System.out.println("Your average score is " + averageScore);
    }//end main
/*
    private static double calcAverage(int testScore) {
        int countScore = 1;
        int totalScore = 0;
              for (int count = 0 ; count< 5 ; count++) {
                  totalScore = totalScore + testScore;
                  System.out.println(count);
              }
        totalScore = totalScore / 5;
        
        
        return totalScore;
    }//end calcAverage
*/
    private static String determineGrade(int testScore) {
        int intGrade = 10;
        int tempGrade = testScore / intGrade;
        String letterGrade;
        
        
            switch (tempGrade){
              case 10:letterGrade = "A+";break;
              case 9: letterGrade = "A"; break;
              case 8: letterGrade = "B"; break;
              case 7: letterGrade = "C"; break;
              case 6: letterGrade = "D"; break;
              default:letterGrade = "F"; break;
            }
        System.out.println(letterGrade);
        
        
        return letterGrade;
    }//end determineGrade
}//end class
