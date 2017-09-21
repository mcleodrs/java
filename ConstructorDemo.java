/*
 * R Scott McLeod, ITECH, Intro Java, 9/14/2017
 * Chapter 14, OOP ConstructorDemo
 * ConstructorDemo.java
 */
public class ConstructorDemo{ 
 public static void main(String[] args){
 
   CellPhone_v2 myPhone = new CellPhone_v2("Motorola","M1000",199.99);
   
   System.out.println("The manufacturer is " + myPhone.getManufacturer());
   System.out.println("The model number is " + myPhone.getModelNumber());
   System.out.println("The retail price is " + myPhone.getRetailPrice());
   
   }//end main
}//end class

/*
The manufacturer is Motorola
The model number is M1000
The retail price is 199.99
*/