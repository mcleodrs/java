import java.util.*;

public class TVModels{
     public static void main(String[] args){
      
      //Create a Scanner object for the keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      //Constants for the TV prices
      final double MODEL_100_PRICE = 199.99;
      final double MODEL_200_PRICE = 269.99;
      final double MODEL_300_PRICE = 349.99;
      
      //Constants for the TV sizes
      final int MODEL_100_SIZE = 24;
      final int MODEL_200_SIZE = 27;
      final int MODEL_300_SIZE = 32;
      
      //Variable for the model number
      int modelNumber;
      
      //Get the model number.
      System.out.print("Which TV are you interested in? ");
      System.out.print("The 100, 200, or 300? ");
      modelNumber = keyboard.nextInt();
      
      //Display the price and size
      switch(modelNumber){
         case 100:
            System.out.println("Price: $" + MODEL_100_PRICE);
            System.out.println("Size: $" + MODEL_100_SIZE);
            break;
         case 200:
            System.out.println("Price: $" + MODEL_200_PRICE);
            System.out.println("Size: $" + MODEL_200_SIZE);
            break;
         case 300:
            System.out.println("Price: $" + MODEL_300_PRICE);
            System.out.println("Size: $" + MODEL_300_SIZE);
            break;
         default:
            System.out.println("Invalid model number.");
      }
      
     }//end main
   
}//end class