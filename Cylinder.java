import java.lang.Math;
import java.util.Scanner;

public class Cylinder extends ThreeDShape {
    private double diameter;
    private double height;

    public Cylinder(String colour, double diameter, double height) {
        super("Cylinder", colour);

        this.diameter = diameter;
        this.height = height;
    }

    public Cylinder() {
        super("Cylinder", "Black");

        diameter = 0;
        height = 0;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double computeVolume() {
        return ((Math.PI) * ((diameter / 2) * (diameter / 2)) * height);
    }

    public double computeSurfaceArea() {
        return ((2 * (Math.PI) * (diameter / 2)) * ((diameter / 2) + height));
    }

    public String getDescription() {
        return ("The " + getColour() + " " + getName()
                + " has a volume of " + computeVolume() + " cm3 and a surface area of " + computeSurfaceArea()
                + " cm2.");
    }

    public void draw() {

    }

    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder("Blue", 20, 25);

        System.out.println(cylinder1.getDescription());

        System.out.println();

    }

}