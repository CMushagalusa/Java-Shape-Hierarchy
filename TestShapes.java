import java.util.Scanner;

public class TestShapes {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        TwoDShape circle = new Circle("white", 10);
        Cylinder cylinder = new Cylinder("Blue", 20, 30);

        Rectangle rectangle = new Rectangle(20, 8, "Black");
        Triangle triangle = new Triangle(15, 12);

        TwoDShape[] shapes = { circle, rectangle, triangle };
        System.out.println();

        for (int s = 0; s < shapes.length; s++) {

            if (shapes[s] == circle) {
                shapes[s].draw();
            }
            System.out.println(" ");

            if (shapes[s] == rectangle) {
                System.out.println(shapes[s].getDescription());
                System.out.println();
                shapes[s].draw();
            }

            System.out.println();

            if (shapes[s] == triangle) {
                System.out.println(shapes[s].getDescription());
                System.out.println();
                shapes[s].draw();
            }
        }

        System.out.println();
        cylinder.computeSurfaceArea();
        cylinder.computeVolume();
        System.out.println(cylinder.getDescription());

    }

}