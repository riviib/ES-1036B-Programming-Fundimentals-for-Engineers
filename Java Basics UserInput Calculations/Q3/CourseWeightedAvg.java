package Q3;

/**
 * Rivka Belemsaga
 * 251421303
 * Jan. 30, 2025
 * task: This task helps the user calculate their course weighed average based on their 3 assignments.
 */

import java.text.DecimalFormat;
import java.util.*; //import wildcard library

public class CourseWeightedAvg { //class header = CourseWeightedAvg
    public static void main(String[] args){
        Scanner in = new Scanner(System.in); //import scanner
        //open the print statement
        System.out.println("*************************************** \nFull Name: Rivka Belemsaga \nStudent Number: 251421303 \nDate: Jan. 30, 2025 \nBrief description of the task: This task helps the user calculate their course weighed average based on their 3 assignments :) \n***************************************");
        double grade1 = 0.00, grade2 = 0.00, grade3 = 0.00, grd1_WGT = 0.00, grd2_WGT = 0.00, grd3_WGT = 0.00, finalGrade = 0.00 ; //innitialize all the variables
        grd1_WGT = 0.2; //assign weight for grade 1
        grd2_WGT = 0.3; //assign weight for grade 2
        grd3_WGT = 0.5; //assign weight for grade 3
        System.out.println("\n \nInput the first grade: "); //print statement for user input - grade1
        grade1 = in.nextDouble(); //user input for grade 1
        System.out.println("Input the second grade: "); //print statement for user input - grade2
        grade2 = in.nextDouble(); //user input for grade 2
        System.out.println("Input the third grade: "); //print statement for user input - grade 3
        grade3 = in.nextDouble(); //user input for grade 3
        finalGrade = ((grade1*grd1_WGT)+(grade2*grd2_WGT)+(grade3*grd3_WGT)); //formula go calculate final grade using assignments' weights
        DecimalFormat df = new DecimalFormat("0.00"); //set up to make output of finalGrade 2 decimal places
        System.out.println("\nThe course grade is: " + df.format(finalGrade)); //final print statement presenting the user with the course weighed average
    }
}
