package Aula07.ex1;

public class Circle extends Forma {
    private double radius;
    

    public Circle(double radius, String color) {
        assert valid(radius);
        this.radius = radius;
        this.setColor(color);
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
        return "Circle with radius: " + this.radius + " and color: " + this.getColor();

    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

}
