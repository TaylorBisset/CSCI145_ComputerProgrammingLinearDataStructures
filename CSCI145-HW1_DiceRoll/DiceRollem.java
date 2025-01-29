// DiceRollem.java 

// This class is responsible for running the program. 

// Author: Taylor Bisset 
// Description: Homework 1, CSCI 145 
// Date: 28 Jan 2025 

// Main class that rolls the dice. 
public class DiceRollem { 
    public static void main(String[] args) { 
        // Create 5 new dice objects. 
        Dice dice1 = new Dice(); 
        Dice dice2 = new Dice(); 
        Dice dice3 = new Dice(); 
        Dice dice4 = new Dice(); 
        Dice dice5 = new Dice(); 

        int allEqual = 0; // Accumulator variable set to 0. 

        // Loop 1000 times. 
        for (int i = 0; i < 1000; i++) { 
            // Roll each die. 
            dice1.roll(); 
            dice2.roll(); 
            dice3.roll(); 
            dice4.roll(); 
            dice5.roll(); 

            // Check if all the dice have the same value. 
            if (dice1.diceVal == dice2.diceVal && 
            dice1.diceVal == dice3.diceVal && 
            dice1.diceVal == dice4.diceVal && 
            dice1.diceVal == dice5.diceVal) { 
                // Print the roll number and matching value. 
                System.out.println("Roll number " + i + " all dice show " + dice1.diceVal + "."); 
                // Increment with matching rolls. 
                allEqual++; 
            } 
        } 
        // Display the total number of matches. 
        System.out.println("A total of " + allEqual + " tosses were the same."); 
    } 
} 
 