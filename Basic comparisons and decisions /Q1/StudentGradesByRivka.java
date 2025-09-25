package Q1;

import java.util.Scanner;

/**
 *Rivka Belemsaga
 *  * 251421303
 *  * Feb. 23, 2025
 *  * task: This code collects and displays information for two students, compares their scores, and outputs who scored higher or if their scores are equal.
 */

public class StudentGradesByRivka {//class header, StudentGradesByRivka


    public static void main(String[] args){ //main method
        myHeader(4,1,"This code collects and displays information for two students, compares their scores, and outputs who scored higher or if their scores are equal.");//call my header to display header info

        Scanner in = new Scanner(System.in); // here you innitialize the scanner

        //inputs for student 1
        System.out.println("\nData entry follows.....\n\nStudent 1: \n Enter student number: ");//prompt user for studentnumber1
        int StudentNumber1 = in.nextInt();//receive user input and assign to variable
        in.nextLine();//consume new line character
        System.out.println("Enter student's full name: ");//prompt the user for name1
        String name1 = in.nextLine();//receive user input and assign to variable
        System.out.printf("Enter %s's score: ", name1);//prompt user for score1
        int score1 = in.nextInt();//receive user input and assign to variable

        //inputs for student 2
        System.out.println("\nStudent 2: \n Enter student number: ");//prompt user for studentnumber2
        int StudentNumber2 = in.nextInt();//receive user input and assign to variable
        in.nextLine();//consume new line character
        System.out.println("Enter student's full name: ");//prompt the user for name2
        String name2 = in.nextLine();//receive user input and assign to variable
        System.out.printf("Enter %s's score: ", name2);//prompt user for score2
        int score2 = in.nextInt();//receive user input and assign to variable

        //call DisplayStudentInto
        DisplayStudentInfo(name1, StudentNumber1, score1, name2, StudentNumber2, score2);

        int comparisonResult = CompareGrades(score1, score2);//call CompareGrades to know which output to produce in regards the student1 vs student2 grades
        if (comparisonResult == 1) {
            System.out.println("\n" + name1 + " scored higher than " + name2 + ".");//output is sudent1 scored highter
        } else if (comparisonResult == -1) {
            System.out.println("\n" + name2 + " scored higher than " + name1 + ".");//output if student2 scored highter
        } else {
            System.out.println("\n" + "Their scores are equal!");//output if both students got the same score
        }

        myFooter(1);//call myFooter to display footer info
    }

    //myHeader: function: setup starting output to screen with important information about this code
    public static void myHeader (int labNum, int questionNum, String description){ //method header, myHeader
        System.out.printf("**************************************************\n" + "Full name: Rivka Belemsaga\nLab Exercice: %d, Question: %d\nProgram Description: %s\n" + "**************************************************\n", labNum, questionNum, description);
    }

    // myFooter: function: output the screen final message with the question number of this code
    public static void myFooter(int questionNum){ //method header, myFooter
        System.out.printf("\n*** Signing off from Question %d - Rivka :0 ***",questionNum); //print statement, complete the code with the final concluding message
    }

    //GetLetterGrade: function: input student score and receive letter grade based on score value
    public static String getLetterGrade(int score){
        if (score>=90){//if score is above 90
            return "A+";
        }
        else if (score>=80){//if score is above 80
            return "A-";
        }
        else if (score>=70){//if score is above 70
            return "B+";
        }
        else if (score>=60){//if score is above 60
            return "B-";
        }
        else if (score>=50){//if score is above 50
            return "C+";
        }
        else if (score>=40){//if score is above 40
            return "C-";
        }
        else if (score>=30){//if score is above 30
            return "D";
        }
        else {
            return "F";//default grade for scores bellow 30
        }
    }

    //DisplayStudentInfo: function: display both students information in a set format
    public static void DisplayStudentInfo(String name1, int StudentNumber1, int score1, String name2, int StudentNumber2, int score2){
        System.out.println("\nHere is the detail info...\nName\t\t\tStudent Number\t\t\tScore(Letter Grade)\n---------------------------------------------------------------");//title for the information displayed
        System.out.printf("%s\t\t%d\t\t\t%d (Letter Grade: %s)",name1, StudentNumber1, score1, getLetterGrade(score1));//student1 info
        System.out.printf("\n%s\t\t%d\t\t\t%d (Letter Grade: %s)\n---------------------------------------------------------------",name2, StudentNumber2, score2, getLetterGrade(score2));//student2 info
    }

    //ComareGrades: function: compare student1 and student2 grades
    public static int CompareGrades(int s1, int s2){
        if (s1>s2){
            return 1;//if student1 has highter score
        }
        else if (s1<s2){
            return -1;//if student2 has highter score
        }
        else {
            return 0;//if scores are of equal value
        }
    }
}