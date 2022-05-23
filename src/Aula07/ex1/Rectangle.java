package Aula07.ex1;

public class Rectangle extends Forma {
    private double width, height;
    

    public Rectangle(double width, double height, String color) {
        assert valid(width, height);
        this.width = width;
        this.height = height;
        this.setColor(color);
    }

    public boolean valid(double width, double height) {
        return width > 0 && height > 0;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }


    public void setRectangle(double width, double height) {
        this.width = width;
        this.height = height;
        assert valid(width, height);
    }

    public boolean equals(Rectangle rectangle) {
        return this.width == rectangle.getWidth() && this.height == rectangle.getHeight();
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    public String toString() {
        return "Rectangle: " + this.width + " " + this.height + " and color: " + this.getColor();
    }

}
