/*
R Scott McLeod
8/30/2017
This program takes in the price of 3 items
calculates the subtotal, sales tax plus subtotal
displays the sub total, sales tax rate, and final total
*/

import java.util.*;
import java.lang.Math;
import java.util.Scanner;

import java.text.DecimalFormat;

class ItemCalculatorModified {
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Program #6 page 79 Calculate Subtotal, Sales Tax, and Total
        double item1;
        double item2;
        double item3;
        //double subTotal;
        double salesTax;
        
        salesTax = 0.06;
        //double finalTotal;
        
        System.out.println("Enter the price of item1");
        item1 = input.nextDouble();
        System.out.println("Enter the price of item2");
        item2 = input.nextDouble();
        System.out.println("Enter the price of item3");
        item3 = input.nextDouble();
        //collects item price
        
        double subTotal = item1 + item2 + item3;//declares subTotal variable with initialize item prices
        subTotal = Math.round(subTotal * 100.0) / 100.0;//rounds subTotal to two decimal places
        System.out.println("Subtotal  $" + subTotal);
        //prints out subTotal
        
        double finalTotal = Math.round((subTotal + subTotal * salesTax) * 100.0)/100.0;
        //declares finalTotal variable, rounds value to two decimal places
        
        DecimalFormat df = new DecimalFormat("#%");
        System.out.println("Sales Tax     " + df.format(salesTax));
        System.out.println("Total     $" + finalTotal);
    }
}
/*
  ----jGRASP exec: java ItemCalculator
 Enter the price of item1
 5.55
 Enter the price of item2
 2.75
 Enter the price of item3
 8.39
 Subtotal 16.69
 Sales Tax 0.06
 Total 17.6914
 
  ----jGRASP: operation complete.
*/