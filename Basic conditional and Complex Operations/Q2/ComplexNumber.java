package Q2;

import java.util.*;
import Q1.StudentGradesByRivka;  // Importing the header/footer methods

public class ComplexNumber {  // ComplexNumber class
    private double real;
    private double imaginary;

    public ComplexNumber() {  // Default constructor assigns zero values
        this.real = 0;
        this.imaginary = 0;
    }

    public ComplexNumber(double re, double im) {  // Constructor with arguments
        this.real = re;
        this.imaginary = im;
    }

    public double getReal() { return real; }  // Getter for real part
    public double getImaginary() { return imaginary; }  // Getter for imaginary part

    public double getMagnitude() {  // Magnitude calculation
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imaginary, 2));
    }

    public double getAngle() {  // Angle calculation in degrees
        return Math.toDegrees(Math.atan2(imaginary, real));
    }

    public void displayRecForm() {  // Display complex number in a + bi format
        System.out.printf("%.2f %c %.2fi\n", real, (imaginary >= 0) ? '+' : '-', Math.abs(imaginary));
    }
}

