package Q1;  // Package declaration

import java.util.Scanner;  // Import Scanner class for input (though not used in this code)

public class Student {  // Declaring the Student class

    private String name;  // Private member variable for student's name
    private int studentNumber;  // Private member variable for student's number
    private int score;  // Private member variable for student's score

    public Student(){  // Default constructor
        name = "Ron Weasley";  // Setting default name
        studentNumber = 251777333;  // Setting default student number
        score = 100;  // Setting default score
    }

    public Student(String nm, int sn, int sc){  // Constructor with parameters
        name = nm;  // Assigning the parameter value to the name
        studentNumber = sn;  // Assigning the parameter value to studentNumber
        score = sc;  // Assigning the parameter value to score
    }

    public void printInfo(){  // Method to print student's information
        System.out.printf("%-20s %-20s %-3d (Letter Grade: %s)\n", name, studentNumber, score, getLetterGrade());
        // Prints the name, student number, score and letter grade in a formatted way
    }

    public String getName(){  // Getter method for name
        return name;  // Return student's name
    }

    public int getScore(){  // Getter method for score
        return score;  // Return student's score
    }

    public void setName(String nm){  // Setter method for name
        name = nm;  // Set the student's name
    }

    public void setStudentNumber(int sn){  // Setter method for student number
        studentNumber = sn;  // Set the student's student number
    }

    public void setScore(int sc){  // Setter method for score
        score = sc;  // Set the student's score
    }

    public String getLetterGrade(){  // Method to determine the letter grade based on score
        if (score>=90){  // Check if score is greater than or equal to 90
            return "A+";  // Return A+ if score is 90 or above
        }
        else if (score>=80){  // Check if score is greater than or equal to 80
            return "A-";  // Return A- if score is between 80 and 89
        }
        else if (score>=70){  // Check if score is greater than or equal to 70
            return "B+";  // Return B+ if score is between 70 and 79
        }
        else if (score>=60){  // Check if score is greater than or equal to 60
            return "B-";  // Return B- if score is between 60 and 69
        }
        else if (score>=50){  // Check if score is greater than or equal to 50
            return "C+";  // Return C+ if score is between 50 and 59
        }
        else if (score>=40){  // Check if score is greater than or equal to 40
            return "C-";  // Return C- if score is between 40 and 49
        }
        else if (score>=30){  // Check if score is greater than or equal to 30
            return "D";  // Return D if score is between 30 and 39
        }
        else {  // If score is less than 30
            return "F";  // Return F if score is below 30 (fail)
        }
    }
}
