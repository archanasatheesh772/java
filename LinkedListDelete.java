import java.util.Scanner;

// User-defined exception
class EmptyListException extends Exception {
    public EmptyListException(String message) {
        super(message);
    }
}

// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListDelete {

    static Node head = null;

    // Insert elements
    static void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Delete entire list
    static void deleteList() throws EmptyListException {
        if (head == null) {
            throw new EmptyListException("List is already empty!");
        }

        Node current = head;

        while (current != null) {
            Node temp = current;
            current = current.next;
            temp.next = null; // disconnect node
        }

        head = null;
    }

    // Display list
    static void display() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.print("Enter element " + i + ": ");
                int value = sc.nextInt();
                insert(value);
            }

            System.out.println("Original List:");
            display();

            deleteList();

            System.out.println("After deleting all elements:");
            display();

        } catch (EmptyListException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}