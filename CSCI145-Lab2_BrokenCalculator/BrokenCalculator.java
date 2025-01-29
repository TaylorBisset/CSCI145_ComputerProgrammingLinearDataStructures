// Author: Taylor Bisset
// Description: Lab 2, CSCI 145
// Date: Jan 22,2025
public class BrokenCalculator {
    public static void main(String[] args) {
        // A. Get two integers from the command line
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        
        // B. Print out "Fixing notation!"
        System.out.println("Fixing notation!");

        // C. Extract the integer and decimal portions 
        int num1Int = num1 / 10;
        int num1Dec = num1 % 10;
        
        // D. Print the reformatted first input
        System.out.println("The value of " + num1 + " reformatted is " + num1Int + "." + num1Dec);
        
        // E. Extract the integer and decimal portions
        int num2Int = num2 / 10;
        int num2Dec = num2 % 10;

        // F. Print the reformatted second input
        System.out.println("The value of " + num2 + " reformatted is " + num2Int + "." + num2Dec);

        // G. Perform calculations for the product of the reformatted inputs
        int multiplyNumbers = ((num1Int * num2Int)*100 + (num1Int * num2Dec)*10 + (num2Int * num1Dec)*10 + (num1Dec * num2Dec));
        int multiplyInt = multiplyNumbers / 100;
        int multiplyDec = multiplyNumbers % 100;
        
        // H. Print out the final result
        if (multiplyDec % 10 < 10) {
            System.out.println("The product of " + num1Int + "." + num1Dec + " and " + 
            num2Int + "." + num2Dec + " is " + multiplyInt + ".0" + multiplyDec);
        }
        else {
            System.out.println("The product of " + num1Int + "." + num1Dec + " and " + 
            num2Int + "." + num2Dec + " is " + multiplyInt + "." + multiplyDec);
        }
        
    }
}
