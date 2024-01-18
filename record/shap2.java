import java.io.*;
import java.util.*;

interface Shape {
    void calculateArea();
}

class Rectangle implements Shape {
    private int length;
    private int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle implements Shape {
    private int base;
    private int height;

    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle implements Shape {
    private int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class shap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of Rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter breadth of Rectangle: ");
        int breadth = scanner.nextInt();
        Shape rectangle = new Rectangle(length, breadth);
        rectangle.calculateArea();

        System.out.print("Enter base of Triangle: ");
        int base = scanner.nextInt();
        System.out.print("Enter height of Triangle: ");
        int height = scanner.nextInt();
        Shape triangle = new Triangle(base, height);
        triangle.calculateArea();

        System.out.print("Enter radius of Circle: ");
        int radius = scanner.nextInt();
        Shape circle = new Circle(radius);
        circle.calculateArea();
    }
}
