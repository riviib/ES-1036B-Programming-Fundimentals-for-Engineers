package Q3;

/**
 * Rivka Belemsaga
 * 251421303
 * Feb. 9, 2025
 * task: Real numbers and their sums. Characters and their sums.
 */

import java.util.*; //import wildcard library
import Q1.MyMethods; //import a previous class to access methods from

public class AdditionOverload { //class header - AdditionOverload
    public static void main(String[] args){ //methods header - main
        Scanner in = new Scanner(System.in); //innitialize scanner

        System.out.println("****************************************\n" +"Full name: Rivka Belemsaga\n" +"Lab Exercise: 3, Question: 3\nProgram Descripton:Real numbers and their sums. Characters and their sums.\n"+"****************************************"); //print statement setup code displayed to screen with descriptive header

        System.out.println("Enter a real number: ");//promp user for input - number
        double num1 = in.nextDouble(); //receive user input and assign to variable
        System.out.println("Enter a second real number: "); //prompt user for input - number
        double num2 = in.nextDouble(); //receive user input and assign to variable
        double resultNum = addVals(num1,num2); //call method to add values and assign to variable
        System.out.printf("The sum of %.2f and %.2f is %.2f",num1,num2,resultNum); //output result to the user

        System.out.println("\n\nEnter a character: "); //prompt user for input - chaacter
        String tempS1 = in.next(); char c1 = tempS1.charAt(0); //receive user input and save only the first character
        System.out.println("Enter a second character: "); //prompt user for input - character
        String tempS2 = in.next(); char c2 = tempS2.charAt(0); //receive user unput and save only the first character
        char resultChar = addVals(c1,c2); //call method to add values and assign to variable
        System.out.printf("The sum of %c and %c is %c, whose equivilant integer value is %d.",c1,c2,resultChar,(int)(resultChar)); //output the result to the user

        System.out.println("\n\nEnter your full name: "); // prompt user for input - string
        String firstName = in.next(), lastName = in.nextLine(); //receive unput and save in 2 variables first and last name
        String name = addVals(firstName,lastName); //call method to concatenate strings
        System.out.printf("My name is %s.",name); //output results to user

        MyMethods.myFooter(3); //call MyMethods to finish off the code with the footer output
    }

    //addVals:function:add and return the sum of 2 real nubmers
    public static double addVals(double num1,double num2){//method header - addVals
        return num1+num2; //return the sum
    }

    //addVals:function:convert and sum ascii values of chars and return the resulting character
    public static char addVals(char a, char b){//method header - addVals
        int val1 = (int)a, val2 = (int)b; //convert characters to ascii values
        int finalVal = val1 + val2; //sum values
        return (char)finalVal; //cast value into string and return
    }

    //addVals:function:concetenate 2 strings and return resulting string
    public static String addVals(String a, String b){ //method header - addVals
        return a + b; //return a concetenated string
    }
}//end of class
