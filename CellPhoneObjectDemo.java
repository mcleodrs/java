/*
 * R Scott McLeod, ITECH, Intro Java, 9/14/2017
 * Chapter 14, OOP CellPhoneObjectDemo
 * CellPhoneObjectDemo.java
 */
 
 public class CellPhoneObjectDemo{
   public static void main(String[] args){
      //Declare a variable that can reference
      //a CellPone object
      CellPhone myPhone = new CellPhone();
      
      myPhone.setManufacturer("Motorola");
      myPhone.setModelNumber("M1000");
      myPhone.setRetailPrice(199.00);
      
      System.out.println("The manufacturer is " + myPhone.getManufacturer());
      System.out.println("The model number is " + myPhone.getModelNumber());
      System.out.println("The retail price is " + myPhone.getRetailPrice());
      
   }//end main
 }//end class
 
 /*
The manufacturer is Motorola
The model number is M1000
The retail price is 199.0
*/