package Q1;

/**
 * Rivka Belemsaga
 * 251421303
 * Feb. 9, 2025
 * task: this code helps convert a measurment input from the user from inches into meters/centimeters.
 */

import java.util.*; //import the wildcard library

public class MyMethods { //class header, MyMethods
    public static void main(String[] args) { //method header, main
        System.out.println("****************************************\n" +"Full name: Rivka Belemsaga\n" +"Lab Exercise: 3, Question: 1\nProgram Descripton:This code helps convert measurments from inches to centimeters/meters.\n"+"****************************************\n"); //print statement setup code displayed to screen with descriptive header
        Scanner in = new Scanner(System.in); // here you innitialize the scanner
        System.out.println("Enter the height in inches: "); // prompt the user for the height value in inches
        double height = in.nextDouble(); //prep to receive user input from previous question for height
        double centimeters = inchesToCentimeters(height); //call inchesToCentimeters method and save the returned value
        System.out.printf("%.2f inches = %.2f cm\n",height,centimeters); //output conversion
        int meters = (int)centimeters/100; //formula to calculate meters
        double remainderCm = centimeters%100; //calculate the remaining centimeters
        System.out.printf("%.2f cm = %d m %.2f cm",centimeters,meters,remainderCm); // output the meters and centimeters breakdown of the value
        myFooter(1); //call myFooter - to output the final message
    }


    // myFooter: function: output the screen final message with the question number of this code
    public static void myFooter(int questionNum){ //method header, myFooter
        System.out.printf("\n\n*** Signing off from Question %d - Rivka :0 ***",questionNum); //print statement, complete the code with the final concluding message
    }

    //inchesToCentimeters: function: calculate and output the conversion of inches to centimeters
    public static double inchesToCentimeters (double inches) { //method header - inchesToCentimeter
        double centimeters = inches*2.54; //set up the conversion for inch to cm and save value
        return centimeters; //return the converted number
    }
} //end of class
