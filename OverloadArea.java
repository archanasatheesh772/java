import java.util.Scanner;

class Area {

    // Area of Circle
    double calculateArea(double radius) {
        return 3.14159 * radius * radius;
    }

    // Area of Rectangle
    double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    // Area of Triangle
    double calculateArea(float base, float height) {
        return 0.5 * base * height;
    }
}

public class OverloadArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area obj = new Area();

        System.out.println("Choose Shape:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();
                System.out.println("Area of Circle = " + obj.calculateArea(radius));
                break;

            case 2:
                System.out.print("Enter length: ");
                double length = sc.nextDouble();
                System.out.print("Enter breadth: ");
                double breadth = sc.nextDouble();
                System.out.println("Area of Rectangle = " + obj.calculateArea(length, breadth));
                break;

            case 3:
                System.out.print("Enter base: ");
                float base = sc.nextFloat();
                System.out.print("Enter height: ");
                float height = sc.nextFloat();
                System.out.println("Area of Triangle = " + obj.calculateArea(base, height));
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}