import java.util.Scanner;

// User-defined exception
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class AverageCalculator {

    // Method to calculate average
    static double calculateAverage(int n, Scanner sc) throws NegativeNumberException {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();

            if (num < 0) {
                throw new NegativeNumberException("Negative number entered: " + num);
            }

            sum += num;
        }

        return (double) sum / n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter value of N: ");
            int n = sc.nextInt();

            double avg = calculateAverage(n, sc);
            System.out.println("Average = " + avg);

        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}