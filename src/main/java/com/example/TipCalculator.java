package com.example;
import java.util.Scanner;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter cost: ");
    cost = scan.nextDouble();
    scan.nextLine();
    System.out.println("Enter percent for tip in integer form:");
    percent = scan.nextInt();
    scan.nextLine();
    System.out.println("Enter number of people: ");
    people = scan.nextInt();
    scan.nextLine();

    double tip = (Math.round((percent / 100 * cost) * 100)) / 100; //I figured out how to round from https://www.geeksforgeeks.org/java/java-math-round-method/
    double totalBillWithTip = (Math.round((tip + cost) * 100)) / 100;
    double perPersonCostBeforeTip = (Math.round((cost / people) * 100) / 100);
    double tipPerPerson = tip / people;
    double totalCostPerPerson = perPersonCostBeforeTip + tipPerPerson;

    
    scan.close();
    

        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + tip + "\n" +
                       "Total Bill with tip: $" + totalBillWithTip + "\n" +
                       "Per person cost before tip: $" + perPersonCostBeforeTip + "\n" +
                       "Tip per person: $" + tipPerPerson + "\n" +
                       "Total cost per person: $" + totalCostPerPerson + "\n" +
                       "-------------------------------\n";

        return result;
    }

    public static String extraCredit(int people, int percent, double cost) {
        String result = "Extra credit not implemented";
        boolean condition = true;
    
        //  COPY AND PASTE YOUR PROGRAM FROM calculateTip() HERE 

        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops

        while (condition) {
            //enter your code here 
            System.out.println("placeholder");
            condition = false;
    
        }

        return result;
    }
    
    
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people=10; 
        int percent=8;
        double cost=10.5;              
        //System.out.println(calculateTip(people,percent,cost));
        System.out.println(extraCredit(people, percent, cost));
    }
}
        
