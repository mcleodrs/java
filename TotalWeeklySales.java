/*
R Scott Mcleod, ITECH, Intro Java
Total Weekly Sales
TotalWeeklySales.java
*/
import java.util.*;


public class TotalWeeklySales{
   public final static double ROWS = 7;
   
   public static void main(String[] args){
     Scanner kb = new Scanner(System.in);
     String weekDays[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
     double[] sales = new double[7];
   
     for(int i=0;i<ROWS;i++){
     System.out.println("Enter " + weekDays[i] + "'s sales total");
     sales[i] = kb.nextInt();
     }//end 1st for loop

     double totalSales = getSalesTotal(sales);//get totalSales

     for(int i=0;i<ROWS;i++){
     if(weekDays[i] == "Wednesday" ){
      System.out.println(weekDays[i] + "-\t\t|\t "+ sales[i]);
      }else
         System.out.println(weekDays[i] + "\t-\t\t|\t " + sales[i]); 
     }//end 2nd for loop
     System.out.println("Week Total Sales - " + totalSales);
                         
   }//end main
   
   public static double getSalesTotal(double[] value){
      double totalSales = 0;
      int i = 0;
      
      for(i=0;i<ROWS;i++){
      totalSales = totalSales + value[i];
      }
      
      return totalSales;
      }//end getTotalSales
   
}//end class
/*
Monday	-	|		 1
Tuesday	-	|		 1
Wednesday-	|		 1
Thursday	-	|		 1
Friday	-	|		 1
Saturday	-	|		 1
Sunday	-	|		 1
Week Total Sales - 7
*/