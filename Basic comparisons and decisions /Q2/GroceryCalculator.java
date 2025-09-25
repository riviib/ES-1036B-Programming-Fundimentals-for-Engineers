package Q2;

/**
 *Rivka Belemsaga
 *  * 251421303
 *  * Feb. 23, 2025
 *  * task: Determine the most economical item at the grocery store and help the user checkout.
 */

import java.util.*; //import wildcard library
import Q1.StudentGradesByRivka; //import previous class to access methods from

public class GroceryCalculator {//class header GroceryCalculator
    public static void main(String[] args){

        //call myHeader from Q1 to set up starting output
        StudentGradesByRivka.myHeader(4,2,"Determine the most economical item at the grocery store and help the user checkout.");

        Scanner in = new Scanner(System.in);//innitialize scanner

        //prompt the user for egg prices
        System.out.println("\nlet's go shopping...\n\nEnter the price of two dozen eggs: $");
        double TwoDozen = in.nextDouble();//receive price of 24 eggs and store in variable
        System.out.println("Enter the price of one dozen eggs: $");
        double OneDozen = in.nextDouble();//receive price of 12 eggs and store in variable
        System.out.println("Enter the price of a half-dozen eggs: $");
        double HalfDozen = in.nextDouble();//receive price of 6 eggs and store in variable

        // Calculate unit prices
        double unitTwoDozen = TwoDozen / 24;//unit price for 24 eggs
        double unitOneDozen = OneDozen / 12;//unit price for 12 eggs
        double unitHalfDozen = HalfDozen / 6;//unit price for 6 eggs

        // Determine the most economical option
        String bestOption;//give besOption a data type
        double bestPrice;//give bestPrice a data type
        if (unitHalfDozen <= unitOneDozen && unitHalfDozen <= unitTwoDozen){
            bestOption = "a Half Dozen";
            bestPrice = HalfDozen;
        }
        else if (unitOneDozen <= unitTwoDozen && unitOneDozen <= unitHalfDozen) { //if one dozen is the most economical
            bestOption = "one dozen";
            bestPrice = OneDozen;
        }
        else { //if two dozen is the most economical
            bestOption = "two dozen";
            bestPrice = TwoDozen;
        }

        //display the most economical option to the user
        System.out.printf("The $%.2f carton for %s eggs is most economical.\n", bestPrice, bestOption);

        // Ask the user if they want to purchase
        System.out.print("Would you like to buy the eggs (yes/no)? ");
        in.nextLine();//consume new line character
        String purchaseResponse = in.nextLine().trim().toLowerCase();//receive user input and process, trim answer, and convert all characters to lower case

        if (purchaseResponse.equals("yes")) {//if the user wants to buy the eggs
            System.out.println("\nGreat! Please pay for the eggs.");
            System.out.print("Enter the cash amount: $");
            double cash = 0.0; //innitialize cash variable
            while (true) { //repeat until the user inputs enough cash to purchase bestOption
                cash = in.nextDouble();//receive cash value from user
                if (cash >= bestPrice) {
                    break;//exit the loop
                }
                else {//if cash amount entered is not enough
                    System.out.println("\nSorry, this is not enough money. Please enter the new cash amount: $");
                }
            }
            double change = cash - bestPrice;//calculate the change to give back to the user
            System.out.printf("\nThank you for your purchase. Your change is $%.2f\n\n", change);//display change to user
        }
        else {//if user doesn't want to purchase the eggs
            System.out.println("\nOk. See you later!\n");
        }

        //call myFooter from Q1 to finish up code with footer info
        StudentGradesByRivka.myFooter(2);
    }
}
