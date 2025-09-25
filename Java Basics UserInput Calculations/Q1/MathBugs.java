package Q1;

/**
 * Rivka Belemsaga
 * 251421303
 * Jan. 30, 2025
 * task: This code allows the user to input a 4-digit number, then separates the digits in order to calculate the RMS (root-mean-square) of the four digits together.
 */

import java.text.DecimalFormat;
import java.util.*; //import wildcard library

public class MathBugs { //class header = MathBugs
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //import scanner
        //open the print statement
        System.out.println("*************************************** \nFull Name: Rivka Belemsaga \nStudent Number: 251421303 \nDate: Jan. 30, 2025 \nBrief description of the task: Finding the RMS of the 4-digits you will enter :) \n***************************************");
        //now make a print statement to prompt the user for input
        System.out.println("Enter a 4-digit number: ");
        int number = in.nextInt(); //this receives the users input aka the 4-digit number
        //initialize all the variables
        int thousandsDigit = 0, hundredsDigit = 0, tensDigit = 0, onesDigit = 0; double rms = 0.0;
        thousandsDigit = number/1000; number %=1000; //reset numbers + set thousands digit
        System.out.println("Thousands Digit: " +thousandsDigit); //output thousands digit
        hundredsDigit = number/100; number %=100; //reset number + set hundreds digit
        System.out.println("Hundreds Digit: " +hundredsDigit); //output hundreds digit
        tensDigit = number/10; //set tens digit
        System.out.println("Tens Digit: " +tensDigit); //output tens digit
        onesDigit = number%10; //set ones digit
        System.out.println("Ones Digit: " +onesDigit); //output ones digit
        double RMS = Math.sqrt(((Math.pow(thousandsDigit,2)+Math.pow(hundredsDigit,2)+Math.pow(tensDigit,2)+Math.pow(onesDigit,2))/4)); // make the formula to calculate the rms
        DecimalFormat df = new DecimalFormat("0.00"); //set up to make output of values to 2decimal places
        //now make a print statement to output the value of the RMS - formated to 2 decimal points for user
        System.out.println("The RMS value of the above four digits is: " + df.format(RMS));
        System.out.println("***************************************");
    }
}
