/*
Name: Angel Carmichael
Class: Period 2
Created: 10/29/25
Last Modified: 10/29/2025
Purpose:  Design a class named Triangle that extends GeometricObject. The class
 contain. The code creates a Triangle object with sides 1, 1.5, 1, color
 yellow and filled true, and displays the area, perimeter, color, and whether filled
 or not.
 */
public class Exercise11_01 {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(1, 1.5, 1);
        triangle.setColor("yellow");
        triangle.setFilled(true);
        System.out.println(triangle);
        System.out.println("The area is " + triangle.getArea());
        System.out.println("The perimeter is " + triangle.getPerimeter());
        System.out.println(triangle);
    }
}

class GeometricObject {

    // Copy it from the book
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /**
     * Construct a default geometric object
     */
    public GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /**
     * Construct a geometric object with the specified color and filled value
     */
    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /**
     * Return color
     */
    public String getColor() {
        return color;
    }

    /**
     * Set a new color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Return filled. Since filled is boolean, its get method is named isFilled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * Set a new filled
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Get dateCreated
     */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /**
     * Return a string representation of this object
     */
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

}

class Triangle extends GeometricObject {

    // Implement it
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    private Triangle() {
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.side1 = sideA;
        this.side2 = sideB;
        this.side3 = sideC;
    }

    public double getA() {
        return this.side1;
    }

    public double getB() {
        return this.side2;
    }

    public double getC() {
        return this.side3;
    }

    // uses the semi-perementer and the equation from that to get the area
    public double getArea() {
        double semiPeri = (this.getA() + this.getB() + this.getC()) / 2;
        double area = Math.sqrt(semiPeri * (semiPeri - this.getA()) * (semiPeri - this.getB()) * (semiPeri - this.getC()));
        return area;
    }

    public double getPerimeter() {
        double perimeter = this.getA() + this.getB() + this.getC();
        return perimeter;
    }

    public String toString() {
        String output = (String) ("Triangle: side1 = " + this.getA() + " side2 = " + this.getB() + " side3 = " + this.getC());
        return output;
    }
}
