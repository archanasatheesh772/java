import java.util.Scanner;

class Processor {
    int cores;
    String manufacturer;
}

class RAM {
    int size;
}

class CPU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Processor p = new Processor();
        RAM r = new RAM();

        System.out.print("Enter cores: ");
        p.cores = sc.nextInt();

        System.out.print("Enter manufacturer: ");
        p.manufacturer = sc.next();

        System.out.print("Enter RAM size: ");
        r.size = sc.nextInt();

        System.out.println("\nCores: " + p.cores);
        System.out.println("Manufacturer: " + p.manufacturer);
        System.out.println("RAM Size: " + r.size + "GB");

        sc.close();
    }
}