/*
R Scott McLeod
8/30/2017

Item Calculator
This program takes in the price of 3 items
calculates the subtotal, sales tax plus subtotal
displays the sub total, sales tax rate, and final total
*/

import java.util.*;
import java.lang.Math;
import java.util.Scanner;

class ItemCalculator {
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Program #6 page 79 Calculate Subtotal, Sales Tax, and Total
        double item1;
        double item2;
        double item3;
        double subTotal;
        double salesTaxRate;
        double salesTax;
        double finalTotal;
        //initialize variables
        
        salesTaxRate = 0.06;//set salesTaxRate
        
        System.out.println("Enter the price of item1");
        item1 = input.nextDouble();
        System.out.println("Enter the price of item2");
        item2 = input.nextDouble();
        System.out.println("Enter the price of item3");
        item3 = input.nextDouble();
        //collects item prices
        
        subTotal = item1 + item2 + item3;//calculates subTotal
        salesTax = salesTaxRate * subTotal;//calculates amount of tax
        finalTotal = subTotal + salesTax;//calculates total final price
        
        System.out.println("Subtotal " + subTotal);
        System.out.println("Sales Tax " + salesTax);
        System.out.println("Total " + finalTotal);
        //display output
    }
}
/*
----jGRASP exec: java ItemCalculator
Enter the price of item1
5.55
 Enter the price of item2
 2.75
 Enter the price of item3
 8.13
 Subtotal 16.43
Sales Tax 0.9857999999999999
Total 17.4158

----jGRASP: operation complete.
*/