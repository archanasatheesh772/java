import java.util.Scanner;
class Complexaddition
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter real parts of first complex number:");
        int real1 = sc.nextInt();
        System.out.print("enter imaginary part of first complex number: ");
        int img1 = sc.nextInt();
        System.out.print("enter real part of second complex number:");
        int real2 = sc.nextInt();
        System.out.print("enter imaginary parts of second complex number:");
        int img2 = sc.nextInt();
        int realsum = real1 + real2;
        int imgsum = img1 + img2;
        System.out.print("sum of complex number = " + realsum+ "+" +imgsum+ "i");
    }   
        
 }





