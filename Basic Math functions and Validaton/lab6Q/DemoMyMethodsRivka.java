package lab6Q;

/**
 *Rivka Belemsaga
 *  * 251421303
 *  * March 15, 2025
 *  * task: This code lets users test math functions like power, factorial, sine, and cosine through a menu with input validation.
 */

import java.util.Scanner; // Imports the Scanner class for user input

public class DemoMyMethodsRivka { // Declares the public class named DemoMyMethodsRivka
    public static Scanner in = new Scanner(System.in); // Creates a Scanner object to read input from the user

    public static void main(String[] args) { // Main method - the entry point of the program
        // Calls the myHeader method from MyMethod class to display header info
        MyMethod.myHeader(6, 1, "This code lets users test math functions like power, factorial, sine, and cosine through a menu with input validation.");
        System.out.println("Testing Mathematical Functions:\n"); // Prints initial message about the program

        while (true) { // Infinite loop to keep displaying the menu until the user chooses to exit
            // Prints the menu options for the user
            System.out.println("\n========MENU========\na: Power Function\nb: Factorial Function\nc: Sine Function\nd: Cosine Function\ne: Exit\n====================\n");
            System.out.print("Enter your choice: "); // Prompts user for a menu choice

            // Reads the user's input and converts it to lowercase using myToLowerCase from MyMethod class
            char input = MyMethod.myToLowerCase(in.next().charAt(0));

            switch (input) { // Switch statement to handle the user's choice
                case 'a': // Case for the Power Function
                    System.out.println("\nPOWER FUNCTION: Calculating x to the power of y.\nEnter x: ");
                    double x = in.nextDouble(); // Reads the base value (x) as a double
                    System.out.print("Enter y: ");
                    int y = in.nextInt(); // Reads the exponent value (y) as an integer
                    // Calls myPow from MyMethod to calculate the result and displays it
                    System.out.printf("%.2f^%d = %.2f\n", x, y, MyMethod.myPow(x, y));
                    break; // Exits the case

                case 'b': // Case for the Factorial Function
                    System.out.println("\nFACTORIAL FUNCTION: Calculating factorial(n)."); // Prints description
                    int n; // Declares variable n
                    System.out.print("Enter n: "); // Prompts user for input
                    while (true) { // Loop to handle invalid input until valid value is provided
                        n = in.nextInt(); // Reads the input value
                        if (n >= 0) { // If input is valid (n >= 0), exit loop
                            break; // Ends the loop when valid input is provided
                        } else { // If input is invalid, prompt user to try again
                            System.out.print("n has to be >= 0; enter again: ");
                        }
                    }
                    // Calls myFactorial from MyMethod to calculate factorial and prints result
                    System.out.printf("%d! = %.2e\n", n, MyMethod.myFactorial(n));
                    break; // Exits the case

                case 'c': // Case for the Sine Function
                    System.out.println("\nSINE FUNCTION: Calculating sin(k) degree.\nEnter k in degrees: ");
                    double k = in.nextDouble(); // Reads the angle in degrees
                    // Calls myDegreeToRadian to convert degrees to radians and mySin to calculate sine
                    System.out.printf("sin(%.2f) = %.2f\n", k, MyMethod.mySin(MyMethod.myDegreeToRadian(k)));
                    break; // Exits the case

                case 'd': // Case for the Cosine Function
                    System.out.println("\nCOSINE FUNCTION: Calculating cos(m) degree.\nEnter m in degrees: ");
                    double m = in.nextDouble(); // Reads the angle in degrees
                    // Calls myDegreeToRadian to convert degrees to radians and myCos to calculate cosine
                    System.out.printf("cos(%.2f) = %.2f\n", m, MyMethod.myCos(MyMethod.myDegreeToRadian(m)));
                    break; // Exits the case

                case 'e': // Case for Exit
                    MyMethod.myFooter(1); // Calls myFooter from MyMethod to display closing message
                    return; // Ends the program

                default: // Case for invalid input
                    System.out.println("\nInvalid Choice!"); // Displays error message for invalid choice
            }
        }
    }
}

