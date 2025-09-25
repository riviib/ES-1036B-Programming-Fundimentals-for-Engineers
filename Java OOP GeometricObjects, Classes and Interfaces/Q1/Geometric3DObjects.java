package Q1;
// Package declaration

import java.util.Scanner; // Importing Scanner for user input

// Abstract class representing a 3D geometric object
abstract class Geometric3DObject {
    private double r, h; // Private variables for radius and height

    protected Geometric3DObject() {} // Default constructor

    protected Geometric3DObject(double r, double h) { // Parameterized constructor
        this.r = r;
        this.h = h;
    }

    public double getR() { return r; } // Getter for radius
    public double getH() { return h; } // Getter for height

    public abstract double getArea(); // Abstract method to compute area

    @Override
    public String toString() { // Overriding toString method to return formatted object details
        return "Given: Radius = " + r + " cm, Height = " + h + " cm";
    }
}
// Interface for computing volume of 3D objects
interface VolumeOf3DObjectsInterface {
    double getVolume(); // Method to compute volume
}

