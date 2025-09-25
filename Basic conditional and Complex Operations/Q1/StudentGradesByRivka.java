package Q1;

/**
 *Rivka Belemsaga
 *  * 251421303
 *  * March 9, 2025
 *  * task: This code collects and displays information for two students, compares their scores, and outputs who scored higher or if their scores are equal.
 */

import java.util.*; // Import Scanner class for user input

public class StudentGradesByRivka { // Class definition for StudentGradesByRivka
    public static Scanner input = new Scanner(System.in); // Scanner object for input
    public static int counter = 0; // Counter to track number of students entered

    // Method to collect student information and assign values to the Student object
    public static void dataEntry(Student s) {
        counter++; // Increment student counter
        System.out.println("Student " + counter + ":"); // Display student number prompt
        System.out.print("Enter Student Number: "); // Prompt for student number
        int sn = input.nextInt(); // Read student number from input
        input.nextLine();  // Clear buffer to handle nextLine() properly
        System.out.print("Enter Student's full Name: "); // Prompt for student name
        String nm = input.nextLine(); // Read student's full name
        System.out.print("Enter " + nm + "'s score: "); // Prompt for student score
        int sc = input.nextInt(); // Read student's score

        // Assign values to Student object using setter methods
        s.setStudentNumber(sn);
        s.setName(nm);
        s.setScore(sc);
    }

    // Method to compare grades of two Student objects
    public static int compareGrades(Student s1, Student s2) {
        return Integer.compare(s1.getScore(), s2.getScore()); // Compare scores directly
    }

    // myHeader: Displays formatted header with details about the lab and question
    public static void myHeader (int labNum, int questionNum, String description) { // Header method definition
        System.out.printf("**************************************************\n" +
                "Full name: Rivka Belemsaga\nLab Exercice: %d, Question: %d\nProgram Description: %s\n" +
                "**************************************************\n", labNum, questionNum, description); // Formatted output
    }

    // myFooter: Displays closing message with the question number
    public static void myFooter(int questionNum) { // Footer method definition
        System.out.printf("\n*** Signing off from Question %d - Rivka :0 ***", questionNum); // Print concluding message
    }

    public static void main(String[] args) { // Main method - starting point of the program
        myHeader(5, 1, "This code collects and displays information for two students, compares their scores, and outputs who scored higher or if their scores are equal."); // Call to display header

        Student s1 = new Student(); // Instantiate Student object s1
        System.out.println("Here is my grade-info: "); // Display initial student info
        s1.printInfo(); // Print details for s1

        Student s2 = new Student(); // Instantiate Student object s2

        System.out.println("\nData entry follows.....\n"); // Prompt for data entry
        dataEntry(s1); // Collect data for student s1
        System.out.print("\n"); // Blank line for clarity
        dataEntry(s2); // Collect data for student s2

        // Display collected student details
        System.out.println("Here is the detail info..");
        System.out.println("Name                Student Number     Score (Letter Grade)");
        System.out.println("---------------------------------------------------------------");
        s1.printInfo(); // Print details for s1
        s2.printInfo(); // Print details for s2
        System.out.println("---------------------------------------------------------------");

        // Compare grades and print appropriate message
        int comparison = compareGrades(s1, s2);
        if (comparison > 0) {
            System.out.println("Note: " + s1.getName() + " scored higher than " + s2.getName() + ".");
        } else if (comparison < 0) {
            System.out.println("Note: " + s2.getName() + " scored higher than " + s1.getName() + ".");
        } else {
            System.out.println("Note: Their scores are equal!");
        }

        myFooter(1); // Call to display footer
    }
}

