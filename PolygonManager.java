//PolygonManager.java
//R.Scott McLeod
//Date 9/20/2017
//Determines the type of polygon described by user input of the number of sides.
import java.util.Scanner;

public class PolygonManager{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   int sides = 0;
   //triangle
   final int SIDES_TRIANGLE = 3;
   final String POLY_TRIANGLE = "triangle";
   //quadrilateral   
   final int SIDES_QUADRILATERAL = 4;
   final String POLY_QUADRILATERAL ="quadrilateral";
   //pentagon
   final int SIDES_PENTAGON = 5;
   final String POLY_PENTAGON ="pentagon";
   //hexagon 
   final int SIDES_HEXAGON = 6;
   final String POLY_HEXAGON ="hexagon";
   //septagon 
   final int SIDES_SEPTAGON = 7;
   final String POLY_SEPTAGON ="septagon";
   //octogon 
   final int SIDES_OCTOGON = 8;
   final String POLY_OCTOGON ="octogon";
   //nonagon
   final int SIDES_NONAGON = 9;
   final String POLY_NONAGON ="nonagon";
   //decagon 
   final int SIDES_DECAGON = 10;
   final String POLY_DECAGON ="decagon";

   //user input number of sides
   System.out.print("Please enter the number of sides for your polygon: ");
   sides = input.nextInt();
   
   //test if less than three sides
   if(sides < 3){
      System.out.println("A polygon cannot have " + sides + " side(s)!");
      }
      else{
         //switch/case statement determines the polygon entered by user
         switch (sides){
            case SIDES_TRIANGLE: System.out.println("Your polygon is a " + POLY_TRIANGLE + ".");   
                     break;
            case SIDES_QUADRILATERAL: System.out.println("Your polygon is a " + POLY_QUADRILATERAL + ".");   
                     break;
            case SIDES_PENTAGON: System.out.println("Your polygon is a " + POLY_PENTAGON + ".");   
                     break;
            case SIDES_HEXAGON: System.out.println("Your polygon is a " + POLY_HEXAGON + ".");   
                     break;
            case SIDES_SEPTAGON: System.out.println("Your polygon is a " + POLY_SEPTAGON + ".");   
                     break;
            case SIDES_OCTOGON: System.out.println("Your polygon is a " + POLY_OCTOGON + ".");   
                     break;
            case SIDES_NONAGON: System.out.println("Your polygon is a " + POLY_NONAGON + ".");   
                     break;
            case SIDES_DECAGON:System.out.println("Your polygon is a " + POLY_DECAGON + ".");   
                     break;
            default: System.out.println("Sorry, I can't identify your polygon.");
                     break;
         }//end case
      }//end if
   }//end main
}//end class