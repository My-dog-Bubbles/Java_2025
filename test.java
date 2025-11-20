
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
        private String color = "";
        private boolean filled;
        private Date dateCreated;

        private GeometricObject1() {
        }

        private GeometricObject1(String color, boolean filled) {
            this.color = color;
            this.filled = filled;
        }

        public abstract Circle1 compareTo(GeometricObject1 c1, GeometricObject1 c2);

        public String getColor() {
            return this.color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isFilled() {
            if (this.filled == true) {
                return true;
            } else {
                return false;
            }
        }

        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        public Date getDateCreated() {
            return this.dateCreated;
        }

        public String toString() {
            String output = "";
            return output;
        }

        public abstract double getArea();

        public abstract double getPerimeter();
    }

    // Circle.java: The circle class that extends GeometricObject
    class Circle1 extends GeometricObject1 {
        // add super clause

        // Implement it
        private double radius = 0;
        private String color = "";
        private boolean filled;

        public Circle1() {
        }

        public Circle1(double radius) {
            this.radius = radius;
        }

        public Circle1(double radius, String color, boolean filled) {
            this.radius = radius;
            this.color = color;
            this.filled = filled;
        }

        public double getRadius() {
            return this.radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getDiameter() {
            double diameter = this.radius * 2;
            return diameter;
        }

        @Override
        public Circle1 compareTo(GeometricObject1 c1, GeometricObject1 c2) {

            if (((Circle1) c1).getRadius() < ((Circle1) c2).getRadius()) {
                System.out.print("The largest circle is Circle 2 with a value of: ");
                return (Circle1) c2;
            } else {
                System.out.print("The largest circle is Circle 1 with a value of: ");
                return (Circle1) c1;
            }
        }
    }
}
