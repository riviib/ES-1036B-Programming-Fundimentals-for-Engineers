package Q2;

/**
 * Rivka Belemsaga
 * 251421303
 * Jan. 30, 2025
 * Task: using the measurements input by the user in cm this code will output the volume of the cone based on said measurments.
 */

import java.text.DecimalFormat;
import java.util.*; //import wildcard library

public class ConeVolume { //class header = ConeVolime
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //import scanner
        //open the print statement
        System.out.println("*************************************** \nFull Name: Rivka Belemsaga \nStudent Number: 251421303 \nDate: Jan. 30, 2025 \nBrief description of the task: This task will help you calculate the volume of a cone using the measurements you input in cm. :) \n***************************************");
        //innitialize all the variables
        double height = 0.00, radius = 0.00, volume = 0.00;
        //now prompt the user for the input that will later be used for calculating the cones volume
        System.out.println("\n \nPlease enter the height of a cone: ");
        height = in.nextDouble(); //this receives the input for the variable -height
        //open print statement to prompt input for radius measurement
        System.out.println("Please enter the radius of the cone: ");
        radius = in.nextDouble(); //receive input for radius measurement
        volume = ((Math.PI * Math.pow(radius, 2) * height) / 3); //volume formula
        DecimalFormat df = new DecimalFormat("0.00"); //set up to make output of values to 2decimal places
        //the final print statement for the user giving them the volume of the cone for the measurements they previously input
        System.out.println("\nThe volume of a cone with radius " + df.format(radius) + "cm and height " + df.format(height) + "cm is: " + df.format(volume) + " cubic cm.");
    }
}

