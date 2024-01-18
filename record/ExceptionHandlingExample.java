import java.io.*;
import java.util.*;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            int[] arr = new int[5];
            arr[10] = 50;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero occurred.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Array index out of bounds.");
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
