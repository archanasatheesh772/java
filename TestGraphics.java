import Graphics.*;
import java.util.Scanner;

public class TestGraphics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Rectangle");
            System.out.println("2. Triangle");
            System.out.println("3. Square");
            System.out.println("4. Circle");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter length and breadth: ");
                    double l = sc.nextDouble();
                    double b = sc.nextDouble();
                    Rectangle r = new Rectangle(l, b);
                    System.out.println("Area = " + r.area());
                    break;

                case 2:
                    System.out.print("Enter base and height: ");
                    double base = sc.nextDouble();
                    double height = sc.nextDouble();
                    Triangle t = new Triangle(base, height);
                    System.out.println("Area = " + t.area());
                    break;

                case 3:
                    System.out.print("Enter side: ");
                    double s = sc.nextDouble();
                    Square sq = new Square(s);
                    System.out.println("Area = " + sq.area());
                    break;

                case 4:
                    System.out.print("Enter radius: ");
                    double rad = sc.nextDouble();
                    Circle c = new Circle(rad);
                    System.out.println("Area = " + c.area());
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}