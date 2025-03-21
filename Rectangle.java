import java.util.Scanner;

public class Rectangle extends Polygon {

    private int width;
    private int large;

    public Rectangle(int large, int width, String colour) {

        super("Rectangle", colour, 4, false);

        this.large = large;
        this.width = width;
    }

    public Rectangle() {
        super("Rectangle", "Red", 4, false);

        large = 0;
        width = 0;
    }

    public void setLarge(int large) {
        this.large = large;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLarge() {
        return large;
    }

    public int getWidth() {
        return width;
    }

    public void setMeasurements(int large, int width) {
        setLarge(large);
        setWidth(width);
    }

    public String getDescription() {
        return ("The " + getColour() + " " + getName()
                + " has a width of " + width + " cm and a length of " + large + " cm. \nIt has an area of "
                + computeArea() + " cm2 and a perimeter of " + computePerimeter() + " cm.");
    }

    public double computeArea() {
        return (width * large);
    }

    public double computePerimeter() {
        return (2 * (width + large));
    }

    public void draw() {
        System.out.println("The rectangle looks like this:");
        String rectangle[][] = new String[width][large];
        for (int l = 0; l < rectangle.length; l++) {
            for (int w = 0; w < rectangle[l].length; w++) {
                rectangle[l][w] = ".";
                if ((l != 0) && (w != 0) && (l != (width - 1)) && (w != (large - 1))) {
                    rectangle[l][w] = " ";
                }
                System.out.print(rectangle[l][w] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner dimension = new Scanner(System.in);
        int largest, smallest;

        Rectangle rectangle0 = new Rectangle();
        Rectangle rectangle1 = new Rectangle(15, 10, "Blue");

        System.out.println("How long is the largest side?");
        System.out.print("Type it here: ");
        largest = dimension.nextInt();
        rectangle0.setLarge(largest);

        System.out.println();

        System.out.println("How long is the smallest side?");
        System.out.print("Type it here: ");
        smallest = dimension.nextInt();
        rectangle0.setWidth(smallest);

        System.out.println();

        System.out.println(
                "The area of the " + rectangle1.getDescription() + " is: " + rectangle1.computeArea() + " cm2.");
        System.out.println("The perimeter of the " + rectangle1.getDescription() + " is: "
                + rectangle1.computePerimeter() + " cm.");

        System.out.println();
        rectangle1.draw();
        System.out.println();

        System.out.println(
                "The area of the " + rectangle0.getDescription() + " is: " + rectangle0.computeArea() + " cm2.");
        System.out.println("The perimeter of the " + rectangle0.getDescription() + " is: "
                + rectangle0.computePerimeter() + " cm.");

        System.out.println();
        rectangle0.draw();
        System.out.println();
    }

}