/*
Author: Scott McLeod, ITECH Intro - Java, Tuesday, 8/29/2017
Filename: GrossPay.java
Purpose: to learn problem solving and how to excecute a Java program
*/

import java.util.*;
import java.lang.Math;
import java.util.Scanner;

class GrossPay {
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Program page 31-32 Calculate Gross Pay
        double hoursWorked;
        double payRate;
        double grossPay;
        
        System.out.println("Enter the hours worked:");
        hoursWorked = input.nextDouble();
        System.out.println("Enter the hourly rate:");
        payRate = input.nextDouble();
        grossPay = hoursWorked * payRate;
        System.out.println("The gross pay is $" + grossPay);
    }//end of main
}//end of class
/*
 ----jGRASP exec: java JavaApplication
 Enter the hours worked:
 40
 Enter the hourly rate:
 10
 The gross pay is 400.0
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java GrossPay
 Enter the hours worked:
 40
 Enter the hourly rate:
 15.00
 The gross pay is $600.0
 
  ----jGRASP: operation complete.
*/