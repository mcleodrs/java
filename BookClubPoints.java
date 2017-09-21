/*
Book Club Points
R. Scott McLeod
BookClubPoints.java
Get the number of books purchased and display the number of points earned
*/
import java.util.*;
import java.util.Scanner;

public class BookClubPoints {
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Page 171 #6 Book Club Points
        //double purchasedBooks;
        
        
        System.out.println("Please enter the number of books you have purchased this month");
        int purchasedBooks = input.nextInt();
        
        if(purchasedBooks < 4){
        switch(purchasedBooks){
         case 0: System.out.println("You have earned 0 points");
                 break;
         case 1: System.out.println("You have earned 5 points");
                 break;                 
         case 2: System.out.println("You have earned 15 points");
                 break;
         case 3: System.out.println("You have earned 30 points");
                 break;            
         default:break;                      
         }
         
        }else{
        System.out.println("Congratulations YOU have earned 60 points");
        }
     }
}
/*
  ----jGRASP exec: java BookClubPoints
 Please enter the number of books you have purchased this month
 0
 You have earned 0 points
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java BookClubPoints
 Please enter the number of books you have purchased this month
 1
 You have earned 5 points
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java BookClubPoints
 Please enter the number of books you have purchased this month
 2
 You have earned 15 points
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java BookClubPoints
 Please enter the number of books you have purchased this month
 3
 You have earned 30 points
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java BookClubPoints
 Please enter the number of books you have purchased this month
 4
 Congratulations YOU have earned 60 points
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java BookClubPoints
 Please enter the number of books you have purchased this month
 400
 Congratulations YOU have earned 60 points
 
  ----jGRASP: operation complete.
*/