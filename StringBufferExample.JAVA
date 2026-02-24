import java.util.Scanner;

public class StringBufferExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read initial string from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create StringBuffer object
        StringBuffer sb = new StringBuffer(input);

        // i. Check capacity
        System.out.println("Capacity of StringBuffer: " + sb.capacity());

        // ii. Reverse and convert to uppercase
        sb.reverse();
        String reversedUpper = sb.toString().toUpperCase();
        System.out.println("Reversed and Uppercase String: " + reversedUpper);

        // iii. Read another string and append
        System.out.print("Enter another string to append: ");
        String secondInput = sc.nextLine();

        sb.append(secondInput);
        System.out.println("Final String after appending: " + sb);

        sc.close();
    }
}