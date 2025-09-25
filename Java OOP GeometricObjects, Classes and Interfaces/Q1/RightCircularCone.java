package Q1;

import java.util.Scanner; // Importing Scanner for user input

// RightCircularCone class extending Geometric3DObject and implementing VolumeOf3DObjectsInterface
class RightCircularCone extends Geometric3DObject implements VolumeOf3DObjectsInterface {
    public RightCircularCone() { super(); } // Default constructor
    public RightCircularCone(double r, double h) { super(r, h); } // Parameterized constructor

    @Override
    public double getArea() { // Compute surface area of the cone
        return Math.PI * getR() * (getR() + Math.sqrt(getH() * getH() + getR() * getR()));
    }

    @Override
    public double getVolume() { // Compute volume of the cone
        return (Math.PI * getR() * getR() * getH()) / 3;
    }

    @Override
    public String toString() { // Overriding toString method for formatted output
        return super.toString() + "\nCone's Volume: " + String.format("%.2f", getVolume()) + " cubic cm\nCone's surface area: " + String.format("%.2f", getArea()) + " sq. cm\n";
    }
}