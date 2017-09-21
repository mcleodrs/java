/*
 * R Scott McLeod, ITECH, Intro Java, 9/14/2017
 * Chapter 14, OOP GradedActivity
 * GradedActivity.java
 */
 
 public class GradedActivity{
   //the score field holds a numeric score.
   private double score;
   
   //Mutator
   public void setScore(double s){
      score = s;
   }
   
   //Accessor
   public double getScore(){
      return score;
   }
   
   //getGrade Method
   public String getGrade(){
      //local variable
      String grade;
      
      int caseTest = (int)score/10;
      
      switch(caseTest){
         case 10: grade ="A+";
         break;
         case 9: grade ="A";
         break;
         case 8: grade ="B";
         break;                  
         case 7: grade ="C";
         break;         
         case 6: grade ="D";
         break;         
         default: grade ="F";
         break;
      }//end switch
      
      return grade;
   }//end getGrade
   
 }//end class