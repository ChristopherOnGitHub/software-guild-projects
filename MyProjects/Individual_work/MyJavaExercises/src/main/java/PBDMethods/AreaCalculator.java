package PBDMethods;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class AreaCalculator {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int userShape;
        double base;
        double height;

        do {
            System.out.println("1) Triangle");
            System.out.println("2) Rectangle");
            System.out.println("3) Square");
            System.out.println("4) Circle");
            System.out.println("5) Quit");
            do {
                System.out.println("Which shape? ");
                userShape = userInput.nextInt();
            } while (userShape > 5 || userShape < 1);

            switch (userShape) {
                case 1:
                    System.out.println("What is the 'base' of the shape?");
                    base = userInput.nextDouble();
                    System.out.println("What is the height of the shape?");
                    height = userInput.nextDouble();
                    System.out.println("The area is: " + areaOfShape(base, height) / 2);
                    break;

                case 2:
                    System.out.println("What is the 'base' of the shape?");
                    base = userInput.nextDouble();
                    System.out.println("What is the height of the shape?");
                    height = userInput.nextDouble();
                    System.out.println("The area is: " + areaOfShape(base, height));
                    break;

                case 3:
                    System.out.println("What is the 'base' of the shape?");
                    base = userInput.nextDouble();
                    height = base;
                    System.out.println("The area is: " + areaOfShape(base, height));
                    break;
                case 4:
                    System.out.println("What is the radius of the circle?");
                    double radius = userInput.nextDouble();
                    double circleArea = Math.PI * radius * radius;
                    System.out.println(circleArea);
                default:
                    System.out.println("  ");

            }
        } while (userShape != 5);
    }

    public static double areaOfShape(double base, double height) {
        double area;
        area = base * height;
        return area;
    }

}
