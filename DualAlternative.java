import java.util.Scanner;

public class DualAlternative{
   
      //Global variables
      public final static int BASE_HOURS = 30;
      public final static double OT_MULTIPLIER = 1.5;
      
      public static void main(String[] args){
          Scanner keyboard = new Scanner(System.in);
          
          double hoursWorked, payRate, grossPay;
          
          System.out.println("Enter the number of hours worked: ");
          hoursWorked = keyboard.nextInt();
          //get hours worked
          
          System.out.println("Enter employee pay rate :");
          payRate = keyboard.nextDouble();
          //get pay rate
          
          //Calc gross pay
          if(hoursWorked > BASE_HOURS){
            grossPay = calcPayWithOT(hoursWorked, payRate);
          }else{
            grossPay = calcRegularPay(hoursWorked,payRate);
          }
          System.out.println("The gross pay is : $" + grossPay);
      }
      
      public static double calcPayWithOT(double hours, double rate){
         double overtimeHours, overtimePay, gross;
         
         overtimeHours = hours - BASE_HOURS;
         overtimePay = overtimeHours * rate * OT_MULTIPLIER;
         
         gross = BASE_HOURS * rate + overtimePay;
         
         return gross;
      }
      
      public static double calcRegularPay(double hours, double rate){
         
         return hours * rate;
      }
}
