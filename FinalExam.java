/*
 * R Scott McLeod, ITECH, Intro Java, 9/14/2017
 * Chapter 14, OOP Final Exam
 * FinalExam.java
 */
 
 public class FinalExam extends GradedActivity{
   //Fields
   private int numQuestions;
   private double pointsEach;
   private int numMissed;
   
   public FinalExam(int questions, int missed){
      //local variable
      double numericScore;
      
      //questions and missed
      numQuestions = questions;
      numMissed = missed;
      
      pointsEach = 100.0 / questions;
      numericScore = 100.0 - (missed * pointsEach);
      
      setScore(numericScore);
   }//end finalExam
   
   //Accessors (getters)
   public double getPointsEach(){
      return pointsEach;
      }//end getPointsEach
   
   public int getNumMissed(){
      return numMissed;
      }//end getNumMissed
   
 }//end class