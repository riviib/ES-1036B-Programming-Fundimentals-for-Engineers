package Q2;

/**
 * Rivka Belemsaga
 * 251421303
 * Feb. 9, 2025
 * task: A diologue with multiple conversions between fahrenheit and kelvin.
 */

import java.util.*; //import the wildcard library
import Q1.MyMethods; //import the previous class to access the methods from

public class IceBreakers { //class header - IceBreakers
    public static void main(String[] args){ //method header, main
        Scanner in = new Scanner (System.in); //innitialize the Scanner

        System.out.println("****************************************\n" +"Full name: Rivka Belemsaga\n" +"Lab Exercise: 3, Question: 2\nProgram Descripton: A diologue with multiple conversions between fahrenheit and kelvin.\n"+"****************************************\n"); //print statement setup code displayed to screen with descriptive header

        System.out.println("What is the temperature right now?: "); //print ipening line of diolog and prompt user for kelvin temeprature
        double kelvin = in.nextDouble(); //receive the user input + save to variable
        double fahrenheit = kelvinToFahrenheit(kelvin); //save converted value
        System.out.printf("\tI know you're used to Fahrenheit scale. %.2f deg-K is %.2f deg-F.",kelvin, fahrenheit); //print the continuation of the diologue

        System.out.print("\nI am cold! What is the indoor temperature?: "); //continue diologue and prompt user for new kelvin temp.
        kelvin = in.nextDouble(); //receive and save user input
        System.out.printf("\t%.2f deg-K is %.2f deg-F.",kelvin,kelvinToFahrenheit(kelvin)); //continue convo

        System.out.println("\nI see. Would you crank up the temperature?"); //continue to print convo
        System.out.println("\tOk I will! What temperature should I set the thermostat to?: ");
        fahrenheit = in.nextDouble(); //receive user input
        System.out.printf("\tOh you mean %.2f deg Fahrenheit! Here you go." + "\n\tby the way, %.2f deg-F is %.2f deg-K.",fahrenheit, fahrenheit,fahrenheitToKelvin(fahrenheit)); //continue convo and output conversion

        System.out.println("Thank you! It is very nice of you.");//final diologue line

        MyMethods.myFooter(2); //call MyMethods to finish off the code with the footer output
    }

    //kelvinToFahrenheit:function:convert kelvin to fahrenheit
    public static double kelvinToFahrenheit(double kelvin){//method header - kelvinToFahrenheit
        return (((kelvin-273)/5)*9)+32; //return converted value
    }

    //fahrenheitToKelvin:function:convert fahrenheit to kelvin
    public static double fahrenheitToKelvin(double fahrenheit){ //method header - fahrenheitToKelvin
        return (fahrenheit-32)/9*5+273; //return converted value
    }
}//end of class
