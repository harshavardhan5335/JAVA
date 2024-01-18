public class Arithmetic {
    public void multiply(int a, int b) {
        int result = a * b;
        System.out.println("Product of two integers: " + result);
    }

    public void multiply(int a, int b, int c) {
        int result = a * b * c;
        System.out.println("Product of three integers: " + result);
    }

    public void multiply(double a, double b) {
        double result = a * b;
        System.out.println("Product of two doubles: " + result);
    }

    public void multiply(int a, double b) {
        double result = a * b;
        System.out.println("Product of int and double: " + result);
    }

    public void multiply(double a, int b) {
        double result = a * b;
        System.out.println("Product of double and int: " + result);
    }

    public void multiply(int a, double b, int c) {
        double result = a * b * c;
        System.out.println("Product of int, double, and int: " + result);
    }

    public void multiply(double a, int b, double c) {
        double result = a * b * c;
        System.out.println("Product of double, int, and double: " + result);
    }

    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        arithmetic.multiply(5, 10);
        arithmetic.multiply(2, 4, 6);
        arithmetic.multiply(3.5, 2.0);
        arithmetic.multiply(4, 3.7);
        arithmetic.multiply(2.5, 6);
        arithmetic.multiply(2, 3.5, 4);
        arithmetic.multiply(2.0, 5, 3.0);
    }
}
