//ComputeArea.java
//R.S. McLeod
//Date 9/19/2017
//Calculates area of a circle


import java.util.Scanner; //specific import shows your thinking about what to be used in the program
import java.lang.Math.*;

public class ComputeArea{
    public static void main(String[] args){
        //Create a Scanner object and variables
        Scanner input = new Scanner(System.in);
        double radius;
        double area;
        
        //Prompt the user to enter a radius
        System.out.println("What is the radius of the circle?");
        radius = input.nextDouble();
        
        //Compute area
        area = radius * radius * Math.PI;
        
        //Display result
        System.out.println("The area of the circle of radius " + radius + " is " + area);
        
    }//end main
    
}//end class