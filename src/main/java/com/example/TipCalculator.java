package com.example;
import java.util.Scanner;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter cost: ");
        // cost = scan.nextDouble();
        // scan.nextLine();
        // System.out.println("Enter percent for tip in integer form:");
        // percent = scan.nextInt();
        // scan.nextLine();
        // System.out.println("Enter number of people: ");
        // people = scan.nextInt();
        // scan.nextLine();

        System.out.println(Math.round(((percent / 100.0) * cost) * 100) / 100.0);
        double tip = (percent / 100.0) * cost;
        double totalBillWithTip = cost + tip;
        double perPersonCostBeforeTip = cost / people;
        double tipPerPerson = tip / people;
        double totalCostPerPerson = totalBillWithTip / people; //I figured out how to round from https://www.geeksforgeeks.org/java/java-math-round-method/ and CHATGPT
        
        // I used the adjument CHATGPT provided me to fix a bug, CHATGPT - Round each only when building the string
        
        String result = "-------------------------------\n" +
                    "Total bill before tip: $" + Math.round(cost * 100.0) / 100.0 + "\n" +
                    "Total percentage: " + percent + "%\n" +
                    "Total tip: $" + Math.round(tip * 100.0) / 100.0 + "\n" +
                    "Total Bill with tip: $" + Math.round(totalBillWithTip * 100.0) / 100.0 + "\n" +
                    "Per person cost before tip: $" + Math.round(perPersonCostBeforeTip * 100.0) / 100.0 + "\n" +
                    "Tip per person: $" + Math.round(tipPerPerson * 100.0) / 100.0 + "\n" +
                    "Total cost per person: $" + Math.round(totalCostPerPerson * 100.0) / 100.0 + "\n" +
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
        System.out.println(calculateTip(people,percent,cost));
        System.out.println(extraCredit(people, percent, cost));
    }
}
        
