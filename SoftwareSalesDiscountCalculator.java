/*
Author: Scott McLeod, ITECH Intro - Java, Tuesday, 9/5/2017
Filename: SoftwareSalesDiscountCalculator.java
Purpose: Determine, based on the number of software packages sold ($99) 
what if any discount will be applied to the price.
Display the discount amount and the total amount minus the discount amount.
*/
import java.util.*;

public class SoftwareSalesDiscountCalculator{
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Page 171 #7 Software Sales
        
//main initializes and assigns variables, request user input and display total discounted amount
        System.out.println("Enter the number of software packages purchased: ");
        double numPurchased = input.nextDouble();
        double discountLevel = calcDiscLevel(numPurchased);
        double totalAmount = calcTotal(numPurchased);
        double discountAmount = calcDiscount(totalAmount, discountLevel);
        double totalDiscountedAmt = totalAmount - discountAmount;
        
        System.out.println("The total amount after discount: $" + totalDiscountedAmt);
      }//end main 
   
 //calcDiscLevel determins the discount level based on number of software packages purchased
       private static double calcDiscLevel(double numPurchased) {
           double discountLevel = 0;
          
           if (10 < numPurchased || numPurchased < 19) {
               discountLevel = 0.2;
           }
           if (20 < numPurchased || numPurchased < 49) {
               discountLevel = 0.3;
           }
           if (50 < numPurchased || numPurchased < 99) {
               discountLevel = 0.4;
           }
           if (numPurchased > 99) {
               discountLevel = 0.5;
           }
           
           return discountLevel;
       }//end calcDiscLevel
//calcDiscount returns the discount amount, could have been done in the main, wanted to practice getting data into and out of a function
       private static double calcDiscount(double totalAmount, double discountLevel) {
           double totalDiscount;
                      
           double discountAmount = totalAmount * discountLevel;
           System.out.println("The total discount amount: $" + discountAmount);
           return discountAmount;
       }//end calcDiscount
//calcTotal returns the total amount before discount 
       private static double calcTotal(double numPurchased) {
           double packPrice;
           double totalAmt;
           
           packPrice = 99;
           totalAmt = packPrice * numPurchased;
           System.out.println("The total price before discount: $" + totalAmt);
           return totalAmt;
       }//end calcTotal
    
        
           
}//end class
/*
  ----jGRASP exec: java SoftwareSalesDiscountCalculator
 Enter the number of software packages purchased: 
 15
 The total price before discount: $1485.0
 The total discount amount: $594.0
 The total amount after discount: $891.0
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java SoftwareSalesDiscountCalculator
 Enter the number of software packages purchased: 
 35
 The total price before discount: $3465.0
 The total discount amount: $1386.0
 The total amount after discount: $2079.0
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java SoftwareSalesDiscountCalculator
 Enter the number of software packages purchased: 
 55
 The total price before discount: $5445.0
 The total discount amount: $2178.0
 The total amount after discount: $3267.0
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java SoftwareSalesDiscountCalculator
 Enter the number of software packages purchased: 
 105
 The total price before discount: $10395.0
 The total discount amount: $5197.5
 The total amount after discount: $5197.5
 
  ----jGRASP: operation complete.
 
*/