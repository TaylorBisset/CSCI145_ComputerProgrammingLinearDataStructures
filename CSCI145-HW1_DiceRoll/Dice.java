// Dice.java 

// This class controls the rolling of the dice. 

// Author: Taylor Bisset 
// Description: Homework 1, CSCI 145 
// Date: 28 Jan 2025 

import java.util.Random; 

// Dice class represents a single die. 
public class Dice { 
    // Store the rolled value. 
    int diceVal; 

    // Method to "roll" the die. 
    public void roll() { 
        Random randomNum = new Random(); 
        diceVal = randomNum.nextInt(7) + 1; // Creates a random number between 1 and 7. 
    } 
} 
 