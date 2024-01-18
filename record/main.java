import java.io.*;
import java.util.*;

abstract class Shape {
    abstract void printArea();
}

class Rectangle extends Shape {
    private int length;
    private int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void printArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    private int base;
    private int height;

    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    void printArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape {
    private int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    void printArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of Rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter breadth of Rectangle: ");
        int breadth = scanner.nextInt();
        Rectangle rectangle = new Rectangle(length, breadth);
        rectangle.printArea();

        System.out.print("Enter base of Triangle: ");
        int base = scanner.nextInt();
        System.out.print("Enter height of Triangle: ");
        int height = scanner.nextInt();
        Triangle triangle = new Triangle(base, height);
        triangle.printArea();

        System.out.print("Enter radius of Circle: ");
        int radius = scanner.nextInt();
        Circle circle = new Circle(radius);
        circle.printArea();
    }
}
