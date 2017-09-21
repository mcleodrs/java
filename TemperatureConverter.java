//TemperatureConverter.java
//R.Scott McLeod
//Date 9/20/2017
//Converts Fahrenheit temperatures to Celsius.
import java.util.Scanner;

public class TemperatureConverter{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      //declare and initialize variables
      final double FRACTION_VALUE = 5.0/9.0;
      final int F_TEMP_OFFSET = 32;
      int fTemp = 0;
      double cTemp = 0;
      
      System.out.print("Please enter an integer for the fahrenheit temperature: ");
      fTemp = input.nextInt();//user enters Fahrenheit value
      
      cTemp = (fTemp - F_TEMP_OFFSET) * FRACTION_VALUE;//calculate Celsius
      
      //Output Fahrenheit entered and the temperature in degrees Celsius
      System.out.println("You entered " + fTemp + " degrees fahrenheit; this is " + cTemp + " degrees celsius");
      
   }//end main
}//end class


