import java.lang.Math;
import java.util.Scanner;

public class Triangle extends Polygon {

    private double height;
    private double base;

    public Triangle(double base, double height) {

        super("Triangle", "Blue", 3, false);

        this.base = base;
        this.height = height;
    }

    public String getDescription() {
        return ("The " + getColour() + " " + getName() + " with a base of " + base + " cm and a height of " + height
                + " cm. \nIt has an area of " + computeArea() + "cm2.");
    }

    public double computeArea() {
        return ((base * height) / 2);
    }

    public void draw() {
        System.out.println("The triangle looks like this:");
        for (int b = 0; b < base; b++) {

            for (int s = 0; s < (base - b); s++) {
                System.out.print(" ");
            }

            for (int d = 0; d < ((2 * b) - 1); d++) {
                System.out.print(".");
            }

            System.out.println(" ");
        }
    }
}