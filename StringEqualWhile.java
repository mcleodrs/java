import java.util.*;

public class StringEqualWhile{
   
   public static void main(String[] args){
      //Create Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      //A variable to hold a password
      String password;
      
      //Prompt for user to enter password.
      System.out.println("Enter the password: ");
      password = keyboard.nextLine();
      
      //Determine whether the correct password was entered
      while (password != "prospero"){
         System.out.println("Sorry, that is not the correct password");
         
         System.out.println("Enter the password: ");
         password = keyboard.nextLine();
         break;
         }
         System.out.println("Password accepted");

   }//end main
   
}//end class