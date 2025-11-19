
import java.util.*;

public class test {

    // Main method
    public static void main(String[] args) {

        // Create two comparable circles
        Circle1 circle1 = new Circle1(5);
        Circle1 circle2 = new Circle1(4);

        // Display the max circle
        Circle1 circle = (Circle1) GeometricObject1.compareTo(circle1, circle2);
        System.out.println("The max circle's radius is " + circle.getRadius());
        System.out.println(circle);
    }

    abstract class GeometricObject1 implements Comparable {

        // Implement it
        private int radius = 0;
        private String color = "";

        private GeometricObject1() {
        }

        private GeometricObject1(String color, boolean filled) {
            this.color = color;
        }

        public int compareTo(GeometricObject1 c1, GeometricObject1 c2) {
            if (c1.getRadius() < c2.getRadius()) {
                return c2.getRadius();
            } else {
                return c1.getRadius();
            }
        }

        public int getRadius() {
            return this.radius;
        }
    }

    // Circle.java: The circle class that extends GeometricObject
    class Circle1 extends GeometricObject1 {
        // add super clause

        // Implement it
        int radius = 0;

        public Circle1() {
        }

        public Circle1(int radius) {
            this.radius = radius;
        }

        @Override
        public int compareTo(GeometricObject1 c1, GeometricObject1 c2) {
            if (c1.getRadius() < c2.getRadius()) {
                System.out.print("The largest circle is Circle 2 with a value of: ");
                return c2.getRadius();
            } else {
                System.out.print("The largest circle is Circle 1 with a value of: ");
                return c1.getRadius();
            }
        }
    }
}
