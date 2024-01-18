import java.util.ArrayList;
import java.util.List;

// Define the Polynomial interface
interface hi {
    double evaluate(double x);
}

// Define the Monomial class that implements the Polynomial interface
class Monomial implements hi {
    private double coefficient;
    private int degree;

    public Monomial(double coefficient, int degree) {
        this.coefficient = coefficient;
        this.degree = degree;
    }

    @Override
    public double evaluate(double x) {
        return coefficient * Math.pow(x, degree);
    }
}

// Define the Polygon class that calculates the area of a polygon
class Polygon {
    private List<Polynomial> sides;

    public Polygon(List<Polynomial> sides) {
        this.sides = sides;
    }

    public double calculateArea(double x) {
        if (sides.size() < 3) {
            return 0;
        }

        double area = 0;
        for (int i = 0; i < sides.size(); i++) {
            int j = (i + 1) % sides.size();
            double side_i = sides.get(i).evaluate(x);
            double side_j = sides.get(j).evaluate(x);
            area += (side_i + side_j) * (x / 2);
        }
        return Math.abs(area);
    }
}

public class Polynomial {
    public static void main(String[] args) {
        // Define a monomial x^2
        Monomial monomialX2 = new Monomial(1, 2);

        // Define another monomial 2x
        Monomial monomial2x = new Monomial(2, 1);

        // Create a list of polynomial sides
        List<Polynomial> sides = new ArrayList<>();
        sides.add(monomialX2);
        sides.add(monomial2x);

        // Create a polygon with the specified sides
        Polygon polygon = new Polygon(sides);

        // Calculate the area of the polygon at x = 3
        double xValue = 3.0;
        double area = polygon.calculateArea(xValue);
        System.out.println("The area of the polygon at x = " + xValue + " is " + area);
    }
}
