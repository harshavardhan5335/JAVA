import java.io.*;
import java.util.*;

class exceptiondemo {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        int c = 0;
        int d[] = { 1, 2, 3, 4, 5 };

        try {
            c = a / b;
            System.out.println(c);
            System.out.println("Done with division!");
            System.out.println(d[6]);
        }

        catch (ArithmeticException neil) {
            System.out.println(neil);
            System.out.println("Dont put zero bruhhhh ");
        }

        catch (ArrayIndexOutOfBoundsException bala) {
            System.out.println("Invalid index , Out of bound");
        }
        /*
         * catch(ArithmeticException|ArrayIndexOutOfBoundsException neil69)
         * {
         * System.out.println("Rendu exception ku oru catch");
         * }
         */
        finally {
            System.out.println("Exceptions handled Successfully");
        }
    }
}
/*
 * Excepiton Handling
 * 
 * 1) When diivde by zero
 * 
 */
