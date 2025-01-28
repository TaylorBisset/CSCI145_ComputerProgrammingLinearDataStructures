# CSCI 145 Homework Assignment 1 - Dice Roll

## Overview
This project serves as a review of the major concepts covered in an introductory programming course (e.g.,
CSCI 141) with the addition of classes and objects. The assignment focuses on variables, loops, conditionals,
and generating random numbers. If your previous programming experience is in Python, this assignment
will help you transition to Java syntax.

## Rolling Dice
If you have five, seven-sided dice, and you roll them 1000 times, then about how many times should you
expect to see the same value on all five dice? In this program, you will simulate rolling five, 7-sided dice, a
total of 1000 times, and tally the number of times that all of them are the same value. The values of the
seven faces of each dice are the numbers 1, 2, 3, 4, 5, 6, and 7. The program outputs on which roll all dice
showed the same number and what that number was, as well as a final tally of the count of times that the
dice showed the same numbers.

Several invocations and outputs are shown here:

```bash
$java DiceRollem
Roll number 554 all dice show 2.
A total of 1 tosses were the same.

$java DiceRollem
A total of 0 tosses were the same.

$java DiceRollem
Roll number 244 all dice show 4.
Roll number 704 all dice show 5.
Roll number 845 all dice show 2.
A total of 3 tosses were the same.
```

## Code/Program Detailed Instructions
There are two java classes that you must write, named **Dice.java** and **DiceRollem.java**.
The **Dice.java** file defines the Dice class that has a single variable (field) of type integer, named *diceVal*,
and a single method, that does not return a value, that is called `roll()`. The `roll()` method (function)
sets the value of the diceVal variable to be a random number between 1 and 7. You will need to look in
the textbook, else online, to see how to generate a random number in Java.

The **DiceRollem.java** file has a single class with a single method, the `main()` method. The `main()` method
does the following things:

• Creates five objects of type Dice.
• Defines an accumulator variable, and assigns it the value 0.
• Runs a single for loop for 1000 iterations. During each iteration:

– Each of the 5 dice is rolled by invoking their `roll()` methods.
– Checks if the values of all 5 dice are equal, and this is done using a SINGLE if statement with a
single compound Boolean expression.
– If the conditional evaluates to true, then:
∗ Increment the accumulator variable.
∗ Print a single line that specifies the roll number, and the value of what all the dice showed.
• Prints to the screen the total tally of times that all five dice during a single toss were the same value.

## Requirements
• The names of your java files must be **DiceRollem.java** and **Dice.java**.
• The `roll()` method must assign a value of *diceVal* in the range 1 through 7. The value of *diceVal*
cannot be assigned the integer 0.
• The `main()` method in **DiceRollem.java** must create 5 instances of a Dice object, and contain a single
for loop.
• You must make your program output look exactly like the examples above.

## Submission and Grading
### Submission
Once you have finished all of the above, add, commit and push **Dice.java** and **DiceRollem.java** to your
course repository main branch. Note that these file should be directly within a hw1 subdirectory of your
repository (spelling, spacing, and capitalization matter).

### Rubric
This project is worth 10 points. Points will be awarded as follows:

| **Criteria** | **Points** |
| --- | --- |
| Code compiles and follows all requirements | 2 |
| Random number generation in Dice.java is correct | 1 |
| Correct creation of five Dice objects | 1 |
| Proper implementation of the for loop | 1 |
| Correct condition checking for all dice having the same value | 2 |
| Accurate tallying and output of results | 2 |
| Output matches the specified format | 1 |
| **Total** | **10 Points** |

### Deductions
• Missing comments explaining code logic: Up to 10% deduction.
• Programs that do not compile may receive zero credit.
• Failing to follow submission instructions may result in point deductions.

## Acknowledgments
Thanks to Filip Jagodzinski and Moushumi Sharmin for producing and refining this assignment.