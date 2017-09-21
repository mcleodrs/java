import java.util.*;
import java.util.Scanner;
import java.io.*;

class MidnightCoffeRoasters {

    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Page 374, In The Spotlight, Midnight Coffe Roasters
        String description;
        String another;
        int quantity;

        System.out.println("Please enter the new description");
            another = input.nextLine();
        while (another == "Y") {
            System.out.println("Please enter the description");
            description = input.nextLine();
            
            System.out.println("Please enter the quantity?");
            quantity = input.nextInt();
            
            another = "n";
        }//end while
        
        System.out.println("Do you want to enter another record? Enter Y for yes, or anything else for no");
        another = input.nextLine();
        System.out.println("Data has been written to the file coffee.dat");
    }//end main
}//end class


