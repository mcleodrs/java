/*
 * R Scott McLeod, ITECH, Intro Java, 9/14/2017
 * Chapter 14, OOP Inheritance Demo
 * InheritanceDemo.java
 */
 
 import java.util.*;
 
 public class InheritanceDemo{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int questions, missed;
      
      System.out.println("Enter the number of questions on the exam ");
      questions = input.nextInt();
      
      System.out.println("Enter the number of questions\nthe student missed");
      missed = input.nextInt();

      FinalExam exam = new FinalExam(questions, missed);      

      System.out.println("Each question the exam counts " + exam.getPointsEach() + " points.");
      System.out.println("The exam score is " + exam.getScore());
      System.out.println("The grade for the exam is " + exam.getGrade());
      
   }//end main
 }//end class