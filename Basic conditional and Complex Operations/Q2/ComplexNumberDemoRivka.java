package Q2;

/**
 *Rivka Belemsaga
 *  * 251421303
 *  * March 9, 2025
 *  * task: This code lets the user enter two complex numbers and performs addition and multiplication, displaying the results.
 */

import java.util.*;  // Import the Scanner and other utility classes
import Q1.StudentGradesByRivka;  // Import custom class for handling student grades

public class ComplexNumberDemoRivka {  // Define the ComplexNumberDemoRivka class

    public static Scanner input = new Scanner(System.in);  // Create a static Scanner object for user input
    public static int counter = 0;  // Static counter to track the number of complex numbers entered

    public static ComplexNumber dataEntry() {  // Method to input data for a complex number
        counter++;  // Increment the counter each time a complex number is entered
        System.out.println("Complex number " + counter + " data......");  // Display prompt for current complex number
        System.out.print("Enter the real term: ");  // Ask the user for the real part of the complex number
        double real = input.nextDouble();  // Get the real part from user input
        System.out.print("Enter the imaginary term: ");  // Ask the user for the imaginary part of the complex number
        double imaginary = input.nextDouble();  // Get the imaginary part from user input
        return new ComplexNumber(real, imaginary);  // Return a new ComplexNumber object created with the entered values
    }

    public static ComplexNumber complexAdder(ComplexNumber x, ComplexNumber y) {  // Method to add two complex numbers
        return new ComplexNumber(x.getReal() + y.getReal(), x.getImaginary() + y.getImaginary());  // Return new complex number with added real and imaginary parts
    }

    public static ComplexNumber complexMultiplier(ComplexNumber x, ComplexNumber y) {  // Method to multiply two complex numbers
        // Calculate real and imaginary parts of the product using the formula for complex multiplication
        double realPart = (x.getReal() * y.getReal()) - (x.getImaginary() * y.getImaginary());
        double imaginaryPart = (x.getImaginary() * y.getReal()) + (x.getReal() * y.getImaginary());
        return new ComplexNumber(realPart, imaginaryPart);  // Return the product as a new ComplexNumber object
    }

    public static void main(String[] args) {  // Main method to run the program
        StudentGradesByRivka.myHeader(5, 2, "The code lets the user enter two complex numbers and performs addition and multiplication, displaying the results.");  // Display header information from the StudentGradesByRivka class

        System.out.print("\n");  // Print a newline for formatting
        ComplexNumber x = dataEntry();  // Call dataEntry method to get the first complex number
        System.out.print("\n");  // Print a newline for formatting
        ComplexNumber y = dataEntry();  // Call dataEntry method to get the second complex number

        System.out.println("\nYou have entered the following two complex numbers x and y:");  // Prompt for entered complex numbers
        System.out.print("x = "); x.displayRecForm();  // Display the first complex number in rectangular form
        System.out.print("y = "); y.displayRecForm();  // Display the second complex number in rectangular form

        System.out.println("\nHere are the results of the arithmetic operations:");  // Print a message indicating arithmetic results
        ComplexNumber addRes = complexAdder(x, y);  // Call complexAdder to add the two complex numbers
        System.out.printf("x + y = "); addRes.displayRecForm();  // Display the sum in rectangular form
        System.out.printf(", Magnitude: %.2f, Angle: %.2f degrees\n", addRes.getMagnitude(), addRes.getAngle());  // Display magnitude and angle of the sum

        ComplexNumber mulRes = complexMultiplier(x, y);  // Call complexMultiplier to multiply the two complex numbers
        System.out.printf("x * y = "); mulRes.displayRecForm();  // Display the product in rectangular form
        System.out.printf(", Magnitude: %.2f, Angle: %.2f degrees\n", mulRes.getMagnitude(), mulRes.getAngle());  // Display magnitude and angle of the product

        StudentGradesByRivka.myFooter(2);  // Call the footer method from the StudentGradesByRivka class
    }
}

