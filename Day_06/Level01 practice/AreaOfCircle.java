import java.util.*;

public class AreaOfCircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle :");
        double radius = sc.nextDouble();

        // Create a object of area class
        Area circle = new Area(radius);

        // claculating area of circle
        double area = circle.areaOfCircle(radius);

        // Calculating circumference of circle
        double circumference = circle.circumference(radius);

        // disply result
        circle.display(area, circumference);

        sc.close();

    }
}

class Area {
    double radius;

    // constructor of Area class
    Area(double radius) {
        this.radius = radius;
    }

    // areaOfCircle function
    double areaOfCircle(double radius) {
        double area = 3.14 * radius * radius;

        return area;
    }

    double circumference(double radius) {

        return 2 * 3.14 * radius;
    }

    // disply result
    void display(double area, double circumference) {
        System.out.println("Area of circle is :" + area);
        System.out.println("circumference of circle is :" + circumference);
    }
}