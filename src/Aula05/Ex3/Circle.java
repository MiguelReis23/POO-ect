package Aula05.Ex3;

public class Circle {
    private double radius;

    public Circle(double radius) {
        assert valid(radius);
        this.radius = radius;
    }

    public boolean valid(double radius) {
        return radius > 0;
    }

    public double getradius() {
        return this.radius;
    }

    public void setradius(double radius) {
        assert valid(radius);
        this.radius = radius;
    }

    public boolean equals(Circle circle) {
        return this.radius == circle.getradius();
    }

    public String toString() {
        return "Circle with radius: " + this.radius;

    }

    public double Area() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double Perimeter() {
        return 2 * Math.PI * this.radius;
    }

}
