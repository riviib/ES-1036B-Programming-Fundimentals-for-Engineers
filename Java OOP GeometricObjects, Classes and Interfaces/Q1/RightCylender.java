package Q1;

import java.util.Scanner; // Importing Scanner for user input

// RightCylinder class extending Geometric3DObject and implementing VolumeOf3DObjectsInterface
class RightCylinder extends Geometric3DObject implements VolumeOf3DObjectsInterface {
    public RightCylinder() { super(); } // Default constructor
    public RightCylinder(double r, double h) { super(r, h); } // Parameterized constructor

    @Override
    public double getArea() { // Compute surface area of the cylinder
        return 2 * Math.PI * getR() * (getR() + getH());
    }

    @Override
    public double getVolume() { // Compute volume of the cylinder
        return Math.PI * getR() * getR() * getH();
    }

    @Override
    public String toString() { // Overriding toString method for formatted output
        return super.toString() + "\nCylinder's Volume: " + String.format("%.2f", getVolume()) + " cubic cm\nCylinder's surface area: " + String.format("%.2f", getArea()) + " sq. cm\n";
    }
}