import java.util.*;

public class StringEqual{
   
   public static void main(String[] args){
      //Create Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      //A variable to hold a password
      String password;
      
      //Prompt for user to enter password.
      System.out.println("Enter the password: ");
      password = keyboard.nextLine();
      
      //Determine whether the correct password was entered
      if(password.equals("prospero")){
         System.out.println("Password accepted");
      }else{
         System.out.println("Sorry, that is not the correct password");
      }
   }//end main
   
}//end class