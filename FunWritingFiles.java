/*
R Scott McLeod - ITECH, Intro Java, 9/7/17
Programming Assignment 9 - Exercise 3, page 399
FunWritingFiles.java

*/
import java.util.*;//for Scanner and Random
import java.io.*;// for File classes


public class FunWritingFiles{
      public static void main(String[] args)throws IOException {
      Random generator = new Random();
      int randNum;
      String filename = "numbers.dat";
      File myFile  = new File(filename);
      PrintWriter outFile = new PrintWriter(myFile);
         
         
         for(int i = 0; i < 100; i++){
             randNum = generator.nextInt(100);//get the random #
             
            
                        
            outFile.print(randNum + "\t");
            if ((i + 1)% 10 == 0)  
               outFile.println();
         }//end for loop
         
         outFile.close();
         System.out.println("Data written to the file.");
         //close File
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
