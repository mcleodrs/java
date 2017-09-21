/*
R Scott McLeod, ITECH, Into to Java, 9/5/17
Problem: Convert Centigrade temperature to Fahrenheight
Filename: CelciusToFahrenheit.java
*/


public class CelciusToFahrenheit{
   public static void main(String[] args){
     System.out.println("Celcius\t\tFahrenheit");
     System.out.println("-------\t\t----------");
     for(int C = 0; C <= 20; C++){
     
     System.out.println(C + "\t\t\t\t" + (double)(9/5.0*C +32));
     
     }//end for loop
   }//end main
   
}//end class
