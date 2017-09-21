/*
R Scott McLeod - ITECH, Intro Java, 9/7/17
Programming Assignment 9 - Exercise 3, page 399
FunReadingFiles.java
*/
import java.util.*;//for Scanner and Random
import java.io.*;// for File classes


public class FunReadingFiles{
      public static void main(String[] args)throws IOException {
      String filename = "numbers.dat";
      File myFile = new File(filename);
      int total = 0;//declare and initialize
      if(!myFile.exists()){
      System.out.println("The file " + filename + " does not exist on this volume.");
      System.exit(0);
      }//end if validation
      Scanner inFile = new Scanner(myFile);
      
      while(inFile.hasNext()){
         total = total + inFile.nextInt();
      }//end while loop
      inFile.close();
      System.out.println("The total of all the nubmers is " + total);
      }//end main
}//end class

/*
FROM NumberGenerator
      Random generator = new Random();
      int evenCounter = 0;
      int oddCounter = 0;
      int randNum;

      
      for(int i = 0; i < 100; i++){
          randNum = generator.nextInt(100);//get the random #
          //try a conditional expression modulus
         //int x = (randNum % 2 == 0) ? evenCounter++ : oddCounter++;
         if (randNum % 2 == 0){
            evenCounter++;
            }else
            oddCounter++;
            
         System.out.print(randNum + "\t");
         if ((i + 1)% 10 == 0)  
            System.out.println();
      }//end for loop
            System.out.print("\nThere are " + evenCounter + " even numbers, and " + oddCounter + " odd numbers");
      
*/
