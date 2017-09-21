/*
R Scott McLeod -  ITECH
Bug Collector Page 228 #1
Loop through a week and count the number of bugs collected.
Display the number of bugs collected that day and how many days left
Display the total number of bugs collected and the average number of bugs collected per day
BugCollector.java
*/
import java.util.*;

public class BugCollector {
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Page 228 #1 Bug Collector
        //declare and initialize variables
        int numBugs = 0;
        int totalBugs = 0;
        final int WEEK = 7;
        
        //get how many bugs collected today
        System.out.println("How many bugs did you collect today?");
        numBugs = input.nextInt();
                
        //loop through the WEEK collecting bugs
        for (int numDays = 1 ; numDays < WEEK ; numDays += 1) {
            //totalBugs accumulates numBugs each day
            totalBugs = totalBugs + numBugs;
            //find how many days left to find bugs
            int daysLeft = WEEK - numDays;
            System.out.println("You have collected " + totalBugs + " so far.\nYou have " + daysLeft + " left.\nGo Get Those Bugs!");
            System.out.println("How many bugs did you collect today?");
            numBugs = input.nextInt();
        }
        //display totalBugs collected for the week
        System.out.println("You collected " + totalBugs + " bugs, this week.");
        
        //find and display the average number of bugs caught per day
        double averageBugs = totalBugs / WEEK;
        System.out.println("This week you collected an average of " + averageBugs + " a day");
    }
}
/*
  ----jGRASP exec: java BugCollector
 How many bugs did you collect today?
 1
 You have collected 1 so far.
 You have 6 left.
 Go Get Those Bugs!
 How many bugs did you collect today?
 2
 You have collected 3 so far.
 You have 5 left.
 Go Get Those Bugs!
 How many bugs did you collect today?
 3
 You have collected 6 so far.
 You have 4 left.
 Go Get Those Bugs!
 How many bugs did you collect today?
 4
 You have collected 10 so far.
 You have 3 left.
 Go Get Those Bugs!
 How many bugs did you collect today?
 5
 You have collected 15 so far.
 You have 2 left.
 Go Get Those Bugs!
 How many bugs did you collect today?
 6
 You have collected 21 so far.
 You have 1 left.
 Go Get Those Bugs!
 How many bugs did you collect today?
 7
 You collected 21 bugs, this week.
 This week you collected an average of 3.0 a day
 
  ----jGRASP: operation complete.
*/