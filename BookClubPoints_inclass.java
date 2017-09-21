/*
R Scott McLeod, ITECH Intro to Java, Tuesday 9/5/17
Programming project 4a Book Club Points - inclass - Page 171 #6
BookClubPoints_inclass.java
*/
import java.util.*;//imports the Scanner class for input


public class BookClubPoints_inclass{
   static Scanner keyboard = new Scanner(System.in);//reads from the keyboard

   public static void main(String[] args){
   System.out.println("Please enter the number of books \npurchased this month");
   
   int numBooks = keyboard.nextInt();
   int numPoints;
      switch(numBooks){
         case 0:  numPoints = 0;
                  break;
         
         case 1:  numPoints = 5;
                  break;
         
         case 2: numPoints = 15;
                 break;
         
         case 3: numPoints = 30;
                 break;
         
         default: numPoints = 60;
                 break;
      }
      System.out.println("This month you earned " + numPoints + " points!\n\tThank you for your busines!!");
   
   }
   
}//end class

/*
Fall Through Case

switch(numBooks){

   case 10:
   case  9:
   case  8:
   case  7:
   case  6:
   case  5:
   case  4:
            points = 60; break;
   case  3: points = 30; break;
   case  2: points = 15; break;
   case  1: points = 5; break;
   default: points = 0;
 //end Case statement           

*/