/*
 * R Scott McLeod, ITECH, Intro Java, 9/14/2017
 * Chapter 14, OOP CellPhone
 * CellPhone_v2.java
 */
 
 public class CellPhone_v2{
   //Field declarations
   private String manufacturer;
   private String modelNumber;
   private double retailPrice;
   
   //Constructor
   public CellPhone_v2(String manufact, String modNum, double retail){
      manufacturer = manufact;
      modelNumber = modNum;
      retailPrice = retail;
   }//end Constructor
   
   //Mutator Methods
   public void setManufacturer(String manufact){
      manufacturer = manufact;
      }//end setManufacturer
   public void setModelNumber(String modNum){
      modelNumber = modNum;
      }//end setModelNumber
   public void setRetailPrice(double retail){
      retailPrice = retail;
      }//end setReetailPrice
   
   //Accessor Methods   
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

