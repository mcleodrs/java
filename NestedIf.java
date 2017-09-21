import java.util.*;

public class NestedIf{
   
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      
      int temp;
      
      System.out.println("What is the outside temperature?");
      temp = keyboard.nextInt();
      
      if(temp < 30){
         System.out.println("Wow! That's cold!");
         }else
          if(temp < 50){
            System.out.println("That's a little chilly");
            }else
               if(temp < 80){
                  System.out.println("That's nice and warm.");
                     }else
                        System.out.println("Wow! It's Hot!");
  }

}//end class