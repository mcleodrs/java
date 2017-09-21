/*
 * R Scott McLeod, ITECH, Intro Java, 9/14/2017
 * Chapter 14, OOP CellPhone
 * CellPhone.java
 */
 
 public class CellPhone{
   //Field declarations
   private String manufacturer;
   private String modelNumber;
   private double retailPrice;
   
   //Medthod Definitions
   public void setManufacturer(String manufact){
      manufacturer = manufact;
      }//end setManufacturer
   public void setModelNumber(String modNum){
      modelNumber = modNum;
      }//end setModelNumber
   public void setRetailPrice(double retail){
      retailPrice = retail;
      }//end setReetailPrice
      
   public String getManufacturer(){
      return manufacturer;
      }//end getManufacturer
   public String getModelNumber(){
      return modelNumber;
      }//end getModelNumber
   public double getRetailPrice(){
      return retailPrice;
      }//end getRetailPrice
 }//end class

