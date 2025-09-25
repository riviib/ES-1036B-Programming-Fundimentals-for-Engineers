package Q1;

import java.util.Scanner; // Importing Scanner for user input

// Driver class to execute the program
public class DriverForAreaAndVolRivka {
    public static Scanner input = new Scanner(System.in); // Scanner for user input

    public static void populateArrays(Geometric3DObject[] x, int y) { // Populates the array with objects
        for (int i = 0; i < x.length; i++) {
            double r = 2 + Math.random(); // 2 <= r < 3 (random radius)
            double h = 4 + Math.random() * 3; // 4 <= h < 7 (random height)
            x[i] = (y == 1) ? new RightCylinder(r, h) : new RightCircularCone(r, h); // Assigns objects based on type
        }
    }

    public static void printArrays(Geometric3DObject[] x, int y) { // Prints object details
        for (int i = 0; i < x.length; i++) {
            System.out.println((y == 1 ? "Cylinder" : "Cone") + " " + (i + 1) + ":");
            System.out.println("-------------");
            System.out.println(x[i]); // Calls toString method of respective object
        }
    }

    public static double maxVolume(Geometric3DObject[] x) { // Finds maximum volume among objects
        double max = 0;
        for (Geometric3DObject obj : x) {
            double volume = ((VolumeOf3DObjectsInterface) obj).getVolume(); // Get volume
            if (volume > max) max = volume; // Update max volume if larger found
        }
        return max;
    }

    public static void main(String[] args) { // Main method
        System.out.println("****************************************************");
        System.out.println("Full Name: .......");
        System.out.println("Lab Exercise: 8, Question: 2");
        System.out.println("Program Description: Tests mathematical methods created by an imported class\n" + "(MyMethod)");
        System.out.println("****************************************************");

        System.out.print("How many Cylindrical objects you need to measure: ");
        int nCylinders = input.nextInt(); // Read number of cylinders
        Geometric3DObject[] cylinders = new Geometric3DObject[nCylinders]; // Create array for cylinders
        populateArrays(cylinders, 1); // Populate array with cylinder objects
        printArrays(cylinders, 1); // Print cylinder details
        System.out.println("The cylinder with the maximum volume is " + String.format("%.2f", maxVolume(cylinders)) + " cubic cm");
        System.out.println("=====================================================");

        System.out.print("How many Conical objects you need to measure: ");
        int nCones = input.nextInt(); // Read number of cones
        Geometric3DObject[] cones = new Geometric3DObject[nCones]; // Create array for cones
        populateArrays(cones, 2); // Populate array with cone objects
        printArrays(cones, 2); // Print cone details
        System.out.println("The cone with the maximum volume is " + String.format("%.2f", maxVolume(cones)) + " cubic cm");

        System.out.println("*** Signing off from Question 2 – Rivka :) ***"); // Exit message
    }
}
